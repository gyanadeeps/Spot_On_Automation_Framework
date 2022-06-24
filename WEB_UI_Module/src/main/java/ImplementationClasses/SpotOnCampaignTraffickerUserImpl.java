package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnCampaignTraffickerUserImpl extends SpotOnLoginPage implements Feature
{
    private ISpotOnSignInPage homePage;
    @Override
    public void init()
    {
        homePage = openSpotOnPage();
    }

    @Override
    public void execute() {
        try {

            homePage.enterEmail(SystemProperties.TRAFFICKER_USERNAME)
                    .enterPassword(SystemProperties.PASSWORD)
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
