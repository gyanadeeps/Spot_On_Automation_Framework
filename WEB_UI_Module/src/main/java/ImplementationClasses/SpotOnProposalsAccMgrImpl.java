package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.ApplicationData;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnProposalsAccMgrImpl extends SpotOnLoginPage implements Feature {

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
                    .clickOnLoginButton().clickOnProposalsButton()
                    .verifyProposalsPage().clickOnNewProposalBtn()
                    .enterProposalNameAM(ad.PROPOSAL_NAME_AM())
                    .enterDescription(ad.DESCRIPTION())
                    .selCampaignType()
                    .enterStartDate(ad.START_DATE())
                    .enterEndDate(ad.END_DATE())
                    .enterClickTagURL(ad.WEB_URL())
                    .clickSelectPublisherBtn()
                    .clickAddMoreLocalPublisherBtn()
                    .selLocalPublishers()
                    .clickUseChosenBtn()
                    .clickSaveChangesBtn()
                    .clickSaveBtn();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
