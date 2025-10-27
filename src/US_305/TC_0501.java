package US_305;

import US_301.TC_0101_Elements;
import US_303.TC_0301_Elements;
import US_304.TC_0401_Elements;
import Utility.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TC_0501 extends BaseDriver {

    @Test
    public void PaymentProcessApprovalandDownload() throws AWTException, IOException {

        TC_0101_Elements tce01 = new TC_0101_Elements();
        TC_0301_Elements tce03 = new TC_0301_Elements();
        TC_0401_Elements tce04 = new TC_0401_Elements();
        TC_0501_Elements tce05 = new TC_0501_Elements();

        Robot robot = new Robot();

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

        tce03.orderNotes.sendKeys("hurry up!");

        driver.switchTo().frame(tce03.iframe2);

        wait.until(ExpectedConditions.visibilityOf(tce03.cardNumber));

        tce03.cardNumber.sendKeys("4242 4242 4242 4242");

        tce04.expDate.sendKeys("12 / 24");

        tce04.cvc.sendKeys("000");

        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.visibilityOf(tce01.iframe1));

        driver.switchTo().frame(tce01.iframe1);

        String eBookPriceReplace = tce04.payButton.getText().replaceAll("[^0-9.]", "");
        double eBookPrice = Double.parseDouble(eBookPriceReplace);
        System.out.println("eBookPrice = " + eBookPrice);

        tce04.payButton.click();

        wait.until(ExpectedConditions.visibilityOf(tce04.orderNumber));

        Assert.assertTrue(tce04.confirmText.getText().contains("confirmed"), "The Order could not be created");

        String totalPriceReplace = tce05.totalUSD.getText().replaceAll("[^0-9.]", "");
        double totalPrice = Double.parseDouble(totalPriceReplace);
        System.out.println("totalPrice = " + totalPrice);


        if (eBookPrice == totalPrice) {
            tce05.downloadButton.click();

            for (int i = 0; i < 8; i++) {
                robot.keyPress(KeyEvent.VK_TAB);
                Tools.Wait(1);
                robot.keyRelease(KeyEvent.VK_TAB);
            }

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Tools.Wait(2);

            Set<String> idS = driver.getWindowHandles();
            Iterator<String> indicator = idS.iterator();
            String firstTabID = indicator.next().toString();
            String secondTabID = indicator.next().toString();

            driver.switchTo().window(secondTabID);

            TakesScreenshot ts = (TakesScreenshot) driver;
            File hafizadakiHali = ts.getScreenshotAs(OutputType.FILE);

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
            String formatted = now.format(dateTimeFormatter);

            String dosyaAdi = "screenshot\\SS" + formatted + ".jpg";

            //Şu anda hafızadaki görüntüyü dosya olarak kaydetti.
            FileUtils.copyFile(hafizadakiHali, new File(dosyaAdi));
        }

    }
}
