package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.ApplicationData;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnCampaignCreationAccMgrImpl extends SpotOnLoginPage implements Feature {

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
                    .clickOnProposalsBtn()
                    .verifyProposalsPage()
                    .enterSearchKeywordAM(ad.SEARCH_KEY_PROPOSALS_AM())
                    .clickProposalAM()
                    .enterDescription(ad.DESCRIPTION_NEW_VALUE())
                    .clickSearchAndSelectPublisher()
                    .clickAddMoreNationalPublisher()
                    .selectNationalPublisher(ad.SEARCH_KEY_NATIONAL_PUBLISHER())
                    .clickUseChosenBtn()
                    .clickSaveChangesBtn()
                    .clickDownIcon()
                    .enterDesiredImpressions(ad.DESIRED_IMPRESSIONS())
                    //.enterAllocatedBudget(ad.ALLOCATED_BUDGET())
                    .selectBuyBtn()
                    .clickUpdateBtn()
                    .clickProposalAM()
                    .clickCreateNewCampaignBtn();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
