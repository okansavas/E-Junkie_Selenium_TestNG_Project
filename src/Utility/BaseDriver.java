package Utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.logging.Level;


import java.time.Duration;

public class BaseDriver {
    public static Logger logger4j2 = LogManager.getLogger(); // Loglar ekleyeceğim nesneyi başlattım. (Log Deposu)
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void BaslangicIslemleri() { //TearStart
        //System.out.println("Başlangıç işlemleri yapılıyor"); //driver oluşturma, wait işlemleri,
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(""); // Get output logs.
        logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();

        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(50));

        LoginTest();

    }

    public void LoginTest() {
        //System.out.println("Login Test Başladı");

        driver.get("https://shopdemo.fatfreeshop.com/");

        String url = driver.getCurrentUrl();

        Assert.assertEquals(url, "https://shopdemo.fatfreeshop.com/", "Site Açılmadı");

        //logger4j2.info("Log İşlemi Tamamlandı"); // normal bir bilgi
    }

    @AfterClass
    public void KapanisIslemleri() { // TearDown
        //System.out.println("Kapanış işlemleri yapılıyor"); //BekleKapat

        Tools.Wait(2);
        driver.quit();

        //logger4j2.info("Driver Kapatıldı");
    }

    @BeforeMethod
    public void BeforeMethod() {
        logger4j2.info("Test Method Başladı");
        System.out.println("****************************************");

        //logger4j2.warn("WARN : Method Başladı, Hata oluşmuş olsa idi");

    }


    @AfterMethod
    public void AfterMetod(ITestResult result) { // TestNG nin sonuç ve isim bilgisini olduğu değişkeni
        System.out.println("****************************************");
        logger4j2.info(result.getName() + " Metod finished " + (result.getStatus() == 1 ? "Passed" : "Failed"));


        //logger4j2.warn("WARN : Metod bitti, hata oluşmuş olsa idi");
    }
}
