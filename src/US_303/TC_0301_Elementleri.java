package US_303;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.List;

public class TC_0301_Elementleri {
    @FindBy(css = "div[class='Payment-Options'] [class='Payment-Button CC']")
    public WebElement payCreditCard;


}
