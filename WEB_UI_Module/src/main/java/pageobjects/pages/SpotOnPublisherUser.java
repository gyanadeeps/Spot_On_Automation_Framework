package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnPublisherUser implements ISpotOnPublisherUser{


    SelenideElement proposals = $x("//ion-label[text()=' Proposals ']");
    SelenideElement payments = $x("//ion-label[text()=' Payments ']");
    SelenideElement clients = $x("//ion-label[text()=' Clients ']");

    // Verify whether Proposals link is displayed for Service User
    @Override
    public ISpotOnPublisherUser verifyProposalsLink() {

        Boolean val = proposals.isDisplayed();
       // Assert.assertEquals(val,"false");
        Assert.assertFalse(val);
        return SpotOnPageFactory.verifyPublisherUser();
    }

    // Verify whether Payments link is displayed for Service User
    @Override
    public ISpotOnPublisherUser verifyPaymentsLink() {

        Boolean val = payments.isDisplayed();
        Assert.assertFalse(val);
        return SpotOnPageFactory.verifyPublisherUser();
    }

    // Verify whether Clients link is displayed for Service User
    @Override
    public ISpotOnPublisherUser verifyClientsLink() {

        Boolean val = clients.isDisplayed();
        Assert.assertFalse(val);
        return SpotOnPageFactory.verifyPublisherUser();
    }
}
