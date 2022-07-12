package pageobjects.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnCampaignPublisherUser implements ISpotOnCampaignPublisherUser {

    SelenideElement campaignsLabel = $x("//label[text()='Campaigns']");
    SelenideElement campaignsValue = $x("(//ion-row[2]//ion-col[1])[2]");
    SelenideElement updateButton = $x("//button[text()='Update ']");

    // Verify whether the respective page is Campaign Page
    @Override
    public ISpotOnCampaignPublisherUser verifyCampaignsLabel() {

        String label = campaignsLabel.getText();
        Assert.assertEquals(label,"Campaigns");
        return SpotOnPageFactory.getCampaignsPage();
    }

    // Select or open any Campaign
    @Override
    public ISpotOnCampaignPublisherUser selectCampaign() {

        campaignsValue.click();
        return SpotOnPageFactory.getCampaignsPage();
    }

    // Verify that Update Button is not present
    @Override
    public ISpotOnCampaignPublisherUser verifyUpdateButtonNotPresent() {

        Selenide.executeJavaScript("window.scrollTo(0, document.body.scrollHeight)");
        Boolean val = updateButton.isDisplayed();
        System.out.println("Value: "+val);
        Assert.assertFalse(val);
        return SpotOnPageFactory.getCampaignsPage();
    }
}
