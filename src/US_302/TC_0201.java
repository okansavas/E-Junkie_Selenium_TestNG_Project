package US_302;

import US_301.TC_0101_Elements;
import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TC_0201 extends BaseDriver {

    @Test
    public void IncorrectPayment() {

        TC_0101_Elements tc1e = new TC_0101_Elements();
        TC_0201_Elements tc2e = new TC_0201_Elements();

        tc1e.addCart.click();
        //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(tc1e.iframe1));

        WebElement iframe2 = driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']"));

        driver.switchTo().frame(iframe2);

        WebElement debitCard = driver.findElement(By.xpath("//button[@class='Payment-Button CC']"));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@class='Payment-Button CC']")));

        debitCard.click();

        //wait.until(ExpectedConditions.visibilityOfAllElements(tc2e.paymentButtons));


    }

}
