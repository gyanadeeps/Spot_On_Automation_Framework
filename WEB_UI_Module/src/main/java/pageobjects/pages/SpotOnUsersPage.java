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



    @Override
    public ISpotOnUsersPage verifyUsersLabel() {
        String label = userManagementLabel.getText();
        Assert.assertEquals(label,"User Management");
        return SpotOnPageFactory.getUsersPage();
    }

    @Override
    public ISpotOnUsersPage clickOnInviteUserBtn() {

        inviteUserBtn.click();
        return SpotOnPageFactory.getUsersPage();
    }

    @Override
    public ISpotOnUsersPage enterEmail(String emailValue) {

        email.sendKeys(emailValue);
        return SpotOnPageFactory.getUsersPage();
    }

    @Override
    public ISpotOnUsersPage enterFirstName(String firstNameVal) {

        firstName.sendKeys(firstNameVal);
        return SpotOnPageFactory.getUsersPage();
    }

    @Override
    public ISpotOnUsersPage enterLastName(String lastNameVal) {

        lastName.sendKeys(lastNameVal);
        return SpotOnPageFactory.getUsersPage();
    }

    @Override
    public ISpotOnUsersPage selectGroup() {

        groups.click();
        groupVal.click();
        okBtn.click();
        return SpotOnPageFactory.getUsersPage();
    }

    @Override
    public ISpotOnUsersPage clickOnInviteBtn() {

        invite.click();
        return SpotOnPageFactory.getUsersPage();
    }


}
