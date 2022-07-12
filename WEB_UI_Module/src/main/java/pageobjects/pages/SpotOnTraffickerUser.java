package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnTraffickerUser implements ISpotOnTraffickerUser {

    SelenideElement proposals = $x("//ion-label[text()=' Proposals ']");

    // Verify whether the respective page is Proposals page
    @Override
    public ISpotOnTraffickerUser verifyTraffickerLink() {

        Boolean val = proposals.isDisplayed();
        Assert.assertFalse(val);
        return SpotOnPageFactory.verifyTraffickerUser();
    }
}
