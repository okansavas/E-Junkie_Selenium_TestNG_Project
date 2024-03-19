package US_301;

import Utility.BaseDriver;
import org.testng.annotations.Test;

public class TC extends BaseDriver {


    @Test
    public void AddToCart() {

        TC_Elementleri tce = new TC_Elementleri();

        tce.addCart.click();


    }
}
