package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;


import static com.codeborne.selenide.Selenide.$x;

public class SpotOnCreativeRejection implements ISpotOnCreativeRejection {

    SelenideElement creativesLabel = $x("//label[text()='Creatives']");
    SelenideElement search = $x("//input[@placeholder='Search']");
    SelenideElement rejectBtn = $x("//tr[1]//button[text()='Reject']");
    SelenideElement rejectReason = $x("//input[@placeholder='This creative does not ...']");
    SelenideElement saveBtn = $x("//button//span[text()='Save']");

    // Verify whether the respective page is Creatives Queue page
    @Override
    public ISpotOnCreativeRejection verifyCreativesPublisherPage() {

        String label = creativesLabel.getText();
        Assert.assertEquals(label,"Creatives");
        return SpotOnPageFactory.verifyCreativeRejection();

    }

    // Enter Creative value in Search box
    @Override
    public ISpotOnCreativeRejection enterSearchKeyword(String searchKey) {

        System.out.println(searchKey);
        search.sendKeys(searchKey);
        search.sendKeys(Keys.ENTER);
        return SpotOnPageFactory.verifyCreativeRejection();
    }

    // Click on Reject Button
    @Override
    public ISpotOnCreativeRejection clickRejectBtn() {

        try {
            rejectBtn.click();
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SpotOnPageFactory.verifyCreativeRejection();
    }

    // Enter Rejection Reason and Click on Save Button
    @Override
    public ISpotOnCreativeRejection enterRejectionReason(String reason) {

        rejectReason.sendKeys(reason);
        saveBtn.click();
        return SpotOnPageFactory.verifyCreativeRejection();
    }

}

