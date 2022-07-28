package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnSearchValidationClients implements ISpotOnSearchValidationClients {

    SelenideElement clientsLabel = $x("//label[text()='Clients']");
    SelenideElement search = $x("//input[@placeholder='Search']");
    SelenideElement client = $x("(//ion-grid)[2]//ion-row[2]//ion-col[1]");

    // Verify whether the respective page is Clients page
    @Override
    public ISpotOnSearchValidationClients verifyClientsPage() {

        String label = clientsLabel.getText();
        Assert.assertEquals(label, "Clients");
        return SpotOnPageFactory.verifySearchValidationClients();
    }

    // Enter Client value in Search box for Service User
    @Override
    public ISpotOnSearchValidationClients enterSearchKeyword(String searchKey) {

        search.sendKeys(searchKey);
        search.sendKeys(Keys.ENTER);
        return SpotOnPageFactory.verifySearchValidationClients();
    }

    // Verify searched client for Service User
    @Override
    public ISpotOnSearchValidationClients verifyClients() {

        try {
            Thread.sleep(3000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        String clientValue = client.getText();
        boolean val = clientValue.contains("Spot");
        Assert.assertTrue(val);
        return SpotOnPageFactory.verifySearchValidationClients();
    }
}
