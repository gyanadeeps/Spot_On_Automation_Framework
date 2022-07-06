package test.ProposalsPage;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnEditProposalAccMgrImpl;
import ImplementationClasses.SpotOnEditProposalServiceUserImpl;
import org.testng.annotations.Test;

public class EditProposalAccMgr extends BaseTest {
    @Test(description = "Verify Edit Proposal Account Manager User")
    public void verifyEditProposalAccountManager() {

        add(new SpotOnEditProposalAccMgrImpl()).trigger();
    }
}