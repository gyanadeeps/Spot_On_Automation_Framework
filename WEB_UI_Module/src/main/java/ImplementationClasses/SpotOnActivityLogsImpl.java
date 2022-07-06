package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.ApplicationData;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnActivityLogsImpl extends SpotOnLoginPage implements Feature {

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
                    .clickOnLoginButton().clickOnPublisherButton()
                    .verifyPublisherPage()
                    .clickNewPublisherButton()
                    .enterPublisherName(ad.PUBLISHER_NAME())
                    .enterWebsiteURL(ad.WEB_URL())
                    .enterDescription(ad.DESCRIPTION_PUBLISHER())
                    .selectState()
                    .selectPublisherType()
                    .enterCity(ad.CITY())
                    .clickAddNewBtn()
                    .enterUnitName(ad.UNIT_NAME())
                    .selectSize(ad.SIZE_INDEX())
                    .selectPlacement(ad.PLACEMENT_INDEX())
                    .selectUnitPrice()
                    .enterCost(ad.UNIT_COST())
                    .enterAvailability(ad.UNIT_AVAILABILITY())
                    .clickSaveButton()
                    .clickActivityLogsBtn()
                    .verifyActivityLogs()
                    .enterEmail(ad.USER_EMAIL())
                    ;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
