package test.UsersPage;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnUsersImpl;
import org.testng.annotations.Test;

public class UsersPageValidation extends BaseTest {
    @Test(description = "Verify Users Page")
    public void verifyUsersPage()
    {

        add(new SpotOnUsersImpl()).trigger();
    }
}