package pageobjects.pages;

public interface ISpotOnPublishersPage {
    ISpotOnPublishersPage verifyPublisherPage();
    ISpotOnPublishersPage clickNewPublisherButton();
    ISpotOnPublishersPage enterPublisherName(String publisher);
    ISpotOnPublishersPage enterWebsiteURL(String webURL);
    ISpotOnPublishersPage enterDescription(String desc);
    ISpotOnPublishersPage selectPublisherType();
    ISpotOnPublishersPage enterCity(String cityName);
    ISpotOnPublishersPage selectState();
    ISpotOnPublishersPage enterMonthlyVisitors(String visitorsNumber);
    ISpotOnPublishersPage clickAddNewBtn();
    ISpotOnPublishersPage enterUnitName(String name);
    ISpotOnPublishersPage selectSize(int index);
    ISpotOnPublishersPage selectPlacement(int indexP);
    ISpotOnPublishersPage selectUnitPrice();
    ISpotOnPublishersPage enterCost(String costValue);
    ISpotOnPublishersPage enterAvailability(String availValue);
    ISpotOnPublishersPage clickSaveButton();
}
