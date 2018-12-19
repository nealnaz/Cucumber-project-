package Actionpkg;


import Basepkg.parentclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.Homepage;
import pages.Siginpage;

import static org.testng.AssertJUnit.assertEquals;

public class Actionclass extends parentclass {
    WebDriver driver;

    Homepage hp=new Homepage(driver);
    Siginpage sp=new Siginpage(driver);



    public void iam_on_home_page()  {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.zoopla.co.uk/");
    }


    public void hover_on_sign_in() {
        // Write code here that turns the phrase above into concrete actions
        Actions act =new Actions(driver);
        act.moveToElement(driver.findElement(By.linkText("sigin"))).perform();


    }


    public void enter_email_address()  {
        // Write code here that turns the phrase above into concrete actions
        sp.nametxtfield.sendKeys("neelofar");

    }


    public void enter_password() {
        // Write code here that turns the phrase above into concrete actions
        sp.passwordfield.sendKeys("xyz");
    }


    public void click_signin_button()  {
        // Write code here that turns the phrase above into concrete actions
       driver.findElement(By.id("signin_submit")).click();
    }


    public void validate_zoopla_web_page()  {
        // Write code here that turns the phrase above into concrete actions

        String astr=driver.findElement(By.xpath("//*[@id=\"mbody\"]/section/div/article/header/h1")).getText();
        System.out.println(astr);
        assertEquals("My enquiries (0)" , astr);

    }


}



