package US_301;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_Elementleri {

    public TC_Elementleri() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//h4[text()='Demo eBook']/../button")
    public WebElement addCart;
}
