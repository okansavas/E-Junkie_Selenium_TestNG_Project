package US_306;

import US_301.TC_0101_Elements;
import Utility.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TC_0601 extends BaseDriver {

    @Test
    public void CommunicationMessageSendingProcess() {

        try {
            TC_0101_Elements tce01 = new TC_0101_Elements();
            TC_0601_Elements tce06 = new TC_0601_Elements();

            Robot robot = new Robot();

            tce01.addCart.click();
            //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(tce01.iframe1));
            wait.until(ExpectedConditions.visibilityOf(tce01.iframe1));

            driver.switchTo().frame(tce01.iframe1);

            wait.until(ExpectedConditions.elementToBeClickable(tce01.paypalButton));
            String paypalText = tce01.paypalButton.getText();
            // System.out.println("paypalText = " + paypalText);

            Assert.assertEquals(paypalText, tce01.paypalButton.getText(), "PayPal button did not appear");

            tce01.addPromoCode.click();

            wait.until(ExpectedConditions.elementToBeClickable(tce01.promoCodeText));

            tce01.promoCodeText.sendKeys("Kamuran");

            tce01.promoCodeApply.click();

            String invalid = tce01.invalidPromoCode.getText();
            //System.out.println("invalid = " + invalid);

            wait.until(ExpectedConditions.textToBe(By.xpath("//span[text()='Invalid promo code']"), invalid));

            Assert.assertEquals(invalid, tce01.invalidPromoCode.getText(), "Invalid Promo code Did Not Appear");

            tce06.closeButton.click();

            //driver.switchTo().defaultContent();
            driver.switchTo().parentFrame();

            Tools.JScriptClick(tce06.contactUs);

            wait.until(ExpectedConditions.urlContains("contact"));

            tce06.nameInput.sendKeys("Osman");

            tce06.emailInput.sendKeys("kamil@osman.com");

            tce06.subjectInput.sendKeys("Konuyu Birde Bana mı Soruyosun");

            tce06.messageInput.sendKeys("Böyle Esnaflık Olmaz");

            tce06.sendMessageButton.click();

            wait.until(ExpectedConditions.alertIsPresent());

            System.out.println(driver.switchTo().alert().getText());

            driver.switchTo().alert().accept();

            driver.switchTo().frame(tce06.recaptchaFrame);
            wait.until(ExpectedConditions.elementToBeClickable(tce06.recaptchaCheckbox));

            for (int i = 0; i < 11; i++) {
                robot.keyPress(KeyEvent.VK_TAB);
                Tools.Wait(1);
                robot.keyRelease(KeyEvent.VK_TAB);
            }

            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);
            Tools.Wait(2);

            driver.switchTo().defaultContent();

            wait.until(ExpectedConditions.elementToBeClickable(tce06.sendMessageButton));

            tce06.sendMessageButton.click();

            wait.until(ExpectedConditions.alertIsPresent());

            System.out.println(driver.switchTo().alert().getText());

            driver.switchTo().alert().accept();

            tce06.visitWebsite.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
