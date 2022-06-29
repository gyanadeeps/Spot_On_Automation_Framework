package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.ApplicationData;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnCreativesPublisherPageImpl extends SpotOnLoginPage implements Feature
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
                    .clickOnCreativesPublisherBtn()
                    .verifyCreativesPublisherPage()
                    .enterSearchKeyword(ad.SEARCH_KEY_CREATIVES())
                    .clickPreviewBtn()
                    .clickApproveBtn();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}