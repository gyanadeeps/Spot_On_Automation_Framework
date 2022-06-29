package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.ApplicationData;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnPublishersImpl extends SpotOnLoginPage implements Feature {

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
                    .clickOnLoginButton().clickOnPublishersButton()
                    .verifyPublisherPage()
                    .clickNewPublisherButton()
                    .enterPublisherName(ad.PUBLISHER_NAME())
                    .enterWebsiteURL(ad.WEB_URL())
                    .enterDescription(ad.DESCRIPTION_PUBLISHER())
                    .selectState()
                    .selectPublisherType()
                    .enterCity(ad.CITY())

                    //.enterMonthlyVisitors(SystemProperties.MONTHLY_VISITORS)
                    .clickAddNewBtn()
                    .enterUnitName(ad.UNIT_NAME())
                    .selectSize(ad.SIZE_INDEX())
                    .selectPlacement(ad.PLACEMENT_INDEX())
                    .selectUnitPrice()
                    .enterCost(ad.UNIT_COST())
                    .enterAvailability(ad.UNIT_AVAILABILITY())
                    .clickSaveButton();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
