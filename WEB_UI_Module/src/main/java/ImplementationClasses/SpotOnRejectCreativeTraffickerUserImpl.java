package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.ApplicationData;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnRejectCreativeTraffickerUserImpl extends SpotOnLoginPage implements Feature
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
                    .clickOnCreativeBtn()
                    .verifyCreativesPublisherPage()
                    .enterSearchKeyword(ad.SEARCH_KEY_CREATIVES())
                    .clickRejectBtn()
                    .enterRejectionReason(ad.REJECTION_REASON())
                    .clickSaveBtn();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}