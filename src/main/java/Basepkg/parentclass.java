package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentclass {
    public static WebDriver  driver;

    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\zubair\\Desktop\\NewAutomation\\chromedriver.exe");
        driver = new ChromeDriver();
    }

        public void close(){
            driver.close();
        }
    }

