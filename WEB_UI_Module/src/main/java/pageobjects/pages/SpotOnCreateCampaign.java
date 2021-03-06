package pageobjects.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import data.ApplicationData;
import data.SystemProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;
import utilities.ReadWriteData;

import java.util.Properties;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnCreateCampaign implements ISpotOnCreateCampaign{


    Properties p = new Properties();
    ReadWriteData rwd = new ReadWriteData();
    ApplicationData ad = new ApplicationData();
    SelenideElement buyBtn = $x("//ion-checkbox[@role='checkbox']");
    SelenideElement proposalsLabel = $x("//label[text()='Proposals']");
    SelenideElement search = $x("//input[@placeholder='Search']");
    SelenideElement proposal = $x("//span[text()='"+ rwd.readData(p)+"']");
    SelenideElement proposalAM = $x("//span[text()='"+ ad.CAMPAIGN_KEY_AM()+"']");
    SelenideElement description = $x("//textarea[contains(@class,'sc-ion-textarea-md')]");
    SelenideElement searchAndSelectPublisher = $x("//button[text()='+ Search and Select a Publisher ']");
    SelenideElement addNationalPublisher = $x("//button[text()='+ Add More National Publishers? ']");
    SelenideElement publisher = $x("//ion-row[2]//ion-checkbox");
    SelenideElement searchField = $x("(//input[@placeholder='Search'])[2]");
    SelenideElement useChosenBtn = $x("//button[text()=' Use Chosen ']");
    SelenideElement saveChangesBtn = $x("//app-so-button[@class='save-changes']//button[text()=' Save Changes']");
    SelenideElement downIcon = $x("//ion-row[2]//ion-col[4]//ion-icon[3]");
    SelenideElement desiredImpressions = $x("//td[7]/ion-input[@placeholder='0']//input");
    SelenideElement allocatedBudget = $x("//td[8]/ion-input[@placeholder='0']//input");
    //SelenideElement buyBtn = $x("(//ion-checkbox[contains(@class,'ng-valid')])[1]");
    SelenideElement updateBtn = $x("//body/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-home[1]/ion-split-pane[1]/ion-router-outlet[1]/app-proposal[1]/ion-content[1]/ion-router-outlet[1]/app-create-proposal[1]/ion-content[1]/form[1]/app-base-entity-action-buttons[1]/div[1]/div[1]/div[1]/div[1]/app-so-button[1]/div[1]");
    SelenideElement createNewCampaignBtn = $x("//button[text()='Create New Campaign ']");
    SelenideElement noBtn = $x("//button//span[text()='No']");
    SelenideElement yesBtn = $x("//button//span[text()='Yes']");
    SelenideElement closeBtn = $x("//button//span[text()='Close']");

    // Verify whether the respective page is Proposals page
    @Override
    public ISpotOnCreateCampaign verifyProposalsPage(){

        String label = proposalsLabel.getText();
        Assert.assertEquals(label,"Proposals");
        return SpotOnPageFactory.getCampaign();
    }

    // Enter Proposal value in Search box for Service User
    @Override
    public ISpotOnCreateCampaign enterSearchKeyword(String searchKey) {

       // String s = rwd.getStr();
        System.out.println("Campaign Key:"+searchKey);
        search.sendKeys(searchKey);
        search.sendKeys(Keys.ENTER);
        return SpotOnPageFactory.getCampaign();
    }

    // Enter Proposal value in Search box for Account Manager User
    @Override
    public ISpotOnCreateCampaign enterSearchKeywordAM(String searchKeyAM) {

        System.out.println("Campaign Value "+searchKeyAM);
        search.sendKeys(searchKeyAM);
        search.sendKeys(Keys.ENTER);
        return SpotOnPageFactory.getCampaign();
    }

    // Click on searched proposal for Service User
    @Override
    public ISpotOnCreateCampaign clickProposal() {

        proposal.click();
        return SpotOnPageFactory.getCampaign();
    }

    // Click on searched proposal for Account Manager User
    @Override
    public ISpotOnCreateCampaign clickProposalAM() {

        proposalAM.click();
        return SpotOnPageFactory.getCampaign();
    }

    // Enter Description
    @Override
    public ISpotOnCreateCampaign enterDescription(String descValue) {

        description.sendKeys(descValue);
        return SpotOnPageFactory.getCampaign();
    }

    // Click on Search and Select Publisher Button
    @Override
    public ISpotOnCreateCampaign clickSearchAndSelectPublisher() {

        searchAndSelectPublisher.scrollIntoView(true).click();
        return SpotOnPageFactory.getCampaign();
    }

    // Click on Add More National Publisher Button
    @Override
    public ISpotOnCreateCampaign clickAddMoreNationalPublisher() {

        addNationalPublisher.click();
        return SpotOnPageFactory.getCampaign();
    }

    // Select National Publisher
    @Override
    public ISpotOnCreateCampaign selectNationalPublisher(String publisherValue) {

        try {
            Thread.sleep(3000);
            searchField.sendKeys(publisherValue);
            searchField.sendKeys(Keys.ENTER);
            Thread.sleep(5000);
            publisher.click();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return SpotOnPageFactory.getCampaign();
    }

    // Click on USe Chosen Button
    @Override
    public ISpotOnCreateCampaign clickUseChosenBtn() {

        useChosenBtn.click();
        return SpotOnPageFactory.getCampaign();
    }

    // Click on Save Changes Button
    @Override
    public ISpotOnCreateCampaign clickSaveChangesBtn() {
        try {


            Thread.sleep(5000);
            saveChangesBtn.scrollIntoView(true).click();

            Thread.sleep(2000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return SpotOnPageFactory.getCampaign();
    }

    // Click on Down arrow icon
    @Override
    public ISpotOnCreateCampaign clickDownIcon() {

        downIcon.click();
        return SpotOnPageFactory.getCampaign();
    }

    // Enter Desired Impression
    @Override
    public ISpotOnCreateCampaign enterDesiredImpressions(String desiredValue) {

        desiredImpressions.clear();
        desiredImpressions.sendKeys(desiredValue);

        return SpotOnPageFactory.getCampaign();
    }

    // Enter Allocated Budget
    @Override
    public ISpotOnCreateCampaign enterAllocatedBudget(String budgetValue) {

        allocatedBudget.sendKeys(budgetValue);
        return SpotOnPageFactory.getCampaign();
    }

    // Select Buy Button
    @Override
    public ISpotOnCreateCampaign selectBuyBtn() {

        WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(),20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ion-checkbox[@role='checkbox']")));

        buyBtn.click();
        //Selenide.executeJavaScript("arguments[0].click();",buyBtn);
        return SpotOnPageFactory.getCampaign();
    }

    // Click Update Button
    @Override
    public ISpotOnCreateCampaign clickUpdateBtn() {

        try {

            updateBtn.click();
            Thread.sleep(5000);
            noBtn.click();
            //Selenide.executeJavaScript("arguments[0].click;",noBtn);
            Thread.sleep(2000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return SpotOnPageFactory.getCampaign();
    }

    // Click Create New Campaign Button
    @Override
    public ISpotOnCreateCampaign clickCreateNewCampaignBtn() {

        try{
            createNewCampaignBtn.scrollIntoView(true).click();
            Thread.sleep(5000);
            yesBtn.click();
            Thread.sleep(5000);
            closeBtn.click();
            Thread.sleep(2000);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return SpotOnPageFactory.getCampaign();
    }

}
