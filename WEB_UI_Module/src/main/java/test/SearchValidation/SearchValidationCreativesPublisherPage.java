package test.SearchValidation;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnSearchValidationCreativesImpl;
import org.testng.annotations.Test;

public class SearchValidationCreativesPublisherPage extends BaseTest {
    @Test(description = "Verify Search Validation for Creatives Publisher Page")
    public void verifySearchValidationCreativesPage()
    {

        add(new SpotOnSearchValidationCreativesImpl()).trigger();
    }
}