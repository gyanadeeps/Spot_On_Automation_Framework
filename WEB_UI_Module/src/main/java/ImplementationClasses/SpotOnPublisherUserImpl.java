package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.ApplicationData;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnPublisherUserImpl extends SpotOnLoginPage implements Feature
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

            homePage.enterEmail(ad.PUBLISHERS_USERNAME())
                    .enterPassword(ad.PASSWORD())
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
