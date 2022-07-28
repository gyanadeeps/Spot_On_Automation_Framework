package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnSearchValidationCreatives implements ISpotOnSearchValidationCreatives {

    SelenideElement creativesLabel = $x("//label[text()='Creatives']");
    SelenideElement search = $x("//input[@placeholder='Search']");
    SelenideElement creative = $x("(//ion-list)[3]/ion-row[2]/ion-col[1]");;

    // Verify whether the respective page is Creatives page
    @Override
    public ISpotOnSearchValidationCreatives verifyCreativesPage() {

        String label = creativesLabel.getText();
        Assert.assertEquals(label, "Creatives");
        return SpotOnPageFactory.verifySearchValidationCreatives();
    }

    // Enter Creative value in Search box for Service User
    @Override
    public ISpotOnSearchValidationCreatives enterSearchKeyword(String searchKey) {

        search.sendKeys(searchKey);
        search.sendKeys(Keys.ENTER);
        return SpotOnPageFactory.verifySearchValidationCreatives();
    }

    // Verify searched creative for Service User
    @Override
    public ISpotOnSearchValidationCreatives verifyCreatives() {

        try {
            Thread.sleep(3000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        String creativeValue = creative.getText();
        boolean val = creativeValue.contains("Spot");
        Assert.assertTrue(val);
        return SpotOnPageFactory.verifySearchValidationCreatives();
    }
}
