package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import data.ApplicationData;
import data.SystemProperties;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnProposalsImpl extends SpotOnLoginPage implements Feature {

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
                    .clickOnLoginButton().clickOnProposalsButton()
                    .verifyProposalsPage().clickOnNewProposalBtn()
                    .enterProposalName(ad.PROPOSAL_NAME())
                    .enterDescription(ad.DESCRIPTION())
                    .selCampaignType()
                    .enterStartDate(ad.START_DATE())
                    .enterEndDate(ad.END_DATE())
                    .enterClickTagURL(ad.WEB_URL())
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
