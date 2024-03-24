package US_303;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_0301_Elements {
    public TC_0301_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "div[class='Payment-Options'] [class='Payment-Button CC']")
    public WebElement payCreditCard;

    @FindBy(css = "input[placeholder='Email']")
    public WebElement email;

    @FindBy(css = "[placeholder='Confirm Email']")
    public WebElement confirmEmail;

    @FindBy(css = "[placeholder='Name On Card']")
    public WebElement nameOnCard;

    @FindBy(xpath = "//p[starts-with(@class,'Billing-Phone')]/input")
    public WebElement phone;


    @FindBy(xpath = "//p[@class='Billing-Company']/input")
    public WebElement company;

    @FindBy(css = "[class='BuyerNotes'] textarea")
    public WebElement orderNotes;

    @FindBy(xpath = "//iframe[contains(@name,'privateStripeFrame')]")
    public WebElement iframe2;
    // We need to switch frame to write the card number

    @FindBy(xpath = "//input[@name='cardnumber']")
    public WebElement cardNumber;


    @FindBy(css = "button[class='Pay-Button']")
    public WebElement payButton;

    @FindBy(css = "[id='SnackBar'] span")
    public WebElement invalidCarNumberText;


}
