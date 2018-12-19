package pages;

import com.sun.jna.win32.W32APIFunctionMapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    WebDriver driver;
    @FindBy(linkText = "")
    public WebElement sigintab;

    @FindBy(linkText = "")
    public WebElement viewmyhome;

    public Homepage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


}
