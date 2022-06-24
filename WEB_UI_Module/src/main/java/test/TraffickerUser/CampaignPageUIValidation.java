package test.TraffickerUser;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnCampaignPublisherUserImpl;
import ImplementationClasses.SpotOnCampaignTraffickerUserImpl;
import org.testng.annotations.Test;

public class CampaignPageUIValidation extends BaseTest {
    @Test(description = "Verify Campaign Page is not Editable")
    public void verifyCampaignPageTraffickerUser()
    {

        add(new SpotOnCampaignTraffickerUserImpl()).trigger();
    }
}