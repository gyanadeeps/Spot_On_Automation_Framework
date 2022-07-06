package pageobjects.pages;

public interface ISpotOnActivityLogs {

    ISpotOnActivityLogs verifyPublisherPage();
    ISpotOnActivityLogs clickNewPublisherButton();
    ISpotOnActivityLogs enterPublisherName(String publisher);
    ISpotOnActivityLogs enterWebsiteURL(String webURL);
    ISpotOnActivityLogs enterDescription(String desc);
    ISpotOnActivityLogs selectPublisherType();
    ISpotOnActivityLogs enterCity(String cityName);
    ISpotOnActivityLogs selectState();
    ISpotOnActivityLogs enterMonthlyVisitors(String visitorsNumber);
    ISpotOnActivityLogs clickAddNewBtn();
    ISpotOnActivityLogs enterUnitName(String name);
    ISpotOnActivityLogs selectSize(int index);
    ISpotOnActivityLogs selectPlacement(int indexP);
    ISpotOnActivityLogs selectUnitPrice();
    ISpotOnActivityLogs enterCost(String costValue);
    ISpotOnActivityLogs enterAvailability(String availValue);
    ISpotOnActivityLogs clickSaveButton();
    ISpotOnActivityLogs clickActivityLogsBtn();
    ISpotOnActivityLogs verifyActivityLogs();
    ISpotOnActivityLogs enterEmail(String mail);
}
