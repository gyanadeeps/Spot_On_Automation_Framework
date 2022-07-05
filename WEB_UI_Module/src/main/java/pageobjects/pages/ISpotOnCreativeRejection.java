package pageobjects.pages;

public interface ISpotOnCreativeRejection {

    ISpotOnCreativeRejection verifyCreativesPublisherPage();
    ISpotOnCreativeRejection enterSearchKeyword(String searchKey);
    ISpotOnCreativeRejection clickRejectBtn();
    ISpotOnCreativeRejection enterRejectionReason(String reason);
    ISpotOnCreativeRejection clickSaveBtn();
}
