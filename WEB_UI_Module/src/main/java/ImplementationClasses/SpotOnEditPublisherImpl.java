package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnEditPublisherImpl extends SpotOnLoginPage implements Feature
{
    private ISpotOnSignInPage homePage;
    @Override
    public void init()
    {
        homePage = openSpotOnPage();
    }

    @Override
    public void execute() {
        try {

            homePage.enterEmail(SystemProperties.USERNAME)
                    .enterPassword(SystemProperties.PASSWORD)
                    .clickOnLoginButton()
                    .clickOnPublishersBtn()
                    .verifyPublisherPage()
                    .selectPublisher()
                    .clickAddNewBtn()
                    .enterUnitName(SystemProperties.UNIT_NAME)
                    .selectSize(SystemProperties.SIZE_INDEX)
                    .selectPlacement(SystemProperties.PLACEMENT_INDEX)
                    .selectUnitPrice()
                    .enterCost(SystemProperties.UNIT_COST)
                    .enterAvailability(SystemProperties.UNIT_AVAILABILITY)
                    .clickUpdateBtn();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
