package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.ApplicationData;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnRejectCreativeServiceUserImpl extends SpotOnLoginPage implements Feature
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

            homePage.enterEmail(ad.USERNAME())
                    .enterPassword(ad.PASSWORD())
                    .clickOnLoginButton()
                    .clickOnCreativePublisherBtn()
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