package test.ProposalsPage;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnProposalsImpl;
import org.testng.annotations.Test;

public class ProposalsPageValidation extends BaseTest {
    @Test(description = "Verify Proposals Page")
    public void verifyProposalsPage()
    {

        add(new SpotOnProposalsImpl()).trigger();
    }
}
