package pageobjects.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnSignInPage implements ISpotOnSignInPage
{


    SelenideElement email = $x("//input[@type='text']");
    SelenideElement login_btn = $x("//button[text()='Login']");
    SelenideElement password = $x("//input[@type='password']");








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
}
