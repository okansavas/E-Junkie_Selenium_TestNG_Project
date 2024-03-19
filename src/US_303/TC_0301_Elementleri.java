package US_303;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.List;

public class TC_0301_Elementleri {
    @FindBy(xpath = "//*[starts-with(text(),'Visa')]/..")
    public WebElement payCreditCard;


    @FindBy(xpath = "//*[starts-with(@class,'Payment-Button')]")
    public List<WebElement> paymentMethods;
}
