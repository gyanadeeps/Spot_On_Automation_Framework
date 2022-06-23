package test.CampaignPage;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnCampaignCreationAccMgrImpl;
import ImplementationClasses.SpotOnCreateCampaignImpl;
import org.testng.annotations.Test;

public class CreateCampaignAccMgrValidation extends BaseTest {
    @Test(description = "Verify Campaign Creation Using Account Manager")
    public void verifyCampaignCreation()
    {

        add(new SpotOnCampaignCreationAccMgrImpl()).trigger();
    }
}
