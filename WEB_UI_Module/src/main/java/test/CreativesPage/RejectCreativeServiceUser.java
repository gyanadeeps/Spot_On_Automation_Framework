package test.CreativesPage;

import BaseClasses.BaseTest;
import ImplementationClasses.*;
import org.testng.annotations.Test;
import pageobjects.pages.SpotOnCreativeRejection;

public class RejectCreativeServiceUser extends BaseTest {

    @Test(description = "Verify Creative Rejection with Service User")
    public void verifyCreativeRejectionServiceUser() {

        add(new SpotOnRejectCreativeServiceUserImpl()).trigger();
    }



}
