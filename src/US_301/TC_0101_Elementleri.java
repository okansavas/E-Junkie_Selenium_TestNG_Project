package US_301;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_0101_Elementleri {

    public TC_0101_Elementleri() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//h4[text()='Demo eBook']/../button")
    public WebElement addCart;

    @FindBy(css = "iframe[style='display: block;']")
    public WebElement iframe1;

    @FindBy(css = "button[data-option='Paypal']")
    public WebElement paypalButton;

    @FindBy(css = "[class='Actions']>button+button")
    public WebElement addPromoCode;

    @FindBy(css = "[placeholder='Promo Code']")
    public WebElement promoCodeText;

    @FindBy(xpath = "//button[text()='Apply']")
    public WebElement promoCodeApply;

    @FindBy(xpath = "//span[text()='Invalid promo code']")
    public WebElement invalidPromoCode;
}
