package test.SearchValidation;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnSearchValidationProposalsImpl;
import ImplementationClasses.SpotOnSearchValidationPublishersImpl;
import org.testng.annotations.Test;

public class SearchValidationPublishersPage extends BaseTest {
    @Test(description = "Verify Search Validation for Publishers Page")
    public void verifySearchValidationPublishersPage()
    {

        add(new SpotOnSearchValidationPublishersImpl()).trigger();
    }
}