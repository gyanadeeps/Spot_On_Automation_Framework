package pageobjects.PageFactoryClasses;


import pageobjects.pages.*;


public class SpotOnPageFactory extends PageFactory
{

    public static ISpotOnSignInPage getHomepage()
    {
        return wrap(new SpotOnSignInPage(), ISpotOnSignInPage.class);
    }

    public static ISpotOnSignUp getSignUpPage()
    {
        return wrap(new SpotOnSignUp(), ISpotOnSignUp.class);
    }

    public static ISpotOnProposalsPage getProposalsPage()
    {
        return wrap(new SpotOnProposalsPage(), ISpotOnProposalsPage.class);
    }
    public static ISpotOnPublishersPage getPublishersPage()
    {
        return wrap(new SpotOnPublishersPage(), ISpotOnPublishersPage.class);
    }

}
