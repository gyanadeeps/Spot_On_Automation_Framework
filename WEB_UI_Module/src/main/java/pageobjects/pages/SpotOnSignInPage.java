package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnSignInPage implements ISpotOnSignInPage
{


    SelenideElement email = $x("//input[@type='text']");
    SelenideElement login_btn = $x("//button[text()='Login']");
    SelenideElement password = $x("//input[@type='password']");
    SelenideElement proposals = $x("//ion-menu-toggle[@class='md hydrated']//ion-label[text()=' Proposals ']");
    SelenideElement publishers = $x("//ion-label[text()=' Publishers ']");
    SelenideElement creatives = $x("//ion-label[text()=' Creatives ']");
    SelenideElement clients = $x("//ion-label[text()=' Clients ']");
    SelenideElement users = $x("//ion-label[text()=' Users ']");
    SelenideElement profileLabel = $x("//h2[text()='Profile']");
    SelenideElement campaigns = $x("//ion-label[text()=' Campaigns ']");
    SelenideElement creativesPublisher = $x("//ion-label[text()=' Creatives (Publisher) ']");


    @Override
    public ISpotOnSignInPage enterEmail(String name)
    {
        email.sendKeys(name);
        return SpotOnPageFactory.getHomepage();
    }

    @Override
    public ISpotOnSignInPage enterPassword(String name)
    {
        password.sendKeys(name);
        return SpotOnPageFactory.getHomepage();
    }

    @Override
    public ISpotOnSignInPage clickOnLoginButton()
    {
        login_btn.click();
        return SpotOnPageFactory.getHomepage();
    }

    @Override
    public ISpotOnSignUp clickOnButton()
    {
        System.out.println("Testing");
        return SpotOnPageFactory.getSignUpPage();
    }

    @Override
    public ISpotOnProposalsPage clickOnProposalsButton() {
        proposals.click();
        return SpotOnPageFactory.getProposalsPage();
    }

    @Override
    public ISpotOnPublishersPage clickOnPublishersButton() {
        publishers.click();
        return SpotOnPageFactory.getPublishersPage();
    }

    @Override
    public ISpotOnCreateCampaign clickOnProposalsBtn() {
        proposals.click();
        return SpotOnPageFactory.getCampaign();
    }

    @Override
    public ISpotOnCreativesPage clickOnCreativesBtn() {

        creatives.click();
        return SpotOnPageFactory.getCreativesPage();
    }

    @Override
    public ISpotOnClientsPage clickOnClientsBtn() {

        clients.click();
        return SpotOnPageFactory.getClientsPage();
    }

    @Override
    public ISpotOnUsersPage clickOnUsersBtn() {

        users.click();
        return SpotOnPageFactory.getUsersPage();
    }

    @Override
    public ISpotOnPublisherUser verifyPublisherProfile() {

        try {
            Thread.sleep(3000);
            String label = profileLabel.getText();
            Assert.assertEquals(label, "Profile");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return SpotOnPageFactory.verifyPublisherUser();
    }

    @Override
    public ISpotOnCampaignPublisherUser clickOnCampaignsBtn() {

        campaigns.click();
        return SpotOnPageFactory.getCampaignsPage();
    }

    @Override
    public ISpotOnEditPublisher clickOnPublishersBtn() {

        publishers.click();
        return SpotOnPageFactory.getEditPublishersPage();
    }

    @Override
    public ISpotOnCreativesPublisherPage clickOnCreativesPublisherBtn() {

        creativesPublisher.click();
        return SpotOnPageFactory.getCreativesPublishersPage();
    }

    @Override
    public ISpotOnTraffickerUser verifyTraffickerProfile() {

        String label = profileLabel.getText();
        Assert.assertEquals(label,"Profile");
        return SpotOnPageFactory.verifyTraffickerUser();
    }

    @Override
    public ISpotOnCampaignTraffickerUser clickOnCampaignBtn() {

        campaigns.click();
        return SpotOnPageFactory.getCampaignsPageTraffickerUser();
    }

    @Override
    public ISpotOnCreativeRejection clickOnCreativePublisherBtn() {

        creativesPublisher.click();
        return SpotOnPageFactory.verifyCreativeRejection();
    }


    @Override
    public ISpotOnCreativeRejection clickOnCreativeBtn() {

        creatives.click();
        return SpotOnPageFactory.verifyCreativeRejection();
    }

    @Override
    public ISpotOnActivityLogs clickOnPublisherButton() {
        publishers.click();
        return SpotOnPageFactory.verifyActivityLogs();
    }
}
