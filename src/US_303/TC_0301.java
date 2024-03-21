package US_303;

import US_301.TC_0101_Elementleri;
import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TC_0301 extends BaseDriver {

    @Test
    public void TC0301() {
        Actions driverAksiyon = new Actions(driver);
        TC_0101_Elementleri tce01 = new TC_0101_Elementleri();
        TC_0301_Elementleri tce03 = new TC_0301_Elementleri();

        tce01.addCart.click();


        driver.switchTo().frame(tce01.iframe1);

        wait.until(ExpectedConditions.elementToBeClickable(tce01.addPromoCode));


        tce03.payCreditCard.click();

    }
}
