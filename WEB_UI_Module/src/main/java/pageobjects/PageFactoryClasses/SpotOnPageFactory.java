package pageobjects.PageFactoryClasses;


import pageobjects.pages.*;


public class SpotOnPageFactory extends PageFactory
{

    public static ISpotOnSignInPage getHomepage()
    {
        return wrap(new SpotOnSignInPage(), ISpotOnSignInPage.class);
    }

}
