package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.ApplicationData;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnCreativesImpl extends SpotOnLoginPage implements Feature {

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
                    .clickOnCreativesBtn()
                    .verifyCreativesPage()
                    .clickNewCreativeBtn()
                    .enterCampaign(ad.CAMPAIGN())
                    .enterName(ad.CREATIVE_NAME())
                    .enterClickTagURL(ad.WEB_URL())
                    .selectFormat()
                    .selectSize()
                    .selectFile()
                    .clickAddToQueueBtn()
                    .clickSendCreativesForReviewBtn()
            ;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}
