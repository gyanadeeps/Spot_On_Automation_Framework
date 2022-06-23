package test.ClientsPage;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnClientsImpl;
import ImplementationClasses.SpotOnPublishersImpl;
import org.testng.annotations.Test;

public class ClientsPageUIValidation extends BaseTest {
    @Test(description = "Verify Clients Page")
    public void verifyClientsPage()
    {

        add(new SpotOnClientsImpl()).trigger();
    }
}
