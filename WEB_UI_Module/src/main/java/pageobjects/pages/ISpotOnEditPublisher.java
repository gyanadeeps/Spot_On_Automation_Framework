package pageobjects.pages;

public interface ISpotOnEditPublisher {

    ISpotOnEditPublisher verifyPublisherPage();
    ISpotOnEditPublisher enterSearchKeyword(String searchKey);
    ISpotOnEditPublisher selectPublisher();
    ISpotOnEditPublisher clickAddNewBtn();
    int getNumberOfRows();
    ISpotOnEditPublisher enterUnitName(String name);
    ISpotOnEditPublisher selectSize(int index);
    ISpotOnEditPublisher selectPlacement(int indexP);
    ISpotOnEditPublisher selectUnitPrice();
    ISpotOnEditPublisher enterCost(String costValue);
    ISpotOnEditPublisher enterAvailability(String availValue);
    ISpotOnEditPublisher clickUpdateBtn();

}
