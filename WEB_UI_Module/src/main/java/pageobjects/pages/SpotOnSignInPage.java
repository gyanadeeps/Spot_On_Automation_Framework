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

    // Enter Username
    @Override
    public ISpotOnSignInPage enterEmail(String name)
    {
        email.sendKeys(name);
        return SpotOnPageFactory.getHomepage();
    }

    // Enter Password
    @Override
    public ISpotOnSignInPage enterPassword(String name)
    {
        password.sendKeys(name);
        return SpotOnPageFactory.getHomepage();
    }

    // Click on Login button
    @Override
    public ISpotOnSignInPage clickOnLoginButton()
    {
        login_btn.click();
        return SpotOnPageFactory.getHomepage();
    }

    // Click on Proposals Button
    @Override
    public ISpotOnProposalsPage clickOnProposalsButton() {
        proposals.click();
        return SpotOnPageFactory.getProposalsPage();
    }

    // Click on Publishers Button
    @Override
    public ISpotOnPublishersPage clickOnPublishersButton() {
        publishers.click();
        return SpotOnPageFactory.getPublishersPage();
    }

    // Click on Proposals Button
    @Override
    public ISpotOnCreateCampaign clickOnProposalsBtn() {
        proposals.click();
        return SpotOnPageFactory.getCampaign();
    }

    // Click on Creatives Button
    @Override
    public ISpotOnCreativesPage clickOnCreativesBtn() {

        creatives.click();
        return SpotOnPageFactory.getCreativesPage();
    }

    // Click on Clients Button
    @Override
    public ISpotOnClientsPage clickOnClientsBtn() {

        clients.click();
        return SpotOnPageFactory.getClientsPage();
    }

    // Click on Users Button
    @Override
    public ISpotOnUsersPage clickOnUsersBtn() {

        users.click();
        return SpotOnPageFactory.getUsersPage();
    }

    // Verify Profile Page is displayed on Login
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

    // Click on Campaigns Button
    @Override
    public ISpotOnCampaignPublisherUser clickOnCampaignsBtn() {

        campaigns.click();
        return SpotOnPageFactory.getCampaignsPage();
    }

    // Click on Publishers Button
    @Override
    public ISpotOnEditPublisher clickOnPublishersBtn() {

        publishers.click();
        return SpotOnPageFactory.getEditPublishersPage();
    }

    // Click on Creatives(Publisher) Button
    @Override
    public ISpotOnCreativesPublisherPage clickOnCreativesPublisherBtn() {

        creativesPublisher.click();
        return SpotOnPageFactory.getCreativesPublishersPage();
    }

    // Verify Profile page is displayed onLogin for Trafficker User
    @Override
    public ISpotOnTraffickerUser verifyTraffickerProfile() {

        String label = profileLabel.getText();
        Assert.assertEquals(label,"Profile");
        return SpotOnPageFactory.verifyTraffickerUser();
    }

    // Click on Campaigns Button
    @Override
    public ISpotOnCampaignTraffickerUser clickOnCampaignBtn() {

        campaigns.click();
        return SpotOnPageFactory.getCampaignsPageTraffickerUser();
    }

    // Click on Creatives(Publisher) Button
    @Override
    public ISpotOnCreativeRejection clickOnCreativePublisherBtn() {

        creativesPublisher.click();
        return SpotOnPageFactory.verifyCreativeRejection();
    }

    // Click on Creatives Button
    @Override
    public ISpotOnCreativeRejection clickOnCreativeBtn() {

        creatives.click();
        return SpotOnPageFactory.verifyCreativeRejection();
    }

    // Click on Publishers Button
    @Override
    public ISpotOnActivityLogs clickOnPublisherButton() {
        publishers.click();
        return SpotOnPageFactory.verifyActivityLogs();
    }

    // Click on Proposals Button
    @Override
    public ISpotOnEditProposal clickOnProposalBtnEditServiceUser() {
        proposals.click();
        return SpotOnPageFactory.verifyEditProposalServiceUser();
    }
}
