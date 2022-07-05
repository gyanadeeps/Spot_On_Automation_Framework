package test.CreativesPage;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnRejectCreativePublisherUserImpl;
import org.testng.annotations.Test;

public class RejectCreativePublisherUser extends BaseTest {

    @Test(description = "Verify Creative Rejection with Publisher User")
    public void verifyCreativeRejectionPublisherUser() {

        add(new SpotOnRejectCreativePublisherUserImpl()).trigger();
    }



}
