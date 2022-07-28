package test.SearchValidation;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnSearchValidationClientsImpl;
import org.testng.annotations.Test;

public class SearchValidationClientsPage extends BaseTest {
    @Test(description = "Verify Search Validation for Clients Page")
    public void verifySearchValidationClientsPage()
    {

        add(new SpotOnSearchValidationClientsImpl()).trigger();
    }
}