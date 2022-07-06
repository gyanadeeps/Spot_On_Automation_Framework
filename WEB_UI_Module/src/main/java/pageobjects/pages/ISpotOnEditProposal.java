package pageobjects.pages;

public interface ISpotOnEditProposal {
    ISpotOnEditProposal verifyProposalsPage();
    ISpotOnEditProposal enterSearchKeyword(String searchKey);
    ISpotOnEditProposal enterSearchKeywordAM(String searchKeyAM);
    ISpotOnEditProposal clickProposal();
    ISpotOnEditProposal clickProposalAM();
    ISpotOnEditProposal enterDescription(String descValue);
    ISpotOnEditProposal clickUpdateBtn();
}
