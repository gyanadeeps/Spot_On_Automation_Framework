package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnCreativesImpl extends SpotOnLoginPage implements Feature {
    private ISpotOnSignInPage homePage;
    @Override
    public void init() {

        homePage = openSpotOnPage();
    }

    @Override
    public void execute() {
        try {

            homePage.enterEmail(SystemProperties.USERNAME)
                    .enterPassword(SystemProperties.PASSWORD)
                    .clickOnLoginButton().clickOnCreativesBtn()
                    .verifyCreativesPage()
                    .clickNewCreativeBtn()
                    .enterCampaign(SystemProperties.CAMPAIGN)
                    .enterName(SystemProperties.CREATIVE_NAME)
                    .enterClickTagURL(SystemProperties.WEB_URL)
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
