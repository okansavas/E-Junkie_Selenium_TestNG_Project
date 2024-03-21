package US_302;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TC_0201_Elementleri {

    @FindBy(xpath = "(//span[@class='Cart-Items-Nos'])[1]")
    public WebElement CartItems;


}
