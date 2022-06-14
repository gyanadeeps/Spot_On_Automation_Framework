package pageobjects.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnProposalsPage implements ISpotOnProposalsPage {

    SelenideElement proposalsLabel = $x("//label[text()='Proposals']");
    SelenideElement newProposalBtn = $x("//button[contains(text(),'New Proposal')]");
    SelenideElement proposalName = $x("//app-so-input[@label='Proposal Name']//input[contains(@class,'native-input')]");
    SelenideElement description = $x("//textarea[contains(@class,'sc-ion-textarea-md')]");
    SelenideElement campaignType = $x("//ion-radio[@aria-labelledby='ion-rb-0-lbl']");
    SelenideElement startDate = $x("//app-so-datetime[@label='Start Date']//input[contains(@class,'native-input')]");
    SelenideElement endDate = $x("//app-so-datetime[@label='End Date']//input[contains(@class,'native-input')]");
    SelenideElement clickTagURL = $x("//app-so-input[@label='ClickTag URL']//input");
    SelenideElement searchAndSelectPublisher = $x("//button[text()='+ Search and Select a Publisher ']");
    SelenideElement addMoreLocalPublisher = $x("//button[text()='+ Add More Local Publishers? ']");
    SelenideElement localPublisher = $x("//span[text()='Gyan Test 1']");
    SelenideElement useChosenBtn = $x("//button[text()=' Use Chosen ']");
    SelenideElement saveChangesBtn = $x("//button[text()=' Save Changes']");
    SelenideElement saveBtn = $x("(//button[text()='Save'])[2]");

    @Override
    public ISpotOnProposalsPage verifyProposalsPage() {

        String label = proposalsLabel.getText();
        Assert.assertEquals(label,"Proposals");
        return SpotOnPageFactory.getProposalsPage();
    }

    @Override
    public ISpotOnProposalsPage clickOnNewProposalBtn() {
        newProposalBtn.click();
        return SpotOnPageFactory.getProposalsPage();
    }

    @Override
    public ISpotOnProposalsPage enterProposalName(String propName) {
        proposalName.sendKeys(propName);
        return SpotOnPageFactory.getProposalsPage();
    }

    @Override
    public ISpotOnProposalsPage enterDescription(String desc) {
        description.sendKeys(desc);
        return SpotOnPageFactory.getProposalsPage();
    }

    @Override
    public ISpotOnProposalsPage selCampaignType() {
        campaignType.click();
        return SpotOnPageFactory.getProposalsPage();
    }

    @Override
    public ISpotOnProposalsPage enterStartDate(String sDate) {
        startDate.sendKeys(sDate);
        return SpotOnPageFactory.getProposalsPage();
    }

    @Override
    public ISpotOnProposalsPage enterEndDate(String eDate) {
        endDate.sendKeys(eDate);
        return SpotOnPageFactory.getProposalsPage();
    }

    @Override
    public ISpotOnProposalsPage enterClickTagURL(String URL) {
        clickTagURL.sendKeys(URL);
        return SpotOnPageFactory.getProposalsPage();
    }

    @Override
    public ISpotOnProposalsPage clickSelectPublisherBtn() {

        Selenide.executeJavaScript("arguments[0].click();", searchAndSelectPublisher);
        //searchAndSelectPublisher.click();
        return SpotOnPageFactory.getProposalsPage();
    }

    @Override
    public ISpotOnProposalsPage clickAddMoreLocalPublisherBtn() {
        addMoreLocalPublisher.click();
        return SpotOnPageFactory.getProposalsPage();
    }

    @Override
    public ISpotOnProposalsPage selLocalPublishers() {
        localPublisher.click();
        return SpotOnPageFactory.getProposalsPage();
    }

    @Override
    public ISpotOnProposalsPage clickUseChosenBtn() {
        useChosenBtn.click();
        return SpotOnPageFactory.getProposalsPage();
    }

    @Override
    public ISpotOnProposalsPage clickSaveChangesBtn() {
        //Selenide.executeJavaScript("arguments[0].click();",saveChangesBtn);
        saveChangesBtn.scrollIntoView(true).click();
        return SpotOnPageFactory.getProposalsPage();
    }

    @Override
    public ISpotOnProposalsPage clickSaveBtn() {
        //WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Selenide.executeJavaScript("arguments[0].click();",saveBtn);
        //saveBtn.click();
        return SpotOnPageFactory.getProposalsPage();
    }

}
