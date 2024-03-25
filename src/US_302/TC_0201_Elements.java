package US_302;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC_0201_Elements {
    public TC_0201_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "(//span[@class='Cart-Items-Nos'])[1]")
    public WebElement CartItems;

    @FindBy(css = "button[class*='Payment-Button']")
    public List<WebElement> paymentButtons;


}
