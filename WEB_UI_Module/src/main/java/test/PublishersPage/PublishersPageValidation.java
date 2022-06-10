package test.PublishersPage;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnPublishersImpl;
import org.testng.annotations.Test;

public class PublishersPageValidation extends BaseTest {
    @Test(description = "Verify Publishers Page")
    public void verifyPublishersPage()
    {

        add(new SpotOnPublishersImpl()).trigger();
    }
}
