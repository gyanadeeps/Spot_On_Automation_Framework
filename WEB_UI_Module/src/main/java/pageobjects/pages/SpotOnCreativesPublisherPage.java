package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import data.SystemProperties;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.SpotOnPageFactory;

import static com.codeborne.selenide.Selenide.$x;

public class SpotOnCreativesPublisherPage implements ISpotOnCreativesPublisherPage {

    SelenideElement creativesLabel = $x("//label[text()='Creatives']");
    SelenideElement search = $x("//input[@placeholder='Search']");
    SelenideElement previewBtn = $x("//tr[1]//button[text()='Preview']");
    SelenideElement closeIcon = $x("//ion-icon[@aria-label='close']");
    SelenideElement approveBtn = $x("//tr[1]//button[text()='Approve']");


    @Override
    public ISpotOnCreativesPublisherPage verifyCreativesPublisherPage() {

        String label = creativesLabel.getText();
        Assert.assertEquals(label,"Creatives");
        return SpotOnPageFactory.getCreativesPublishersPage();

    }

    @Override
    public ISpotOnCreativesPublisherPage enterSearchKeyword(String searchKey) {

        System.out.println(searchKey);
        search.sendKeys(searchKey);
        search.sendKeys(Keys.ENTER);
        return SpotOnPageFactory.getCreativesPublishersPage();
    }

    @Override
    public ISpotOnCreativesPublisherPage clickPreviewBtn() {

        try{
            previewBtn.click();
            Thread.sleep(5000);
            closeIcon.click();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return SpotOnPageFactory.getCreativesPublishersPage();
    }

    @Override
    public ISpotOnCreativesPublisherPage clickApproveBtn() {

        try{
            approveBtn.click();
            Thread.sleep(5000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return SpotOnPageFactory.getCreativesPublishersPage();
    }
}
