package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.ApplicationData;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnCreateCampaignImpl extends SpotOnLoginPage implements Feature {

    ApplicationData ad = new ApplicationData();
    private ISpotOnSignInPage homePage;
    @Override
    public void init() {

        homePage = openSpotOnPage();
    }

    @Override
    public void execute() {
        try {

            homePage.enterEmail(ad.USERNAME())
                    .enterPassword(ad.PASSWORD())
                    .clickOnLoginButton()
                    .clickOnProposalsBtn()
                    .verifyProposalsPage()
                    .enterSearchKeyword(ad.SEARCH_KEY_PROPOSALS())
                    .clickProposal()
                    .enterDescription(ad.DESCRIPTION_NEW_VALUE())
                    .clickSearchAndSelectPublisher()
                    .clickAddMoreNationalPublisher()
                    .selectNationalPublisher()
                    .clickUseChosenBtn()
                    .clickSaveChangesBtn()
                    .clickDownIcon()
                    .enterDesiredImpressions(ad.DESIRED_IMPRESSIONS())
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
