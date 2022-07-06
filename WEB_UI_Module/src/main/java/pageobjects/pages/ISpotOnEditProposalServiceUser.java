package pageobjects.pages;

public interface ISpotOnEditProposalServiceUser {
    ISpotOnEditProposalServiceUser verifyProposalsPage();
    ISpotOnEditProposalServiceUser enterSearchKeyword(String searchKey);
    ISpotOnEditProposalServiceUser clickProposal();
    ISpotOnEditProposalServiceUser enterDescription(String descValue);
    ISpotOnEditProposalServiceUser clickUpdateBtn();
}
