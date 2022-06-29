package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.ApplicationData;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnCreativesPageCreatMgrImpl extends SpotOnLoginPage implements Feature {

    ApplicationData ad = new ApplicationData();
    private ISpotOnSignInPage homePage;
    @Override
    public void init() {

        homePage = openSpotOnPage();
    }

    @Override
    public void execute() {
        try {

            homePage.enterEmail(ad.CREATIVE_MANAGER_USERNAME())
                    .enterPassword(ad.PASSWORD())
                    .clickOnLoginButton().clickOnCreativesBtn()
                    .verifyCreativesPage()
                    .clickNewCreativeBtn()
                    .enterCampaignAM(ad.CAMPAIGN_AM())
                    .enterNameCM(ad.CREATIVE_NAME_CM())
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