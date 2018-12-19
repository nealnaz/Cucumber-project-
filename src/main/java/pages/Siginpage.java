package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Siginpage {
    WebDriver driver;

    @FindBy(name = "signin_emial")
    public WebElement nametxtfield;

    @FindBy(name = "signin_password")
    public WebElement passwordfield;

    @FindBy(name = "action:signin")
    public WebElement signinbtn;

    public Siginpage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
