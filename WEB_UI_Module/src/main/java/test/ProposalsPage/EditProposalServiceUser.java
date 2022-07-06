package test.ProposalsPage;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnEditProposalServiceUserImpl;
import ImplementationClasses.SpotOnProposalsImpl;
import org.testng.annotations.Test;

public class EditProposalServiceUser extends BaseTest {
    @Test(description = "Verify Edit Proposal Service User")
    public void verifyEditProposalServiceUser() {

        add(new SpotOnEditProposalServiceUserImpl()).trigger();
    }
}
