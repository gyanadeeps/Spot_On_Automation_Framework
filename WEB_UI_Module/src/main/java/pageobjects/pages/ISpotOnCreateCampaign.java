package pageobjects.pages;

public interface ISpotOnCreateCampaign {
    ISpotOnCreateCampaign verifyProposalsPage();
    ISpotOnCreateCampaign enterSearchKeyword(String searchKey);
    ISpotOnCreateCampaign clickProposal();
    ISpotOnCreateCampaign clickSearchAndSelectPublisher();
    ISpotOnCreateCampaign clickAddMoreNationalPublisher();
    ISpotOnCreateCampaign selectNationalPublisher();
    ISpotOnCreateCampaign clickUseChosenBtn();
    ISpotOnCreateCampaign clickSaveChangesBtn();
    ISpotOnCreateCampaign clickDownIcon();
    ISpotOnCreateCampaign enterDesiredImpressions(String desiredValue);
    ISpotOnCreateCampaign enterAllocatedBudget(String budgetValue);
    ISpotOnCreateCampaign selectBuyBtn();
    ISpotOnCreateCampaign clickUpdateBtn();
    ISpotOnCreateCampaign clickCreateNewCampaignBtn();

}
