package test.SearchValidation;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnSearchValidationCreativesImpl;
import org.testng.annotations.Test;

public class SearchValidationCreativesPage extends BaseTest {
    @Test(description = "Verify Search Validation for Creatives Page")
    public void verifySearchValidationCreativesPage()
    {

        add(new SpotOnSearchValidationCreativesImpl()).trigger();
    }
}