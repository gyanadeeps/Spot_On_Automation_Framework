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

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnCreativesPage implements ISpotOnCreativesPage {

    ApplicationData ad = new ApplicationData();
    //WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(),10);
    //SelenideElement campaignValue = (SelenideElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='"+ SystemProperties.creativeKey+"']")));
    //SelenideElement campaignValue = $x("//p[text()= 'c0rxomK Automation']");
    SelenideElement creativesLabel = $x("//label[text()='Creatives']");
    SelenideElement newCreativeBtn = $x("//button[text()='+ New creative']");
    SelenideElement campaign = $x("//app-so-input[@label='Campaign']//input");
    SelenideElement campaignValue = $x("//p[text()='" + ad.CREATIVE_KEY() + "']");
    SelenideElement campaignValueAM = $x("//p[text()='" + ad.CREATIVE_KEY_AM() + "']");
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

    @Override
    public ISpotOnCreativesPage verifyCreativesPage() {

        String label = creativesLabel.getText();
        Assert.assertEquals(label, "Creatives");
        return SpotOnPageFactory.getCreativesPage();
    }

    @Override
    public ISpotOnCreativesPage clickNewCreativeBtn() {

        newCreativeBtn.click();
        return SpotOnPageFactory.getCreativesPage();
    }

    @Override
    public ISpotOnCreativesPage enterCampaign(String campValue) {

        System.out.println("Campaign Value " + campValue);
        campaign.sendKeys(campValue);
        campaignValue.click();
        return SpotOnPageFactory.getCreativesPage();
    }

    @Override
    public ISpotOnCreativesPage enterCampaignAM(String campValueAM) {


        campaign.sendKeys(campValueAM);
        campaignValueAM.click();
        return SpotOnPageFactory.getCreativesPage();
    }

    @Override
    public ISpotOnCreativesPage enterName(String nameValue) {

        System.out.println("Creative: " + nameValue);
        name.sendKeys(nameValue);
        return SpotOnPageFactory.getCreativesPage();
    }

    @Override
    public ISpotOnCreativesPage enterNameCM(String nameValueCM) {

        name.sendKeys(nameValueCM);
        return SpotOnPageFactory.getCreativesPage();
    }

    @Override
    public ISpotOnCreativesPage enterClickTagURL(String tagURL) {

        clickTagURL.sendKeys(tagURL);
        return SpotOnPageFactory.getCreativesPage();
    }

    @Override
    public ISpotOnCreativesPage selectFormat() {

        format.click();
        formatValue.click();
        return SpotOnPageFactory.getCreativesPage();
    }

    @Override
    public ISpotOnCreativesPage selectSize() {

        size.click();
        sizeValue.click();
        return SpotOnPageFactory.getCreativesPage();
    }

    @Override
    public ISpotOnCreativesPage selectFile() {

        try {
            /*Selenide.executeJavaScript("arguments[0].click();",selectFileBtn);
            Thread.sleep(3000);
            StringSelection ss = new StringSelection("C:\\Users\\team9\\Desktop\\test1.jpg");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

            // Ctrl + v
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(3000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);*/

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
