package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnSignInPage implements ISpotOnSignInPage
{


    SelenideElement email = $x("//input[@type='text']");
    SelenideElement login_btn = $x("//button[text()='Login']");
    SelenideElement password = $x("//input[@type='password']");
    SelenideElement proposals = $x("//ion-label[text()=' Proposals ']");
    SelenideElement publishers = $x("//ion-label[text()=' Publishers ']");







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

}
