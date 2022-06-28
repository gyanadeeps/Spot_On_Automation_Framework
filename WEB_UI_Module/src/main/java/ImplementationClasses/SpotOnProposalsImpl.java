package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnProposalsImpl extends SpotOnLoginPage implements Feature {
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
                    .clickOnLoginButton().clickOnProposalsButton()
                    .verifyProposalsPage().clickOnNewProposalBtn()
                    .enterProposalName(SystemProperties.PROPOSAL_NAME)
                    .enterDescription(SystemProperties.DESCRIPTION)
                    .selCampaignType()
                    .enterStartDate(SystemProperties.START_DATE)
                    .enterEndDate(SystemProperties.END_DATE)
                    .enterClickTagURL(SystemProperties.WEB_URL)
                   /* .clickSelectPublisherBtn()
                    .clickAddMoreLocalPublisherBtn()
                    .selLocalPublishers()
                    .clickUseChosenBtn()
                    .clickSaveChangesBtn()*/
                    .clickSaveBtn();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
