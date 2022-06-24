package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import data.SystemProperties;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;
import utilities.ReadWriteData;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnCreateCampaign implements ISpotOnCreateCampaign{



    SelenideElement proposalsLabel = $x("//label[text()='Proposals']");
    SelenideElement search = $x("//input[@placeholder='Search']");
    SelenideElement proposal = $x("//span[text()='"+ SystemProperties.campaignKey+"']");
    SelenideElement proposalAM = $x("//span[text()='"+ SystemProperties.campaignKeyAM+"']");
    SelenideElement description = $x("//textarea[contains(@class,'sc-ion-textarea-md')]");
    SelenideElement searchAndSelectPublisher = $x("//button[text()='+ Search and Select a Publisher ']");
    SelenideElement addNationalPublisher = $x("//button[text()='+ Add More National Publishers? ']");
    SelenideElement publisher = $x("//span[text()='Achin Test June']");
    SelenideElement useChosenBtn = $x("//button[text()=' Use Chosen ']");
    SelenideElement saveChangesBtn = $x("//app-so-button[@class='save-changes']//button[text()=' Save Changes']");
    SelenideElement downIcon = $x("//ion-row[2]//ion-col[4]//ion-icon[3]");
    SelenideElement desiredImpressions = $x("//td[7]/ion-input[@placeholder='0']//input");
    SelenideElement allocatedBudget = $x("//td[8]/ion-input[@placeholder='0']//input");
    SelenideElement buyBtn = $x("//ion-checkbox[contains(@class,'ng-valid')]");
    SelenideElement updateBtn = $x("//body/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-home[1]/ion-split-pane[1]/ion-router-outlet[1]/app-proposal[1]/ion-content[1]/ion-router-outlet[1]/app-create-proposal[1]/ion-content[1]/form[1]/app-base-entity-action-buttons[1]/div[1]/div[1]/div[1]/div[1]/app-so-button[1]/div[1]");
    SelenideElement createNewCampaignBtn = $x("//button[text()='Create New Campaign ']");
    SelenideElement noBtn = $x("//button//span[text()='No']");
    SelenideElement yesBtn = $x("//button//span[text()='Yes']");
    SelenideElement closeBtn = $x("//button//span[text()='Close']");

    @Override
    public ISpotOnCreateCampaign verifyProposalsPage(){

        String label = proposalsLabel.getText();
        Assert.assertEquals(label,"Proposals");
        return SpotOnPageFactory.getCampaign();
    }

    @Override
    public ISpotOnCreateCampaign enterSearchKeyword(String searchKey) {

       // String s = rwd.getStr();
        System.out.println("Campaign Key:"+searchKey);
        search.sendKeys(searchKey);
        search.sendKeys(Keys.ENTER);
        return SpotOnPageFactory.getCampaign();
    }

    @Override
    public ISpotOnCreateCampaign enterSearchKeywordAM(String searchKeyAM) {

        search.sendKeys(searchKeyAM);
        search.sendKeys(Keys.ENTER);
        return SpotOnPageFactory.getCampaign();
    }

    @Override
    public ISpotOnCreateCampaign clickProposal() {

        proposal.click();
        return SpotOnPageFactory.getCampaign();
    }

    @Override
    public ISpotOnCreateCampaign clickProposalAM() {

        proposalAM.click();
        return SpotOnPageFactory.getCampaign();
    }

    @Override
    public ISpotOnCreateCampaign enterDescription(String descValue) {

        description.sendKeys(descValue);
        return SpotOnPageFactory.getCampaign();
    }

    @Override
    public ISpotOnCreateCampaign clickSearchAndSelectPublisher() {

        searchAndSelectPublisher.scrollIntoView(true).click();
        return SpotOnPageFactory.getCampaign();
    }

    @Override
    public ISpotOnCreateCampaign clickAddMoreNationalPublisher() {

        addNationalPublisher.click();
        return SpotOnPageFactory.getCampaign();
    }

    @Override
    public ISpotOnCreateCampaign selectNationalPublisher() {

        try {
            Thread.sleep(3000);
            publisher.click();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return SpotOnPageFactory.getCampaign();
    }

    @Override
    public ISpotOnCreateCampaign clickUseChosenBtn() {

        useChosenBtn.click();
        return SpotOnPageFactory.getCampaign();
    }

    @Override
    public ISpotOnCreateCampaign clickSaveChangesBtn() {
        try {

            Thread.sleep(5000);
            saveChangesBtn.scrollIntoView(true).click();

            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return SpotOnPageFactory.getCampaign();
    }

    @Override
    public ISpotOnCreateCampaign clickDownIcon() {

        downIcon.click();
        return SpotOnPageFactory.getCampaign();
    }

    @Override
    public ISpotOnCreateCampaign enterDesiredImpressions(String desiredValue) {

        desiredImpressions.sendKeys(desiredValue);
        return SpotOnPageFactory.getCampaign();
    }

    @Override
    public ISpotOnCreateCampaign enterAllocatedBudget(String budgetValue) {

        allocatedBudget.sendKeys(budgetValue);
        return SpotOnPageFactory.getCampaign();
    }

    @Override
    public ISpotOnCreateCampaign selectBuyBtn() {

        buyBtn.click();
        return SpotOnPageFactory.getCampaign();
    }

    @Override
    public ISpotOnCreateCampaign clickUpdateBtn() {

        try {

            updateBtn.click();
            Thread.sleep(7000);
            noBtn.click();
            Thread.sleep(7000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return SpotOnPageFactory.getCampaign();
    }

    @Override
    public ISpotOnCreateCampaign clickCreateNewCampaignBtn() {

        try{
            createNewCampaignBtn.scrollIntoView(true).click();
            Thread.sleep(5000);
            yesBtn.click();
            Thread.sleep(5000);
            closeBtn.click();
            Thread.sleep(5000);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return SpotOnPageFactory.getCampaign();
    }


}
