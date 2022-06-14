package test.CampaignPage;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnCreateCampaignImpl;
import ImplementationClasses.SpotOnPublishersImpl;
import org.testng.annotations.Test;

public class CreateCampaignValidation extends BaseTest {
    @Test(description = "Verify Campaign Creation")
    public void verifyCampaignCreation()
    {

        add(new SpotOnCreateCampaignImpl()).trigger();
    }
}
