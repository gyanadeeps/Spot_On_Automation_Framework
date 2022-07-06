package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import data.ApplicationData;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;
import utilities.ReadWriteData;

import java.util.Properties;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnEditProposalServiceUser implements ISpotOnEditProposalServiceUser {

    Properties p = new Properties();
    ReadWriteData rwd = new ReadWriteData();
    SelenideElement proposalsLabel = $x("//label[text()='Proposals']");
    SelenideElement search = $x("//input[@placeholder='Search']");
    SelenideElement proposal = $x("//span[text()='"+ rwd.readData(p)+"']");
    SelenideElement description = $x("//textarea[contains(@class,'sc-ion-textarea-md')]");
    SelenideElement updateBtn = $x("//body/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-home[1]/ion-split-pane[1]/ion-router-outlet[1]/app-proposal[1]/ion-content[1]/ion-router-outlet[1]/app-create-proposal[1]/ion-content[1]/form[1]/app-base-entity-action-buttons[1]/div[1]/div[1]/div[1]/div[1]/app-so-button[1]/div[1]");
    SelenideElement noBtn = $x("//button//span[text()='No']");

    @Override
    public ISpotOnEditProposalServiceUser verifyProposalsPage(){

        String label = proposalsLabel.getText();
        Assert.assertEquals(label,"Proposals");
        return SpotOnPageFactory.verifyEditProposalServiceUser();
    }

    @Override
    public ISpotOnEditProposalServiceUser enterSearchKeyword(String searchKey) {

        // String s = rwd.getStr();
        System.out.println("Campaign Key:"+searchKey);
        search.sendKeys(searchKey);
        search.sendKeys(Keys.ENTER);
        return SpotOnPageFactory.verifyEditProposalServiceUser();
    }

    @Override
    public ISpotOnEditProposalServiceUser clickProposal() {

        proposal.click();
        return SpotOnPageFactory.verifyEditProposalServiceUser();
    }
    
    @Override
    public ISpotOnEditProposalServiceUser enterDescription(String descValue) {

        description.clear();
        description.sendKeys(descValue);
        return SpotOnPageFactory.verifyEditProposalServiceUser();
    }

    @Override
    public ISpotOnEditProposalServiceUser clickUpdateBtn() {

        try {

            updateBtn.scrollIntoView(true).click();
            Thread.sleep(5000);
            noBtn.click();
            //Selenide.executeJavaScript("arguments[0].click;",noBtn);
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return SpotOnPageFactory.verifyEditProposalServiceUser();
    }
}
