package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnClientsPage implements ISpotOnClientsPage {

    SelenideElement clientsLabel = $x("//label[text()='Clients']");
    SelenideElement newClientBtn = $x("//button[text()=' + New Client ']");
    SelenideElement companyName = $x("//app-so-input[@label='Company Name']//input");
    SelenideElement description = $x("//app-so-textarea[@label='Description']//textarea");
    SelenideElement contactName = $x("//app-so-input[@label='Contact Name']//input");
    SelenideElement contactPhone = $x("//app-so-input[@label='Contact Phone']//input");
    SelenideElement contactEmail = $x("//app-so-input[@label='Contact Email']//input");
    SelenideElement streetAddress = $x("//app-so-input[@label='Street Address']//input");
    SelenideElement city = $x("//app-so-input[@label='City']//input[contains(@class,'native-input')]");
    SelenideElement state = $x("//ion-select[@aria-label='State']");
    SelenideElement stateValue = $x("(//ion-radio[@class='sc-ion-select-popover md in-item interactive hydrated'])[1]");
    SelenideElement saveBtn = $x("(//app-so-button//button[text()='Save'])[2]");


    // Click on New Client Button
    @Override
    public ISpotOnClientsPage clickNewClientsBtn() {
        newClientBtn.click();
        return SpotOnPageFactory.getClientsPage();
    }

    // Verify whether the respective page is Clients page
    @Override
    public ISpotOnClientsPage verifyClientsPage() {

        String label = clientsLabel.getText();
        Assert.assertEquals(label,"Clients");
        return SpotOnPageFactory.getClientsPage();
    }

    // Enter Company Name
    @Override
    public ISpotOnClientsPage enterCompanyName(String companyValue) {

        companyName.sendKeys(companyValue);
        return SpotOnPageFactory.getClientsPage();
    }

    // Enter Description
    @Override
    public ISpotOnClientsPage enterDescription(String descriptionValue) {

        description.sendKeys(descriptionValue);
        return SpotOnPageFactory.getClientsPage();
    }

    // Enter Contact Name
    @Override
    public ISpotOnClientsPage enterContactName(String contName) {

        contactName.sendKeys(contName);
        return SpotOnPageFactory.getClientsPage();
    }

    // Enter Contact Phone
    @Override
    public ISpotOnClientsPage enterContactPhone(String phone) {

        contactPhone.sendKeys(phone);
        return SpotOnPageFactory.getClientsPage();
    }

    // Enter Contact Email
    @Override
    public ISpotOnClientsPage enterContactEmail(String contEmail) {

        contactEmail.sendKeys(contEmail);
        return SpotOnPageFactory.getClientsPage();
    }

    // Enter Street Address
    @Override
    public ISpotOnClientsPage enterStreetAddress(String address) {

        streetAddress.scrollIntoView(true).sendKeys(address);
        return SpotOnPageFactory.getClientsPage();
    }

    // Enter City
    @Override
    public ISpotOnClientsPage enterCity(String cityValue) {

        city.sendKeys(cityValue);
        return SpotOnPageFactory.getClientsPage();
    }

    // Select State
    @Override
    public ISpotOnClientsPage selectState() {

        state.click();
        stateValue.click();
        return SpotOnPageFactory.getClientsPage();
    }

    // Click on Save Button
    @Override
    public ISpotOnClientsPage clickSaveBtn() {

        saveBtn.click();
        return SpotOnPageFactory.getClientsPage();
    }
}
