package test.TraffickerUser;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnTraffickerUserImpl;
import org.testng.annotations.Test;

public class TraffickerUserValidation extends BaseTest {
    @Test(description = "Verify Trafficker User")
    public void verifyTraffickerUser()
    {

        add(new SpotOnTraffickerUserImpl()).trigger();
    }
}