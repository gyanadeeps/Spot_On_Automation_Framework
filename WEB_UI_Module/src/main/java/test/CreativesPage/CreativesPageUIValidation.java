package test.CreativesPage;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnCreativesImpl;
import org.testng.annotations.Test;

public class CreativesPageUIValidation extends BaseTest {
    @Test(description = "Verify Creatives Page")
    public void verifyCreativesPage()
    {

        add(new SpotOnCreativesImpl()).trigger();
    }

}
