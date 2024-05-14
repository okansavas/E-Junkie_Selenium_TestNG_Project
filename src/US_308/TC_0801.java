package US_308;

import US_307.TC_0701_Elements;
import Utility.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TC_0801 extends BaseDriver {

    @Test
    public void AccesstoInformationVideo() throws AWTException {

        Robot robot = new Robot();
        Actions driverAksiyon = new Actions(driver);
        TC_0701_Elements tce07 = new TC_0701_Elements();
        TC_0801_Elements tce08 = new TC_0801_Elements();

        Tools.JScriptClick(tce07.eJShoplink);
        String eJunkieUrl = driver.getCurrentUrl();
        System.out.println("eJunkieUrl = " + eJunkieUrl);

        wait.until(ExpectedConditions.urlContains("e-junkie"));

        Assert.assertTrue(eJunkieUrl.contains("e-junkie"), "E-Junkie site could not open");

        tce08.seeHowItWorks.click();

        wait.until(ExpectedConditions.visibilityOf(tce07.getItNow));
        tce07.getItNow.click();
        driver.navigate().back();
        tce08.seeHowItWorks.click();

        driver.switchTo().frame(tce08.iframe3);

        for (int i = 0; i < 16; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            Tools.Wait(1);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        Tools.Wait(2);

        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_SHIFT);
        }
        Tools.Wait(2);

        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        Tools.Wait(2);

        Tools.Wait(10);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        Tools.Wait(2);

        driver.switchTo().defaultContent();

        Action action1 = driverAksiyon.moveToElement(tce08.closeYouTubeButton).click().build();
        wait.until(ExpectedConditions.elementToBeClickable(tce08.closeYouTubeButton));
        action1.perform();

//        wait.until(ExpectedConditions.elementToBeClickable(tce08.closeYouTubeButton));
//        Tools.JScriptClick(tce08.closeYouTubeButton);

        Tools.JScriptScrool(tce08.eJunkieHomePage);

        tce08.eJunkieHomePage.click();

        String homePageUrl = driver.getCurrentUrl();
        wait.until(ExpectedConditions.urlToBe("https://www.e-junkie.com/"));

        Assert.assertEquals(homePageUrl, "https://www.e-junkie.com/", "E-Junkie Website Not Opened");


    }


}
