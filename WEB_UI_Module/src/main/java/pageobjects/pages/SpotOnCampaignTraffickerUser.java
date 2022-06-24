package pageobjects.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnCampaignTraffickerUser implements ISpotOnCampaignTraffickerUser {

    SelenideElement campaignsLabel = $x("//label[text()='Campaigns']");
    SelenideElement campaignsValue = $x("(//ion-row[2]//ion-col[1])[2]");
    SelenideElement updateButton = $x("//button[text()='Update ']");
    SelenideElement campaignName = $x("//app-so-input[@label='Campaign Name']//ion-item");
    SelenideElement description = $x("//app-so-textarea[@label='Description']//ion-item");

    @Override
    public ISpotOnCampaignTraffickerUser verifyCampaignLabel() {

        String label = campaignsLabel.getText();
        Assert.assertEquals(label,"Campaigns");
        return SpotOnPageFactory.getCampaignsPageTraffickerUser();
    }

    @Override
    public ISpotOnCampaignTraffickerUser selectCampaignValue() {

        campaignsValue.click();
        return SpotOnPageFactory.getCampaignsPageTraffickerUser();
    }

    @Override
    public ISpotOnCampaignTraffickerUser verifyUpdateBtnNotPresent() {

        Selenide.executeJavaScript("window.scrollTo(0, document.body.scrollHeight)");
        Boolean val = updateButton.isDisplayed();
        Assert.assertFalse(val);
        return SpotOnPageFactory.getCampaignsPageTraffickerUser();
    }

    @Override
    public ISpotOnCampaignTraffickerUser verifyCampaignNameDisabled() {

        String s = campaignName.getAttribute("aria-disabled");
        Assert.assertEquals(s,"true");
        return SpotOnPageFactory.getCampaignsPageTraffickerUser();
    }

    @Override
    public ISpotOnCampaignTraffickerUser verifyDescriptionDisabled() {

        String s = description.getAttribute("aria-disabled");
        Assert.assertEquals(s,"true");
        return SpotOnPageFactory.getCampaignsPageTraffickerUser();
    }
}