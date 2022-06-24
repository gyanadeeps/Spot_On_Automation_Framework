package test.PublisherUser;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnCampaignPublisherUserImpl;
import org.testng.annotations.Test;

public class CampaignPageValidation extends BaseTest {
    @Test(description = "Verify Campaign Page  is not Editable")
    public void verifyPublisherUser()
    {

        add(new SpotOnCampaignPublisherUserImpl()).trigger();
    }
}