package BaseClasses;

import pageobjects.PageFactoryClasses.SpotOnPageFactory;
import pageobjects.pages.ISpotOnSignInPage;

import static com.codeborne.selenide.Selenide.open;
import static data.SystemProperties.AFDALANALYTICS_URL;

public class SpotOnLoginPage {



    public ISpotOnSignInPage openSpotOnPage()
    {
        open(AFDALANALYTICS_URL);

        return SpotOnPageFactory.getHomepage();
    }


}
