package US_304;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC_0401_Elements {

    public TC_0401_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//input[@name='exp-date']")
    public WebElement expDate;

    @FindBy(xpath = "//input[@name='cvc']")
    public WebElement cvc;

    @FindBy(xpath = "//button[@class='Pay-Button']")
    public WebElement payButton;

    @FindBy(xpath = "//p[@class='confirme_text']/span")
    public WebElement confirmText;

    @FindBy(xpath = "(//p[@class='all_text content_head2'])[1]")
    public WebElement orderNumber;


}
