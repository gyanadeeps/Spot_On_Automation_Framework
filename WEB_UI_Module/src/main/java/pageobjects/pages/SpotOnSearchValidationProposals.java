package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnSearchValidationProposals implements ISpotOnSearchValidationProposals {

    SelenideElement proposalsLabel = $x("//label[text()='Proposals']");
    SelenideElement search = $x("//input[@placeholder='Search']");
    SelenideElement proposal = $x("(//ion-grid)[2]//ion-row[2]//ion-col[1]");;

    // Verify whether the respective page is Proposals page
    @Override
    public ISpotOnSearchValidationProposals verifyProposalsPage(){

        String label = proposalsLabel.getText();
        Assert.assertEquals(label,"Proposals");
        return SpotOnPageFactory.verifySearchValidationProposals();
    }

    // Enter Proposal value in Search box for Service User
    @Override
    public ISpotOnSearchValidationProposals enterSearchKeyword(String searchKey) {

        // String s = rwd.getStr();
        search.sendKeys(searchKey);
        search.sendKeys(Keys.ENTER);
        return SpotOnPageFactory.verifySearchValidationProposals();
    }
    
    // Click on searched proposal for Service User
    @Override
    public ISpotOnSearchValidationProposals verifyProposal() {

        try {
            Thread.sleep(3000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        String proposalValue = proposal.getText();
        boolean val = proposalValue.contains("Spot");
        Assert.assertTrue(val);
        return SpotOnPageFactory.verifySearchValidationProposals();
    }
}
