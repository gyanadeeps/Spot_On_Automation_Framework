package pageobjects.PageFactoryClasses;


import pageobjects.pages.*;


public class SpotOnPageFactory extends PageFactory
{

    public static ISpotOnSignInPage getHomepage()
    {
        return wrap(new SpotOnSignInPage(), ISpotOnSignInPage.class);
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

    public static ISpotOnCreativeRejection verifyCreativeRejection()
    {

        return wrap(new SpotOnCreativeRejection(), ISpotOnCreativeRejection.class);
    }

    public static ISpotOnActivityLogs verifyActivityLogs()
    {

        return wrap(new SpotOnActivityLogs(), ISpotOnActivityLogs.class);
    }

    public static ISpotOnEditProposal verifyEditProposalServiceUser()
    {

        return wrap(new SpotOnEditProposal(), ISpotOnEditProposal.class);
    }

    public static ISpotOnSearchValidationProposals verifySearchValidationProposals()
    {
        return wrap(new SpotOnSearchValidationProposals(), ISpotOnSearchValidationProposals.class);
    }

    public static ISpotOnSearchValidationPublishers verifySearchValidationPublishers()
    {
        return wrap(new SpotOnSearchValidationPublishers(), ISpotOnSearchValidationPublishers.class);
    }

    public static ISpotOnSearchValidationCampaign verifySearchValidationCampaign()
    {
        return wrap(new SpotOnSearchValidationCampaign(), ISpotOnSearchValidationCampaign.class);
    }

    public static ISpotOnSearchValidationCreatives verifySearchValidationCreatives()
    {
        return wrap(new SpotOnSearchValidationCreatives(), ISpotOnSearchValidationCreatives.class);
    }

    public static ISpotOnSearchValidationCreativesPublisher verifySearchValidationCreativesPublisher()
    {
        return wrap(new SpotOnSearchValidationCreativesPublisher(), ISpotOnSearchValidationCreativesPublisher.class);
    }

    public static ISpotOnSearchValidationClients verifySearchValidationClients()
    {
        return wrap(new SpotOnSearchValidationClients(), ISpotOnSearchValidationClients.class);
    }

}
