package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnClientsImpl  extends SpotOnLoginPage implements Feature
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
                    .clickOnLoginButton().clickOnClientsBtn()
                    .verifyClientsPage()
                    .clickNewClientsBtn()
                    .enterCompanyName(SystemProperties.COMPANY_NAME)
                    .enterDescription(SystemProperties.DESCRIPTION_CLIENTS)
                    .enterContactName(SystemProperties.CONTACT_NAME)
                    .enterContactPhone(SystemProperties.CONTACT_PHONE)
                    .enterContactEmail(SystemProperties.CONTACT_EMAIL)
                    .enterStreetAddress(SystemProperties.STREET_ADDRESS)
                    .enterCity(SystemProperties.CITY_CLIENT)
                    .selectState()
                    .clickSaveBtn();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
