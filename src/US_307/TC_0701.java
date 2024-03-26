package US_307;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;

public class TC_0701 extends BaseDriver {

    @Test
    public void AccesstoEJunkieHomePagefromShopdemoPage() {

        Actions driverAksiyon = new Actions(driver);
        TC_0701_Elements tce07 = new TC_0701_Elements();

        Tools.JScriptClick(tce07.eJShoplink);
        String eJunkieUrl = driver.getCurrentUrl();
        System.out.println("eJunkieUrl = " + eJunkieUrl);

        wait.until(ExpectedConditions.urlContains("e-junkie"));

        if (tce07.getItNow.getText().equals("GET IT NOW")) {
            driverAksiyon.keyUp(Keys.ESCAPE);
        }

        Assert.assertTrue(eJunkieUrl.contains("e-junkie"), "E-Junkie site could not open");








    }

}
