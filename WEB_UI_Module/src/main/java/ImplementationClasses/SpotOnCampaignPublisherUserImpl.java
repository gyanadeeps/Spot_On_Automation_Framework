package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.ApplicationData;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnCampaignPublisherUserImpl extends SpotOnLoginPage implements Feature
{
    ApplicationData ad = new ApplicationData();
    private ISpotOnSignInPage homePage;
    @Override
    public void init()
    {
        homePage = openSpotOnPage();
    }

    @Override
    public void execute() {
        try {

            homePage.enterEmail(ad.PUBLISHERS_USERNAME())
                    .enterPassword(ad.PASSWORD())
                    .clickOnLoginButton()
                    .clickOnCampaignsBtn()
                    .verifyCampaignsLabel()
                    .selectCampaign()
                    .verifyUpdateButtonNotPresent();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
