package test.HomePage;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnSignInImpl;
import org.testng.annotations.Test;



public class LoginPageUiValidation extends BaseTest
{
    @Test(description = "Verify Login Page")
    public void verifyHomePage()
    {

        add(new SpotOnSignInImpl()).trigger();
    }


}
