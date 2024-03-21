package US_302;

import US_301.TC_0101_Elementleri;
import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_0201 extends BaseDriver {

    @Test
    public void TC_0201() {

        TC_0101_Elementleri tc1e = new TC_0101_Elementleri();
        TC_0201_Elementleri tc2e = new TC_0201_Elementleri();


        tc1e.addCart.click();

        driver.switchTo().frame(tc1e.iframe1);

        //int parseCartItems = Integer.parseInt(tc2e.CartItems.getText());
        //System.out.println("parseCartItems = " + parseCartItems);

        String text=tc2e.CartItems.getText();


    }

}
