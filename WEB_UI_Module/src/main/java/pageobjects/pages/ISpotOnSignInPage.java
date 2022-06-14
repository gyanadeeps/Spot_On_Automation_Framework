package pageobjects.pages;

public interface ISpotOnSignInPage
{

  ISpotOnSignInPage enterEmail(String name);
  ISpotOnSignInPage enterPassword(String name);
  ISpotOnSignInPage clickOnLoginButton();
  ISpotOnSignUp clickOnButton();
  ISpotOnProposalsPage clickOnProposalsButton();
  ISpotOnPublishersPage clickOnPublishersButton();
  ISpotOnCreateCampaign clickOnProposalsBtn();
}
