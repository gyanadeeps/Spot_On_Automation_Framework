package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.ApplicationData;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnClientsImpl  extends SpotOnLoginPage implements Feature
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
                    .clickOnLoginButton().clickOnClientsBtn()
                    .verifyClientsPage()
                    .clickNewClientsBtn()
                    .enterCompanyName(ad.COMPANY_NAME())
                    .enterDescription(ad.DESCRIPTION_CLIENTS())
                    .enterContactName(ad.CONTACT_NAME())
                    .enterContactPhone(ad.CONTACT_PHONE())
                    .enterContactEmail(ad.CONTACT_EMAIL())
                    .enterStreetAddress(ad.STREET_ADDRESS())
                    .enterCity(ad.CITY_CLIENT())
                    .selectState()
                    .clickSaveBtn();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
