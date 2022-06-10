package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnPublishersImpl extends SpotOnLoginPage implements Feature {
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
                    .clickOnLoginButton().clickOnPublishersButton()
                    .verifyPublisherPage()
                    .clickNewPublisherButton()
                    .enterPublisherName(SystemProperties.PUBLISHER_NAME)
                    .enterWebsiteURL(SystemProperties.WEB_URL)
                    .enterDescription(SystemProperties.DESCRIPTION_PUBLISHER)
                    .selectState()
                    .selectPublisherType()
                    .enterCity(SystemProperties.CITY)

                    //.enterMonthlyVisitors(SystemProperties.MONTHLY_VISITORS)
                    .clickAddNewBtn()
                    .enterUnitName(SystemProperties.UNIT_NAME)
                    .selectSize(SystemProperties.SIZE_INDEX)
                    .selectPlacement(SystemProperties.PLACEMENT_INDEX)
                    .selectUnitPrice()
                    .enterCost(SystemProperties.UNIT_COST)
                    .enterAvailability(SystemProperties.UNIT_AVAILABILITY)
                    .clickSaveButton();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
