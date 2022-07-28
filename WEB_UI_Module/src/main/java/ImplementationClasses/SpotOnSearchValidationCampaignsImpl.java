package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.ApplicationData;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnSearchValidationCampaignsImpl extends SpotOnLoginPage implements Feature {

    ApplicationData ad = new ApplicationData();
    private ISpotOnSignInPage homePage;
    @Override
    public void init() {

        homePage = openSpotOnPage();
    }

    @Override
    public void execute() {
        try {

            homePage.enterEmail(ad.USERNAME())
                    .enterPassword(ad.PASSWORD())
                    .clickOnLoginButton()
                    .clickCampaignBtn()
                    .verifyCampaignPage()
                    .enterSearchKeyword(ad.SEARCH_VALIDATION_KEY())
                    .verifyCampaign()
                    ;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
