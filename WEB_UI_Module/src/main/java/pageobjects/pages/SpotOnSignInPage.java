package pageobjects.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnSignInPage implements ISpotOnSignInPage
{


    SelenideElement ok_btn = $x(".//div[@class='main-block']//button[contains(text(),'مُوَافق')]");
    SelenideElement login_btn = $x("//nav//a[contains(text(),'تسجيل الدخول')]");





    @Override
    public ISpotOnSignInPage clickOnSignInButton()
    {
        ok_btn.waitUntil(Condition.visible,4000).click();
        login_btn.waitUntil(Condition.visible,4000).click();
        return SpotOnPageFactory.getHomepage();
    }

    @Override
    public ISpotOnSignInPage clickOnSignUpButton() {
        return null;
    }


}
