package test.SearchValidation;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnSearchValidationProposalsImpl;
import org.testng.annotations.Test;

public class SearchValidationProposalsPage extends BaseTest {
    @Test(description = "Verify Search Validation for Proposals Page")
    public void verifySearchValidationProposalsPage()
    {

        add(new SpotOnSearchValidationProposalsImpl()).trigger();
    }
}