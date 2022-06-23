package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnCampaignCreationAccMgrImpl extends SpotOnLoginPage implements Feature {
    private ISpotOnSignInPage homePage;
    @Override
    public void init() {

        homePage = openSpotOnPage();
    }

    @Override
    public void execute() {
        try {

            homePage.enterEmail(SystemProperties.ACCOUNT_MANAGER_USERNAME)
                    .enterPassword(SystemProperties.PASSWORD)
                    .clickOnLoginButton()
                    .clickOnProposalsBtn()
                    .verifyProposalsPage()
                    .enterSearchKeywordAM(SystemProperties.SEARCH_KEY_PROPOSALS_AM)
                    .clickProposalAM()
                    .enterDescription(SystemProperties.DESCRIPTION_NEW_VALUE)
                    .clickSearchAndSelectPublisher()
                    .clickAddMoreNationalPublisher()
                    .selectNationalPublisher()
                    .clickUseChosenBtn()
                    .clickSaveChangesBtn()
                    .clickDownIcon()
                    .enterDesiredImpressions(SystemProperties.DESIRED_IMPRESSIONS)
                    //.enterAllocatedBudget(SystemProperties.ALLOCATED_BUDGET)
                    .selectBuyBtn()
                    .clickUpdateBtn()
                    .clickProposalAM()
                    .clickCreateNewCampaignBtn();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
