package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnUsersPage implements ISpotOnUsersPage {

    SelenideElement userManagementLabel = $x("//label[text()='User Management']");
    SelenideElement inviteUserBtn = $x("//button[text()='Invite user']");
    SelenideElement email = $x("(//app-so-input[@label='Email']//input)[3]");
    SelenideElement firstName = $x("(//app-so-input[@label='First Name']//input)[2]");
    SelenideElement lastName = $x("(//app-so-input[@label='Last Name']//input)[2]");
    SelenideElement groups = $x("(//ion-select[@aria-label='Groups *'])[1]");
    SelenideElement groupVal = $x("//button//div[text()=' Outlet Publisher ']");
    SelenideElement okBtn = $x("//button//span[text()='OK']");
    SelenideElement invite = $x("//button[text()=' Invite']");


    // Verify whether the respective page is User Management
    @Override
    public ISpotOnUsersPage verifyUsersLabel() {
        String label = userManagementLabel.getText();
        Assert.assertEquals(label,"User Management");
        return SpotOnPageFactory.getUsersPage();
    }

    // Click on Invite User Button
    @Override
    public ISpotOnUsersPage clickOnInviteUserBtn() {

        inviteUserBtn.click();
        return SpotOnPageFactory.getUsersPage();
    }

    // Enter Email
    @Override
    public ISpotOnUsersPage enterEmail(String emailValue) {

        email.sendKeys(emailValue);
        return SpotOnPageFactory.getUsersPage();
    }

    // Enter First Name
    @Override
    public ISpotOnUsersPage enterFirstName(String firstNameVal) {

        firstName.sendKeys(firstNameVal);
        return SpotOnPageFactory.getUsersPage();
    }

    // Enter Last Name
    @Override
    public ISpotOnUsersPage enterLastName(String lastNameVal) {

        lastName.sendKeys(lastNameVal);
        return SpotOnPageFactory.getUsersPage();
    }

    // Select Group
    @Override
    public ISpotOnUsersPage selectGroup() {

        groups.click();
        groupVal.click();
        okBtn.click();
        return SpotOnPageFactory.getUsersPage();
    }

    // CLick on Invite Button
    @Override
    public ISpotOnUsersPage clickOnInviteBtn() {

        try {
            Thread.sleep(5000);
            invite.click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return SpotOnPageFactory.getUsersPage();
    }


}
