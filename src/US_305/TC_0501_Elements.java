package US_305;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class TC_0501_Elements {

    public TC_0501_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//span[starts-with(@class,'download_btn')]//..")
    public WebElement downloadButton;

    @FindBy(xpath = "(//span[@class='usd'])[2]")
    public WebElement totalUSD;


}
