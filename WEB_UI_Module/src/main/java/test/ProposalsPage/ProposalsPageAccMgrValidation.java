package test.ProposalsPage;

import BaseClasses.BaseTest;

import ImplementationClasses.SpotOnProposalsAccMgrImpl;
import org.testng.annotations.Test;

public class ProposalsPageAccMgrValidation extends BaseTest {
    @Test(description = "Verify Proposals Page with Account Manager User")
    public void verifyProposalsPage()
    {

        add(new SpotOnProposalsAccMgrImpl()).trigger();
    }
}