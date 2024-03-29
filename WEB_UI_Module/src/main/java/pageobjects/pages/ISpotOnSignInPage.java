package pageobjects.pages;

public interface ISpotOnSignInPage
{

  ISpotOnSignInPage enterEmail(String name);
  ISpotOnSignInPage enterPassword(String name);
  ISpotOnSignInPage clickOnLoginButton();
  ISpotOnProposalsPage clickOnProposalsButton();
  ISpotOnPublishersPage clickOnPublishersButton();
  ISpotOnCreateCampaign clickOnProposalsBtn();
  ISpotOnCreativesPage clickOnCreativesBtn();
  ISpotOnClientsPage clickOnClientsBtn();
  ISpotOnUsersPage clickOnUsersBtn();
  ISpotOnPublisherUser verifyPublisherProfile();
  ISpotOnCampaignPublisherUser clickOnCampaignsBtn();
  ISpotOnEditPublisher clickOnPublishersBtn();
  ISpotOnCreativesPublisherPage clickOnCreativesPublisherBtn();
  ISpotOnTraffickerUser verifyTraffickerProfile();
  ISpotOnCampaignTraffickerUser clickOnCampaignBtn();
  ISpotOnCreativeRejection clickOnCreativePublisherBtn();
  ISpotOnCreativeRejection clickOnCreativeBtn();
  ISpotOnActivityLogs clickOnPublisherButton();
  ISpotOnEditProposal clickOnProposalBtnEditServiceUser();
  ISpotOnSearchValidationProposals clickProposalsBtn();
  ISpotOnSearchValidationPublishers clickPublisherButton();
  ISpotOnSearchValidationCampaign clickCampaignBtn();
  ISpotOnSearchValidationCreatives clickCreativeBtn();
  ISpotOnSearchValidationCreativesPublisher clickCreativePublisherBtn();
  ISpotOnSearchValidationClients clickClientsBtn();

}
