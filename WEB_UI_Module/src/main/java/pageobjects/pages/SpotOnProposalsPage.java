package pageobjects.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;
import utilities.ReadWriteData;

import java.io.File;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnProposalsPage implements ISpotOnProposalsPage {

    Properties p = new Properties();
    Properties p1 = new Properties();
    ReadWriteData rwd = new ReadWriteData();

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

    // Verify whether the respective page is Proposals page
    @Override
    public ISpotOnProposalsPage verifyProposalsPage() {

        String label = proposalsLabel.getText();
        Assert.assertEquals(label,"Proposals");
        return SpotOnPageFactory.getProposalsPage();
    }

    // Click on New Proposals Button
    @Override
    public ISpotOnProposalsPage clickOnNewProposalBtn() {
        newProposalBtn.click();
        return SpotOnPageFactory.getProposalsPage();
    }

    // Enter Proposal Name for Service User
    @Override
    public ISpotOnProposalsPage enterProposalName(String propName) {


        /*if(rwd.readDataAM(p) != null){
            System.out.println("AM" + rwd.readDataAM(p));
            p.setProperty("proposalAM",rwd.readDataAM(p));
        }*/
        System.out.println(propName);
        p.setProperty("proposal",propName);
        rwd.writeData(p);
        proposalName.sendKeys(rwd.readData(p));
        System.out.println(p);
        return SpotOnPageFactory.getProposalsPage();
    }

    // Enter Proposal Name for Account Manager
    @Override
    public ISpotOnProposalsPage enterProposalNameAM(String propNameAM) {

        //if(rwd.readData(p) != null) p.setProperty("proposal",rwd.readData(p));
        System.out.println(propNameAM);
        p1.setProperty("proposalAM",propNameAM);
        rwd.writeDataAM(p1);
        proposalName.sendKeys(rwd.readDataAM(p1));
        System.out.println(p1);
        return SpotOnPageFactory.getProposalsPage();
    }

    // Enter Description
    @Override
    public ISpotOnProposalsPage enterDescription(String desc) {
        description.sendKeys(desc);
        return SpotOnPageFactory.getProposalsPage();
    }

    // Select Campaign Type
    @Override
    public ISpotOnProposalsPage selCampaignType() {
        campaignType.click();
        return SpotOnPageFactory.getProposalsPage();
    }

    // Enter Start Date
    @Override
    public ISpotOnProposalsPage enterStartDate(String sDate) {
        startDate.sendKeys(sDate);
        return SpotOnPageFactory.getProposalsPage();
    }

    // Enter End Date
    @Override
    public ISpotOnProposalsPage enterEndDate(String eDate) {
        endDate.sendKeys(eDate);
        return SpotOnPageFactory.getProposalsPage();
    }

    // Enter value in Click Tag URL field
    @Override
    public ISpotOnProposalsPage enterClickTagURL(String URL) {
        clickTagURL.sendKeys(URL);
        return SpotOnPageFactory.getProposalsPage();
    }

    // Click on Select Publisher button
    @Override
    public ISpotOnProposalsPage clickSelectPublisherBtn() {

        Selenide.executeJavaScript("arguments[0].click();", searchAndSelectPublisher);
        //searchAndSelectPublisher.click();
        return SpotOnPageFactory.getProposalsPage();
    }

    // Click on Add More Local Publisher button
    @Override
    public ISpotOnProposalsPage clickAddMoreLocalPublisherBtn() {
        addMoreLocalPublisher.click();
        return SpotOnPageFactory.getProposalsPage();
    }

    // Select Local Publisher
    @Override
    public ISpotOnProposalsPage selLocalPublishers() {
        localPublisher.click();
        return SpotOnPageFactory.getProposalsPage();
    }

    // Click Use Chosen button
    @Override
    public ISpotOnProposalsPage clickUseChosenBtn() {
        useChosenBtn.click();
        return SpotOnPageFactory.getProposalsPage();
    }

    // Click on Save Changes Button
    @Override
    public ISpotOnProposalsPage clickSaveChangesBtn() {
        //Selenide.executeJavaScript("arguments[0].click();",saveChangesBtn);
        saveChangesBtn.scrollIntoView(true).click();
        return SpotOnPageFactory.getProposalsPage();
    }

    // Click on Save Button
    @Override
    public ISpotOnProposalsPage clickSaveBtn() {
        //WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Selenide.executeJavaScript("arguments[0].click();",saveBtn);
        //saveBtn.click();
        return SpotOnPageFactory.getProposalsPage();
    }

}
