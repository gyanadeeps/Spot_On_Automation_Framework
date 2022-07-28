package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnSearchValidationCreativesPublisher implements ISpotOnSearchValidationCreativesPublisher {

    SelenideElement creativesLabel = $x("//label[text()='Creatives']");
    SelenideElement search = $x("//input[@placeholder='Search']");
    SelenideElement creative = $x("(//ion-grid)[2]//ion-row[2]//ion-col[1]");;

    // Verify whether the respective page is Creatives Publisher page
    @Override
    public ISpotOnSearchValidationCreativesPublisher verifyCreativesPublisherPage() {

        String label = creativesLabel.getText();
        Assert.assertEquals(label, "Creatives");
        return SpotOnPageFactory.verifySearchValidationCreativesPublisher();
    }

    // Enter Creative value in Search box for Service User
    @Override
    public ISpotOnSearchValidationCreativesPublisher enterSearchKeyword(String searchKey) {

        search.sendKeys(searchKey);
        search.sendKeys(Keys.ENTER);
        return SpotOnPageFactory.verifySearchValidationCreativesPublisher();
    }

    // Verify searched creative for Service User
    @Override
    public ISpotOnSearchValidationCreativesPublisher verifyCreativesPublisher() {

        try {
            Thread.sleep(3000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        String creativeValue = creative.getText();
        boolean val = creativeValue.contains("Spot");
        Assert.assertTrue(val);
        return SpotOnPageFactory.verifySearchValidationCreativesPublisher();
    }
}
