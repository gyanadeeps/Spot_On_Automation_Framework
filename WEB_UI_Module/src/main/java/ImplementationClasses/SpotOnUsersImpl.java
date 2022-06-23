package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnUsersImpl extends SpotOnLoginPage implements Feature
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

            homePage.enterEmail(SystemProperties.PUBLISHERS_USERNAME)
                    .enterPassword(SystemProperties.PASSWORD)
                    .clickOnLoginButton()
                    .clickOnUsersBtn()
                    .verifyUsersLabel()
                    .clickOnInviteUserBtn()
                    .enterEmail(SystemProperties.EMAIL_USERS)
                    .enterFirstName(SystemProperties.FIRST_NAME)
                    .enterLastName(SystemProperties.LAST_NAME)
                    .selectGroup()
                    .clickOnInviteBtn()
            ;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}