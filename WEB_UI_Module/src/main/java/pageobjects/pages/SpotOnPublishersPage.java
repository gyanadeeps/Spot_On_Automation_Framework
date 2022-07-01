package pageobjects.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;
import utilities.ReadWriteData;

import java.util.Properties;

import static com.codeborne.selenide.Selenide.*;

public class SpotOnPublishersPage implements ISpotOnPublishersPage {

    Properties p = new Properties();
    ReadWriteData rwd = new ReadWriteData();
    SelenideElement publishersLabel = $x("//label[text()='Publishers']");
    SelenideElement newPublisherBtn = $x("//button[text()=' + New Publisher ']");
    SelenideElement publisherName = $x("//app-so-input[@label='Publisher Name']//input[contains(@class,'native-input')]");
    SelenideElement websiteURL = $x("//app-so-input[@label='Website URL']//input[contains(@class,'native-input')]");
    SelenideElement publisherType = $x("(//ion-radio[@role='radio'])[1]");
    SelenideElement description = $x("//app-so-textarea[@label='Description']//textarea[contains(@class,'sc-ion-textarea-md')]");
    //ElementsCollection radioBtnList = $$x("//ion-radio[@role='radio']");

    //int index = ((int) (Math.round(Math.random() * 4)) + 1);


    SelenideElement city = $x("//app-so-input[@label='City']//input[contains(@class,'native-input')]");
    SelenideElement state = $x("//ion-select[@aria-label='State *']");
    SelenideElement monthlyVisitors = $x("//app-so-input[@label='Monthly Visitors']//input[contains(@class,'native-input')]");

    SelenideElement addNewBtn = $x("//button[text()='Add New +']");
    SelenideElement unitName = $x("//input[@placeholder='Unit name']");
    SelenideElement unitSize = $x("//select[@formcontrolname='contentClass']");
    SelenideElement placement = $x("//select[@formcontrolname='placement']");
    SelenideElement unitPrice = $x("//select[@formcontrolname='unitPrice']");
    SelenideElement cost = $x("//ion-input[@formcontrolname='cost']/input");
    SelenideElement availability = $x("//ion-input[@formcontrolname='avails']/input");
    SelenideElement saveBtn = $x("(//button[text()='Save'])[2]");
    SelenideElement stateValue = $x("(//ion-radio[@class='sc-ion-select-popover md in-item interactive hydrated'])[1]");

    @Override
    public ISpotOnPublishersPage verifyPublisherPage() {

        String label = publishersLabel.getText();
        Assert.assertEquals(label, "Publishers");
        return SpotOnPageFactory.getPublishersPage();
    }

    @Override
    public ISpotOnPublishersPage clickNewPublisherButton() {

        newPublisherBtn.click();

        return SpotOnPageFactory.getPublishersPage();
    }

    @Override
    public ISpotOnPublishersPage enterPublisherName(String publisher) {

        System.out.println("Publisher:" + publisher);
        p.setProperty("publisher", publisher);
        rwd.writePublisher(p);
        publisherName.sendKeys(publisher);
        return SpotOnPageFactory.getPublishersPage();
    }

    @Override
    public ISpotOnPublishersPage enterWebsiteURL(String webURL) {

        websiteURL.sendKeys(webURL);
        return SpotOnPageFactory.getPublishersPage();
    }

    @Override
    public ISpotOnPublishersPage enterDescription(String desc) {

        description.sendKeys(desc);
        return SpotOnPageFactory.getPublishersPage();
    }

    @Override
    public ISpotOnPublishersPage selectPublisherType() {

        publisherType.click();
        /*int k = 0;
        for (WebElement webElement : radioBtnList) {
            //String name = webElement.getAttribute("innerHTML");

            if (k == index) {
                webElement.click();
                break;
            }
            k++;
        }*/


        return SpotOnPageFactory.getPublishersPage();
    }

    @Override
    public ISpotOnPublishersPage enterCity(String cityName) {

        city.sendKeys(cityName);
        return SpotOnPageFactory.getPublishersPage();
    }

    @Override
    public ISpotOnPublishersPage selectState() {

        try {

            Selenide.executeJavaScript("arguments[0].click();", state);
            Thread.sleep(5000);
            Selenide.executeJavaScript("arguments[0].click();", stateValue);
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return SpotOnPageFactory.getPublishersPage();
    }

    @Override
    public ISpotOnPublishersPage enterMonthlyVisitors(String visitorsNumber) {
        //Selenide.executeJavaScript("arguments[0].sendKeys(visitorsNumber);",monthlyVisitors);

        monthlyVisitors.scrollIntoView(true).sendKeys(visitorsNumber);

        return SpotOnPageFactory.getPublishersPage();
    }

    @Override
    public ISpotOnPublishersPage clickAddNewBtn() {

        addNewBtn.scrollIntoView(true).click();
        return SpotOnPageFactory.getPublishersPage();
    }

    @Override
    public ISpotOnPublishersPage enterUnitName(String name) {

        unitName.sendKeys(name);
        return SpotOnPageFactory.getPublishersPage();
    }

    @Override
    public ISpotOnPublishersPage selectSize(int index) {
        //System.out.println(index);
        unitSize.selectOption(index);
        return SpotOnPageFactory.getPublishersPage();
    }

    @Override
    public ISpotOnPublishersPage selectPlacement(int indexP) {

        placement.selectOption(indexP);
        return SpotOnPageFactory.getPublishersPage();
    }

    @Override
    public ISpotOnPublishersPage selectUnitPrice() {

        //unitPrice.selectOption(indexUP);
        unitPrice.sendKeys("CPM");
        return SpotOnPageFactory.getPublishersPage();
    }

    @Override
    public ISpotOnPublishersPage enterCost(String costValue) {

        cost.sendKeys(costValue);
        return SpotOnPageFactory.getPublishersPage();
    }

    @Override
    public ISpotOnPublishersPage enterAvailability(String availValue) {

        availability.sendKeys(availValue);
        return SpotOnPageFactory.getPublishersPage();
    }

    @Override
    public ISpotOnPublishersPage clickSaveButton() {


        try {

            Thread.sleep(3000);
            saveBtn.click();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return SpotOnPageFactory.getPublishersPage();
    }

}
