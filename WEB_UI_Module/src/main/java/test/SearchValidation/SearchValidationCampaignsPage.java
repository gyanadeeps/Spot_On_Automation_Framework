package test.SearchValidation;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnSearchValidationCampaignsImpl;
import org.testng.annotations.Test;

public class SearchValidationCampaignsPage extends BaseTest {
    @Test(description = "Verify Search Validation for Campaigns Page")
    public void verifySearchValidationCampaignsPage()
    {

        add(new SpotOnSearchValidationCampaignsImpl()).trigger();
    }
}