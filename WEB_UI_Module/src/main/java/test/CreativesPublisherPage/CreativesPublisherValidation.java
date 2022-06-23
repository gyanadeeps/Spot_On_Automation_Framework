package test.CreativesPublisherPage;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnCreativesImpl;
import ImplementationClasses.SpotOnCreativesPublisherPageImpl;
import org.testng.annotations.Test;

public class CreativesPublisherValidation extends BaseTest {
    @Test(description = "Verify Preview and Approve Creatives")
    public void verifyPreviewAndApproveCreativesPage()
    {

        add(new SpotOnCreativesPublisherPageImpl()).trigger();
    }

}