package test.PublishersPage;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnEditPublisherImpl;
import org.testng.annotations.Test;

public class EditPublisherValidation extends BaseTest {
    @Test(description = "Verify Edit Publisher")
    public void verifyEditPublisher()
    {

        add(new SpotOnEditPublisherImpl()).trigger();
    }
}