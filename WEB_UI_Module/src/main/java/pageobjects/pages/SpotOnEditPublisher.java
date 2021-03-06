package pageobjects.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import data.ApplicationData;
import data.SystemProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;
import utilities.ReadWriteData;

import java.util.Properties;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnEditPublisher implements ISpotOnEditPublisher {

    Properties p = new Properties();
    ReadWriteData rwd = new ReadWriteData();
    ApplicationData ad = new ApplicationData();
    SelenideElement publishersLabel = $x("//label[text()='Publishers']");
    SelenideElement search = $x("//input[@placeholder='Search']");
    SelenideElement publisher = $x("//span[text()='" + rwd.readPublisher(p) + "']");
    SelenideElement publisherValue = $x("(//ion-row[2]//ion-col[1])[2]");
    SelenideElement addNewBtn = $x("//button[text()='Add New +']");
    SelenideElement unitName = $x("//tr[2]//input[@placeholder='Unit name']");
    //SelenideElement unitName = $x("//input[@placeholder='Unit name']");
    SelenideElement unitSize = $x("//tr[2]//select[@formcontrolname='contentClass']");
    SelenideElement placement = $x("//tr[2]//select[@formcontrolname='placement']");
    SelenideElement unitPrice = $x("//tr[2]//select[@formcontrolname='unitPrice']");
    SelenideElement cost = $x("//tr[2]//ion-input[@formcontrolname='cost']/input");
    SelenideElement availability = $x("//tr[2]//ion-input[@formcontrolname='avails']/input");
    SelenideElement updateBtn = $x("//button[text()='Update ']");

    // Check whether the respective page is Publisher Page
    @Override
    public ISpotOnEditPublisher verifyPublisherPage() {

        String label = publishersLabel.getText();
        Assert.assertEquals(label, "Publishers");
        return SpotOnPageFactory.getEditPublishersPage();
    }

    // Enter Publisher Value in Search box
    @Override
    public ISpotOnEditPublisher enterSearchKeyword(String searchKey) {

        System.out.println("Publisher: " + searchKey);
        search.sendKeys(searchKey);
        search.sendKeys(Keys.ENTER);
        return SpotOnPageFactory.getEditPublishersPage();
    }

    // Click on Searched Proposal
    @Override
    public ISpotOnEditPublisher selectPublisher() {

        publisher.click();
        return SpotOnPageFactory.getEditPublishersPage();
    }

    // Click on Add New button
    @Override
    public ISpotOnEditPublisher clickAddNewBtn() {

        System.out.println("Rows " + getNumberOfRows());
        addNewBtn.scrollIntoView(true).click();
        System.out.println("Rows " + getNumberOfRows());
        return SpotOnPageFactory.getEditPublishersPage();
    }

    @Override
    public int getNumberOfRows() {

        SelenideElement table = $x("//table[@class='spot-on-table ng-star-inserted']");
        ElementsCollection rows = table.$$(By.tagName("tr"));
        int size = rows.size();

        return size - 1;
    }

    // Enter Unit Name
    @Override
    public ISpotOnEditPublisher enterUnitName(String name) {

        unitName.sendKeys(name);
        return SpotOnPageFactory.getEditPublishersPage();
    }

    // Select Size
    @Override
    public ISpotOnEditPublisher selectSize(int index) {
        //System.out.println(index);
        unitSize.selectOption(index);
        return SpotOnPageFactory.getEditPublishersPage();
    }

    // Enter Placement value
    @Override
    public ISpotOnEditPublisher selectPlacement(int indexP) {

        placement.selectOption(indexP);
        return SpotOnPageFactory.getEditPublishersPage();
    }

    // Select Unit Price
    @Override
    public ISpotOnEditPublisher selectUnitPrice() {

        //unitPrice.selectOption(indexUP);
        unitPrice.sendKeys("CPM");
        return SpotOnPageFactory.getEditPublishersPage();
    }

    // Enter Cost
    @Override
    public ISpotOnEditPublisher enterCost(String costValue) {

        cost.sendKeys(costValue);
        return SpotOnPageFactory.getEditPublishersPage();
    }

    // Enter Availability value
    @Override
    public ISpotOnEditPublisher enterAvailability(String availValue) {

        availability.sendKeys(availValue);
        return SpotOnPageFactory.getEditPublishersPage();
    }

    // Click on Update Button
    @Override
    public ISpotOnEditPublisher clickUpdateBtn() {

        WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(),20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Update ']")));
        updateBtn.click();
        return SpotOnPageFactory.getEditPublishersPage();
    }
}
