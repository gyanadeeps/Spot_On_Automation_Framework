package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnSearchValidationPublishers implements ISpotOnSearchValidationPublishers {

    SelenideElement publishersLabel = $x("//label[text()='Publishers']");
    SelenideElement search = $x("//input[@placeholder='Search']");
    SelenideElement publisher = $x("(//ion-grid)[2]//ion-row[2]//ion-col[1]");;

    // Verify whether the respective page is Publishers page
    @Override
    public ISpotOnSearchValidationPublishers verifyPublishersPage() {

        String label = publishersLabel.getText();
        Assert.assertEquals(label, "Publishers");
        return SpotOnPageFactory.verifySearchValidationPublishers();
    }

    // Enter publisher value in Search box for Service User
    @Override
    public ISpotOnSearchValidationPublishers enterSearchKeyword(String searchKey) {

        search.sendKeys(searchKey);
        search.sendKeys(Keys.ENTER);
        return SpotOnPageFactory.verifySearchValidationPublishers();
    }

    // Verify searched publisher for Service User
    @Override
    public ISpotOnSearchValidationPublishers verifyPublisher() {

        try {
            Thread.sleep(3000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        String publisherValue = publisher.getText();
        boolean val = publisherValue.contains("Spot");
        Assert.assertTrue(val);
        return SpotOnPageFactory.verifySearchValidationPublishers();
    }
}
