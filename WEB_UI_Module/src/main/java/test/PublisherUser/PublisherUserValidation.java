package test.PublisherUser;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnPublisherUserImpl;
import org.testng.annotations.Test;

public class PublisherUserValidation extends BaseTest {
    @Test(description = "Verify Publisher User")
    public void verifyPublisherUser()
    {

        add(new SpotOnPublisherUserImpl()).trigger();
    }
}