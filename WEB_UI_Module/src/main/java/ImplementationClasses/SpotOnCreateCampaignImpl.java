package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnCreateCampaignImpl extends SpotOnLoginPage implements Feature {
    private ISpotOnSignInPage homePage;
    @Override
    public void init() {

        homePage = openSpotOnPage();
    }

    @Override
    public void execute() {
        try {

            homePage.enterEmail(SystemProperties.USERNAME)
                    .enterPassword(SystemProperties.PASSWORD)
                    .clickOnLoginButton()
                    .clickOnProposalsBtn()
                    .verifyProposalsPage()
                    .enterSearchKeyword(SystemProperties.SEARCH_KEY_PROPOSALS)
                    .clickProposal()
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
                    .clickProposal()
                    .clickCreateNewCampaignBtn();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
