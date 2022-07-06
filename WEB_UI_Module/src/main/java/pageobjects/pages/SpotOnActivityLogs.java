package pageobjects.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;
import utilities.ReadWriteData;

import java.util.Properties;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnActivityLogs implements ISpotOnActivityLogs {


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
    SelenideElement activityLogs = $x("//ion-label[text()=' Activity Logs ']");
    //SelenideElement actionDetails = $x("//tbody//tr[1]//td[4][contains(text(),'Publisher');
    String actionDetails = rwd.readPublisher(p);
    SelenideElement actionDetailsName = $x("//tbody//tr[1]//td[4]//span");
    SelenideElement userEmail = $x("//app-so-input[@label='User email']//ion-input[1]/input");
    SelenideElement searchBtn = $x("//button[text()='Search']");
    SelenideElement email = $x("//tbody//tr[1]//td[3]");


    @Override
    public ISpotOnActivityLogs verifyPublisherPage() {

        String label = publishersLabel.getText();
        Assert.assertEquals(label, "Publishers");
        return SpotOnPageFactory.verifyActivityLogs();
    }

    @Override
    public ISpotOnActivityLogs clickNewPublisherButton() {

        newPublisherBtn.click();

        return SpotOnPageFactory.verifyActivityLogs();
    }

    @Override
    public ISpotOnActivityLogs enterPublisherName(String publisher) {

        System.out.println("Publisher:" + publisher);
        p.setProperty("publisher", publisher);
        rwd.writePublisher(p);
        publisherName.sendKeys(publisher);
        return SpotOnPageFactory.verifyActivityLogs();
    }

    @Override
    public ISpotOnActivityLogs enterWebsiteURL(String webURL) {

        websiteURL.sendKeys(webURL);
        return SpotOnPageFactory.verifyActivityLogs();
    }

    @Override
    public ISpotOnActivityLogs enterDescription(String desc) {

        description.sendKeys(desc);
        return SpotOnPageFactory.verifyActivityLogs();
    }

    @Override
    public ISpotOnActivityLogs selectPublisherType() {

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


        return SpotOnPageFactory.verifyActivityLogs();
    }

    @Override
    public ISpotOnActivityLogs enterCity(String cityName) {

        city.sendKeys(cityName);
        return SpotOnPageFactory.verifyActivityLogs();
    }

    @Override
    public ISpotOnActivityLogs selectState() {

        try {

            Selenide.executeJavaScript("arguments[0].click();", state);
            Thread.sleep(5000);
            Selenide.executeJavaScript("arguments[0].click();", stateValue);
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return SpotOnPageFactory.verifyActivityLogs();
    }

    @Override
    public ISpotOnActivityLogs enterMonthlyVisitors(String visitorsNumber) {
        //Selenide.executeJavaScript("arguments[0].sendKeys(visitorsNumber);",monthlyVisitors);

        monthlyVisitors.scrollIntoView(true).sendKeys(visitorsNumber);

        return SpotOnPageFactory.verifyActivityLogs();
    }

    @Override
    public ISpotOnActivityLogs clickAddNewBtn() {

        addNewBtn.scrollIntoView(true).click();
        return SpotOnPageFactory.verifyActivityLogs();
    }

    @Override
    public ISpotOnActivityLogs enterUnitName(String name) {

        unitName.sendKeys(name);
        return SpotOnPageFactory.verifyActivityLogs();
    }

    @Override
    public ISpotOnActivityLogs selectSize(int index) {
        //System.out.println(index);
        unitSize.selectOption(index);
        return SpotOnPageFactory.verifyActivityLogs();
    }

    @Override
    public ISpotOnActivityLogs selectPlacement(int indexP) {

        placement.selectOption(indexP);
        return SpotOnPageFactory.verifyActivityLogs();
    }

    @Override
    public ISpotOnActivityLogs selectUnitPrice() {

        //unitPrice.selectOption(indexUP);
        unitPrice.sendKeys("CPM");
        return SpotOnPageFactory.verifyActivityLogs();
    }

    @Override
    public ISpotOnActivityLogs enterCost(String costValue) {

        cost.sendKeys(costValue);
        return SpotOnPageFactory.verifyActivityLogs();
    }

    @Override
    public ISpotOnActivityLogs enterAvailability(String availValue) {

        availability.sendKeys(availValue);
        return SpotOnPageFactory.verifyActivityLogs();
    }

    @Override
    public ISpotOnActivityLogs clickSaveButton() {


        try {

            Thread.sleep(3000);
            saveBtn.click();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return SpotOnPageFactory.verifyActivityLogs();
    }

    @Override
    public ISpotOnActivityLogs clickActivityLogsBtn() {

        activityLogs.click();
        return SpotOnPageFactory.verifyActivityLogs();
    }

    @Override
    public ISpotOnActivityLogs verifyActivityLogs() {

        String s = actionDetailsName.getText();
        s.trim();
        Assert.assertEquals(actionDetails , s);
        return SpotOnPageFactory.verifyActivityLogs();
    }

    @Override
    public ISpotOnActivityLogs enterEmail(String mail) {

        userEmail.sendKeys(mail);
        searchBtn.click();
        String str = email.getText();
        Assert.assertEquals(mail , str);
        return SpotOnPageFactory.verifyActivityLogs();
    }


}
