package pageobjects.pages;

import pageobjects.PageFactoryClasses.SpotOnPageFactory;

public class SpotOnSignUp implements ISpotOnSignUp

{
    @Override
    public ISpotOnSignUp verifyButton()
    {
        System.out.println("SignUp Page");
        return SpotOnPageFactory.getSignUpPage();
    }
}
