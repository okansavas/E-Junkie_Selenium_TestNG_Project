package US_301;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_0101 extends BaseDriver {


    @Test
    public void AddToCart() {

        TC_0101_Elementleri tce_0101 = new TC_0101_Elementleri();

        tce_0101.addCart.click();

        driver.switchTo().frame(tce_0101.iframe1);

        wait.until(ExpectedConditions.elementToBeClickable(tce_0101.paypalButton));
        String paypalText = tce_0101.paypalButton.getText();
        System.out.println("paypalText = " + paypalText);

        Assert.assertEquals(paypalText, tce_0101.paypalButton.getText(), "PayPal button did not appear");

        tce_0101.addPromoCode.click();

        wait.until(ExpectedConditions.elementToBeClickable(tce_0101.promoCodeText));

        tce_0101.promoCodeText.sendKeys("Kamuran");

        tce_0101.promoCodeApply.click();

        String invalid = tce_0101.invalidPromoCode.getText();
        System.out.println("invalid = " + invalid);

        wait.until(ExpectedConditions.textToBe(By.xpath("//span[text()='Invalid promo code']"), invalid));

        Assert.assertEquals(invalid, tce_0101.invalidPromoCode.getText(), "Invalid Promo code Did Not Appear");

    }
}
