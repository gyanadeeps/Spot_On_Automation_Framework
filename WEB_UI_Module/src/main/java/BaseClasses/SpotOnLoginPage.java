package BaseClasses;

import pageobjects.PageFactoryClasses.SpotOnPageFactory;
import pageobjects.pages.ISpotOnSignInPage;

import static com.codeborne.selenide.Selenide.open;
import static data.SystemProperties.SPOT_ON_URL;

public class SpotOnLoginPage {



    public ISpotOnSignInPage openSpotOnPage()
    {
        open(SPOT_ON_URL);

        return SpotOnPageFactory.getHomepage();
    }


}
