package pageobjects.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import data.ApplicationData;
import data.SystemProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;
import utilities.ReadWriteData;

import java.util.Properties;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnCreativesPage implements ISpotOnCreativesPage {

    Properties p = new Properties();
    ReadWriteData rwd = new ReadWriteData();
    ApplicationData ad = new ApplicationData();
    //WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(),10);
    //SelenideElement campaignValue = (SelenideElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='"+ SystemProperties.creativeKey+"']")));
    //SelenideElement campaignValue = $x("//p[text()= 'c0rxomK Automation']");
    SelenideElement creativesLabel = $x("//label[text()='Creatives']");
    SelenideElement newCreativeBtn = $x("//button[text()='+ New creative']");
    SelenideElement campaign = $x("//app-so-input[@label='Campaign']//input");
    SelenideElement campaignValue = $x("//p[text()='" + ad.CREATIVE_KEY() + "']");
    SelenideElement campaignValueAM = $x("//p[text()='" + rwd.readDataAM(p) + "']");
    //SelenideElement campaignValueAM = $x("//p[text()='vHifxVT Automation']");
    SelenideElement name = $x("//app-so-input[@label='Name']//input");
    SelenideElement clickTagURL = $x("//app-so-input[@label='ClickTag URL']//input");
    SelenideElement format = $x("//ion-select[@aria-label='Format *']");
    SelenideElement formatValue = $x("(//ion-radio-group//ion-radio)[1]");
    SelenideElement size = $x("//ion-select[@aria-label='Size *']");
    SelenideElement sizeValue = $x("(//ion-radio-group//ion-radio)[1]");
    SelenideElement selectFileBtn = $x("//button[text()='+ Select File']");
    SelenideElement addToQueue = $x("//button[text()='Add to queue']");
    SelenideElement sendCreativesForReviewBtn = $x("//button[text()=' Send Creatives to Review']");
    SelenideElement selectFile = $x("//input[@type='file']");

    // Verify whether the respective page is Creatives page
    @Override
    public ISpotOnCreativesPage verifyCreativesPage() {

        String label = creativesLabel.getText();
        Assert.assertEquals(label, "Creatives");
        return SpotOnPageFactory.getCreativesPage();
    }

    // Click on New Creative Button
    @Override
    public ISpotOnCreativesPage clickNewCreativeBtn() {

        newCreativeBtn.click();
        return SpotOnPageFactory.getCreativesPage();
    }

    // Enter Campaign value for Service user
    @Override
    public ISpotOnCreativesPage enterCampaign(String campValue) {

        System.out.println("Campaign Value " + campValue);
        campaign.sendKeys(campValue);
        campaignValue.click();
        return SpotOnPageFactory.getCreativesPage();
    }

    // Enter Campaign value for Account Manager user
    @Override
    public ISpotOnCreativesPage enterCampaignAM(String campValueAM) {


        campaign.sendKeys(campValueAM);
        campaignValueAM.click();
        return SpotOnPageFactory.getCreativesPage();
    }

    // Enter Creative Name for Service User
    @Override
    public ISpotOnCreativesPage enterName(String nameValue) {

        System.out.println("Creative: " + nameValue);
        name.sendKeys(nameValue);
        return SpotOnPageFactory.getCreativesPage();
    }

    // Enter Creative Name for Creative Manager User
    @Override
    public ISpotOnCreativesPage enterNameCM(String nameValueCM) {

        name.sendKeys(nameValueCM);
        return SpotOnPageFactory.getCreativesPage();
    }

    // Enter value for Click Tag URL field
    @Override
    public ISpotOnCreativesPage enterClickTagURL(String tagURL) {

        clickTagURL.sendKeys(tagURL);
        return SpotOnPageFactory.getCreativesPage();
    }

    // Select Format
    @Override
    public ISpotOnCreativesPage selectFormat() {

        format.click();
        formatValue.click();
        return SpotOnPageFactory.getCreativesPage();
    }

    // Select Size
    @Override
    public ISpotOnCreativesPage selectSize() {

        size.click();
        sizeValue.click();
        return SpotOnPageFactory.getCreativesPage();
    }

    // Select File to Upload
    @Override
    public ISpotOnCreativesPage selectFile() {

        try {

            Thread.sleep(5000);
            String s = System.getProperty("user.dir") + "/test1.jpg";
            System.out.println("path: " + s);
            selectFile.scrollIntoView(true).sendKeys(s);
            Thread.sleep(5000);
        } catch (Exception e) {

            e.printStackTrace();
        }


        return SpotOnPageFactory.getCreativesPage();
    }

    // Click on Add to queue Button
    @Override
    public ISpotOnCreativesPage clickAddToQueueBtn() {

        try {
            Thread.sleep(5000);
            addToQueue.scrollIntoView(true).click();
            Thread.sleep(7000);
        } catch (Exception e) {

            e.printStackTrace();
        }
        return SpotOnPageFactory.getCreativesPage();
    }

    // Click on Send Creatives for Review Button
    @Override
    public ISpotOnCreativesPage clickSendCreativesForReviewBtn() {

        try {
            Thread.sleep(3000);
            sendCreativesForReviewBtn.click();
            Thread.sleep(3000);
        } catch (Exception e) {

            e.printStackTrace();
        }
        return SpotOnPageFactory.getCreativesPage();
    }


}
