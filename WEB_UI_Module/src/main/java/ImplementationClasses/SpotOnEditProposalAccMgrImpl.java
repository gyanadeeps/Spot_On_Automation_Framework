package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.ApplicationData;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnEditProposalAccMgrImpl extends SpotOnLoginPage implements Feature {

    ApplicationData ad = new ApplicationData();
    private ISpotOnSignInPage homePage;
    @Override
    public void init() {

        homePage = openSpotOnPage();
    }

    @Override
    public void execute() {
        try {

            homePage.enterEmail(ad.ACCOUNT_MANAGER_USERNAME())
                    .enterPassword(ad.PASSWORD())
                    .clickOnLoginButton()
                    .clickOnProposalBtnEditServiceUser()
                    .verifyProposalsPage()
                    .enterSearchKeyword(ad.SEARCH_KEY_PROPOSALS())
                    .clickProposal()
                    .enterDescription(ad.DESCRIPTION_PROPOSAL())
                    .clickUpdateBtn()
            ;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
