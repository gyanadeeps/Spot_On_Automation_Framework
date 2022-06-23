package pageobjects.pages;

public interface ISpotOnCreativesPage {

    ISpotOnCreativesPage verifyCreativesPage();
    ISpotOnCreativesPage clickNewCreativeBtn();
    ISpotOnCreativesPage enterCampaign(String campValue);
    ISpotOnCreativesPage enterCampaignAM(String campValueAM);
    ISpotOnCreativesPage enterName(String nameValue);
    ISpotOnCreativesPage enterNameCM(String nameValueCM);
    ISpotOnCreativesPage enterClickTagURL(String tagURL);
    ISpotOnCreativesPage selectFormat();
    ISpotOnCreativesPage selectSize();
    ISpotOnCreativesPage selectFile();
    ISpotOnCreativesPage clickAddToQueueBtn();
    ISpotOnCreativesPage clickSendCreativesForReviewBtn();

}
