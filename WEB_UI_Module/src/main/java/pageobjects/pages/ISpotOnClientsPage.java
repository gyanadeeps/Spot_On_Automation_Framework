package pageobjects.pages;

public interface ISpotOnClientsPage {

    ISpotOnClientsPage clickNewClientsBtn();
    ISpotOnClientsPage verifyClientsPage();
    ISpotOnClientsPage enterCompanyName(String companyValue);
    ISpotOnClientsPage enterDescription(String descriptionValue);
    ISpotOnClientsPage enterContactName(String contName);
    ISpotOnClientsPage enterContactPhone(String phone);
    ISpotOnClientsPage enterContactEmail(String contEmail);
    ISpotOnClientsPage enterStreetAddress(String address);
    ISpotOnClientsPage enterCity(String cityValue);
    ISpotOnClientsPage selectState();
    ISpotOnClientsPage clickSaveBtn();


}
