package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.ApplicationData;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnUsersImpl extends SpotOnLoginPage implements Feature {

    ApplicationData ad = new ApplicationData();
    private ISpotOnSignInPage homePage;

    @Override
    public void init() {

        homePage = openSpotOnPage();
    }

    @Override
    public void execute() {
        try {

            homePage.enterEmail(ad.PUBLISHERS_USERNAME())
                    .enterPassword(ad.PASSWORD())
                    .clickOnLoginButton()
                    .clickOnUsersBtn()
                    .verifyUsersLabel()
                    .clickOnInviteUserBtn()
                    .enterEmail(ad.EMAIL_ADDRESS())
                    .enterFirstName(ad.FIRST_NAME())
                    .enterLastName(ad.LAST_NAME())
                    .selectGroup()
                    .clickOnInviteBtn()
            ;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}