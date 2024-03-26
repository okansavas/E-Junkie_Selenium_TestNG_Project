package US_306;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC_0601_Elements {
    public TC_0601_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "[name='close'][class*=Desktop-Only]")
    public WebElement closeButton;

    @FindBy(xpath = "//a[@class='contact']")
    public WebElement contactUs;

    @FindBy(xpath = "//form[@method='post']//input")
    public List<WebElement> post;

    @FindBy(xpath = "//input[@id='sender_name']")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@id='sender_email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@id='sender_subject']")
    public WebElement subjectInput;

    @FindBy(xpath = "//textarea[@id='sender_message']")
    public WebElement messageInput;

    @FindBy(xpath = "//button[@id='send_message_button']")
    public WebElement sendMessageButton;

    @FindBy(xpath = "//span[@id='recaptcha-anchor']")
    public WebElement recaptchaCheckbox;

    @FindBy(xpath = "//iframe[@title='reCAPTCHA']")
    public WebElement recaptchaFrame;

    @FindBy(xpath = "//a[@class='visit_website']")
    public WebElement visitWebsite;


}
