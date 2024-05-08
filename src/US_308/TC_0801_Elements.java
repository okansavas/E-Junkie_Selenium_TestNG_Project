package US_308;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC_0801_Elements {

    public TC_0801_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//div[@class='banner_btn']//a[@class='blue_btn']")
    public WebElement seeHowItWorks;

    @FindBy(xpath = "//div[@class='video-container']/iframe")
    public WebElement iframe3;

    @FindBy(xpath = "//button[contains(@onclick,'Youtube')]")
    public WebElement closeYouTubeButton;

    @FindBy(xpath = "(//div[@class='columns is-mobile']//a)[1]")
    public WebElement eJunkieHomePage;


}
