package US_304;

import US_301.TC_0101_Elements;
import US_303.TC_0301_Elements;
import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_0401 extends BaseDriver {


    @Test
    public void ConfirmationbyDebitorCreditCard() {

        TC_0101_Elements tce01 = new TC_0101_Elements();
        TC_0301_Elements tce03 = new TC_0301_Elements();
        TC_0401_Elements tce04 = new TC_0401_Elements();

        tce01.addCart.click();
        wait.until(ExpectedConditions.visibilityOf(tce01.iframe1));

        driver.switchTo().frame(tce01.iframe1);

        tce03.payCreditCard.click();

        wait.until(ExpectedConditions.elementToBeClickable(tce03.payButton));
        tce03.email.sendKeys("sada@gmail.com");

        tce03.confirmEmail.sendKeys("sada@gmail.com");

        tce03.nameOnCard.sendKeys("Kamuran");

        tce03.phone.sendKeys("555 555 55 55");

        tce03.company.sendKeys("GlobalNomads");

        tce03.orderNotes.sendKeys("Acele edinn!!!!");

        driver.switchTo().frame(tce03.iframe2);

        wait.until(ExpectedConditions.visibilityOf(tce03.cardNumber));

        tce03.cardNumber.sendKeys("4242 4242 4242 4242");

        tce04.expDate.sendKeys("12 / 24");

        tce04.cvc.sendKeys("000");

        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.visibilityOf(tce01.iframe1));

        driver.switchTo().frame(tce01.iframe1);

        tce04.payButton.click();

        wait.until(ExpectedConditions.visibilityOf(tce04.orderNumber));

        Assert.assertTrue(tce04.confirmText.getText().contains("confirmed"), "The Order could not be created");

        System.out.println("Order No : " + tce04.orderNumber.getText().substring(5));


    }
}
