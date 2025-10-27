package US_303;

import US_301.TC_0101_Elements;
import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TC_0301 extends BaseDriver {

    @Test
    public void UnsuccessfulPaymentWithDebitorCreditCard() {

        TC_0101_Elements tce01 = new TC_0101_Elements();
        TC_0301_Elements tce03 = new TC_0301_Elements();

        tce01.addCart.click();
        wait.until(ExpectedConditions.visibilityOf(tce01.iframe1));

        driver.switchTo().frame(tce01.iframe1);

        //wait.until(ExpectedConditions.elementToBeClickable(tce01.addPromoCode));
        tce03.payCreditCard.click();

        wait.until(ExpectedConditions.elementToBeClickable(tce03.payButton));
        tce03.email.sendKeys("sada@gmail.com");

        tce03.confirmEmail.sendKeys("sada@gmail.com");

        tce03.nameOnCard.sendKeys("kamuran");

        tce03.phone.sendKeys("555 555 55 55");

        tce03.company.sendKeys("GlobalNomads");

        tce03.orderNotes.sendKeys("Hurry up!");

        driver.switchTo().frame(tce03.iframe2);

        wait.until(ExpectedConditions.visibilityOf(tce03.cardNumber));

        tce03.cardNumber.sendKeys("1111 1111 1111 1111");

        // Assert.assertTrue(tce03.invalidCarNumberText.getText().toLowerCase().contains("geçersiz"), "Your card number is invalid.");

    }
}
