package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.ApplicationData;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnCampaignTraffickerUserImpl extends SpotOnLoginPage implements Feature
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

            homePage.enterEmail(ad.TRAFFICKER_USERNAME())
                    .enterPassword(ad.PASSWORD())
                    .clickOnLoginButton()
                    .clickOnCampaignBtn()
                    .verifyCampaignLabel()
                    .selectCampaignValue()
                    .verifyUpdateBtnNotPresent()
                    .verifyCampaignNameDisabled()
                    .verifyDescriptionDisabled();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
