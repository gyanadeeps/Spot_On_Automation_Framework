package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import data.ApplicationData;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;
import utilities.ReadWriteData;

import java.util.Properties;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnEditProposal implements ISpotOnEditProposal {

    Properties p = new Properties();
    ReadWriteData rwd = new ReadWriteData();
    ApplicationData ad = new ApplicationData();
    SelenideElement proposalsLabel = $x("//label[text()='Proposals']");
    SelenideElement search = $x("//input[@placeholder='Search']");
    SelenideElement proposal = $x("//span[text()='"+ rwd.readData(p)+"']");
    SelenideElement proposalAM = $x("//span[text()='"+ ad.CAMPAIGN_KEY_AM()+"']");
    SelenideElement description = $x("//textarea[contains(@class,'sc-ion-textarea-md')]");
    SelenideElement updateBtn = $x("//body/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-home[1]/ion-split-pane[1]/ion-router-outlet[1]/app-proposal[1]/ion-content[1]/ion-router-outlet[1]/app-create-proposal[1]/ion-content[1]/form[1]/app-base-entity-action-buttons[1]/div[1]/div[1]/div[1]/div[1]/app-so-button[1]/div[1]");
    SelenideElement noBtn = $x("//button//span[text()='No']");

    // Verify whether the respective page is Proposal Page
    @Override
    public ISpotOnEditProposal verifyProposalsPage(){

        String label = proposalsLabel.getText();
        Assert.assertEquals(label,"Proposals");
        return SpotOnPageFactory.verifyEditProposalServiceUser();
    }

    // Enter Proposal value in Search box for Service User
    @Override
    public ISpotOnEditProposal enterSearchKeyword(String searchKey) {

        // String s = rwd.getStr();
        System.out.println("Campaign Key:"+searchKey);
        search.sendKeys(searchKey);
        search.sendKeys(Keys.ENTER);
        return SpotOnPageFactory.verifyEditProposalServiceUser();
    }

    // Enter Proposal value in Search box for Account Manager User
    @Override
    public ISpotOnEditProposal enterSearchKeywordAM(String searchKeyAM) {

        System.out.println("Campaign Value "+searchKeyAM);
        search.sendKeys(searchKeyAM);
        search.sendKeys(Keys.ENTER);
        return SpotOnPageFactory.verifyEditProposalServiceUser();
    }

    // Click on searched proposal (Service User)
    @Override
    public ISpotOnEditProposal clickProposal() {

        proposal.click();
        return SpotOnPageFactory.verifyEditProposalServiceUser();
    }

    // Click on searched proposal (Account Manager User)
    @Override
    public ISpotOnEditProposal clickProposalAM() {

        proposalAM.click();
        return SpotOnPageFactory.verifyEditProposalServiceUser();
    }

    // Enter Description
    @Override
    public ISpotOnEditProposal enterDescription(String descValue) {

        description.clear();
        description.sendKeys(descValue);
        return SpotOnPageFactory.verifyEditProposalServiceUser();
    }

    // Click on Update Button
    @Override
    public ISpotOnEditProposal clickUpdateBtn() {

        try {

            updateBtn.scrollIntoView(true).click();
            Thread.sleep(5000);
            noBtn.click();
            //Selenide.executeJavaScript("arguments[0].click;",noBtn);
            Thread.sleep(2000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return SpotOnPageFactory.verifyEditProposalServiceUser();
    }
}
