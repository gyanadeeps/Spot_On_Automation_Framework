package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnCreativesPageCreatMgrImpl extends SpotOnLoginPage implements Feature {
    private ISpotOnSignInPage homePage;
    @Override
    public void init() {

        homePage = openSpotOnPage();
    }

    @Override
    public void execute() {
        try {

            homePage.enterEmail(SystemProperties.CREATIVE_MANAGER_USERNAME)
                    .enterPassword(SystemProperties.PASSWORD)
                    .clickOnLoginButton().clickOnCreativesBtn()
                    .verifyCreativesPage()
                    .clickNewCreativeBtn()
                    .enterCampaignAM(SystemProperties.CAMPAIGN_AM)
                    .enterNameCM(SystemProperties.CREATIVE_NAME_CM)
                    .enterClickTagURL(SystemProperties.WEB_URL)
                    .selectFormat()
                    .selectSize()
                    .selectFile()
                    .clickAddToQueueBtn()
            ;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}