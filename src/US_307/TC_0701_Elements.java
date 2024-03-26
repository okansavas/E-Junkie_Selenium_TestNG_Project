package US_307;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_0701_Elements {

    public TC_0701_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//a[@class='EJ-ShopLink']")
    public WebElement eJShoplink;

    @FindBy(xpath = "//div[@class='wrapper']/a")
    public WebElement getItNow;


}
