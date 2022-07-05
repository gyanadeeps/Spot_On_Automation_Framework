package test.CreativesPage;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnRejectCreativeTraffickerUserImpl;
import org.testng.annotations.Test;

public class RejectCreativeTraffickerUser extends BaseTest {

    @Test(description = "Verify Creative Rejection with Trafficker User")
    public void verifyCreativeRejectionTraffickerUser() {

        add(new SpotOnRejectCreativeTraffickerUserImpl()).trigger();
    }



}
