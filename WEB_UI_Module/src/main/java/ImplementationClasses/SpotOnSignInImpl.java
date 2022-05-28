package ImplementationClasses;

import BaseClasses.Feature;
import BaseClasses.SpotOnLoginPage;
import pageobjects.pages.ISpotOnSignInPage;

public class SpotOnSignInImpl extends SpotOnLoginPage implements Feature
{
   private ISpotOnSignInPage homePage;
    @Override
    public void init()
    {
        homePage = openSpotOnPage();
    }

    @Override
    public void execute() {
     try {

      homePage.clickOnSignInButton();
     } catch (Exception exception) {
      exception.printStackTrace();
     }
    }
}
