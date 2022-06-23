package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnPublisherUserImpl extends SpotOnLoginPage implements Feature
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
                    .verifyPublisherProfile()
                    .verifyProposalsLink()
                    .verifyPaymentsLink()
                    .verifyClientsLink();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
