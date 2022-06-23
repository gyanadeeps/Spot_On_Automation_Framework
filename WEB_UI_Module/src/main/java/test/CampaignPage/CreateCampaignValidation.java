package test.CampaignPage;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnCreateCampaignImpl;
import org.testng.annotations.Test;

public class CreateCampaignValidation extends BaseTest {
    @Test(description = "Verify Campaign Creation")
    public void verifyCampaignCreation()
    {

        add(new SpotOnCreateCampaignImpl()).trigger();
    }
}
