package pageobjects.pages;

public interface ISpotOnProposalsPage {
    ISpotOnProposalsPage verifyProposalsPage();
    ISpotOnProposalsPage clickOnNewProposalBtn();
    ISpotOnProposalsPage enterProposalName(String propName);
    ISpotOnProposalsPage enterProposalNameAM(String propNameAM);
    ISpotOnProposalsPage enterDescription(String desc);
    ISpotOnProposalsPage selCampaignType();
    ISpotOnProposalsPage enterStartDate(String sDate);
    ISpotOnProposalsPage enterEndDate(String eDate);
    ISpotOnProposalsPage enterClickTagURL(String URL);
    ISpotOnProposalsPage clickSelectPublisherBtn();
    ISpotOnProposalsPage clickAddMoreLocalPublisherBtn();
    ISpotOnProposalsPage selLocalPublishers();
    ISpotOnProposalsPage clickUseChosenBtn();
    ISpotOnProposalsPage clickSaveChangesBtn();
    ISpotOnProposalsPage clickSaveBtn();

}
