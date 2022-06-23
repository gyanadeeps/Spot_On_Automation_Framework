package test.CreativesPage;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnCreativesPageCreatMgrImpl;
import org.testng.annotations.Test;

public class CreativesPageAccMgrValidation extends BaseTest {
    @Test(description = "Verify Creatives Page with Creative Manager")
    public void verifyCreativesPage()
    {

        add(new SpotOnCreativesPageCreatMgrImpl()).trigger();
    }

}