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

    public static ISpotOnCreateCampaign getCampaign()
    {
        return wrap(new SpotOnCreateCampaign(), ISpotOnCreateCampaign.class);
    }

    public static ISpotOnCreativesPage getCreativesPage()
    {
        return wrap(new SpotOnCreativesPage(), ISpotOnCreativesPage.class);
    }

    public static ISpotOnClientsPage getClientsPage()
    {
        return wrap(new SpotOnClientsPage(), ISpotOnClientsPage.class);
    }

    public static ISpotOnUsersPage getUsersPage()
    {

        return wrap(new SpotOnUsersPage(), ISpotOnUsersPage.class);
    }

    public static ISpotOnPublisherUser verifyPublisherUser()
    {

        return wrap(new SpotOnPublisherUser(), ISpotOnPublisherUser.class);
    }

    public static ISpotOnCampaignPublisherUser getCampaignsPage()
    {

        return wrap(new SpotOnCampaignPublisherUser(), ISpotOnCampaignPublisherUser.class);
    }

    public static ISpotOnEditPublisher getEditPublishersPage()
    {

        return wrap(new SpotOnEditPublisher(), ISpotOnEditPublisher.class);
    }

    public static ISpotOnCreativesPublisherPage getCreativesPublishersPage()
    {

        return wrap(new SpotOnCreativesPublisherPage(), ISpotOnCreativesPublisherPage.class);
    }

    public static ISpotOnCampaignTraffickerUser getCampaignsPageTraffickerUser()
    {

        return wrap(new SpotOnCampaignTraffickerUser(), ISpotOnCampaignTraffickerUser.class);
    }

    public static ISpotOnTraffickerUser verifyTraffickerUser()
    {

        return wrap(new SpotOnTraffickerUser(), ISpotOnTraffickerUser.class);
    }

}
