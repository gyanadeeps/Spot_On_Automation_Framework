package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.ApplicationData;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnEditPublisherImpl extends SpotOnLoginPage implements Feature
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
                    .clickOnPublishersBtn()
                    .verifyPublisherPage()
                    .enterSearchKeyword(ad.EDIT_KEY_PUBLISHERS())
                    .selectPublisher()
                    .clickAddNewBtn()
                    .enterUnitName(ad.UNIT_NAME())
                    .selectSize(ad.SIZE_INDEX())
                    .selectPlacement(ad.PLACEMENT_INDEX())
                    .selectUnitPrice()
                    .enterCost(ad.UNIT_COST())
                    .enterAvailability(ad.UNIT_AVAILABILITY())
                    .clickUpdateBtn();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
