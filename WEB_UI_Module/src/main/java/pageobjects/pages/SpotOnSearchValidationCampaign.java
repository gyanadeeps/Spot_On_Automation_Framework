package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;

import static com.codeborne.selenide.Selenide.$x;

public class
SpotOnSearchValidationCampaign implements ISpotOnSearchValidationCampaign {

    SelenideElement campaignsLabel = $x("//label[text()='Campaigns']");
    SelenideElement search = $x("//input[@placeholder='Search']");
    SelenideElement campaign = $x("(//ion-grid)[2]//ion-row[2]//ion-col[1]//span");

    // Verify whether the respective page is Campaign page
    @Override
    public ISpotOnSearchValidationCampaign verifyCampaignPage() {

        String label = campaignsLabel.getText();
        Assert.assertEquals(label, "Campaigns");
        return SpotOnPageFactory.verifySearchValidationCampaign();
    }

    // Enter Campaign value in Search box for Service User
    @Override
    public ISpotOnSearchValidationCampaign enterSearchKeyword(String searchKey) {

        search.sendKeys(searchKey);
        search.sendKeys(Keys.ENTER);
        return SpotOnPageFactory.verifySearchValidationCampaign();
    }

    // Verify searched campaign for Service User
    @Override
    public ISpotOnSearchValidationCampaign verifyCampaign() {

        try {
            Thread.sleep(3000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        String campaignValue = campaign.getText();
        System.out.println(campaignValue);
        boolean val = campaignValue.indexOf("Spot") != -1 ? true : false ;
        Assert.assertTrue(val);
        return SpotOnPageFactory.verifySearchValidationCampaign();
    }
}
