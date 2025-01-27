package pages;

import org.openqa.selenium.By;

import static helper.Utility.driver;

public class WebPage {

    By input_username = By.id("user-name");
    By input_password = By.id("password");
    By input_login = By.id("login-button");
    By icon_cart = By.xpath("//a[@class='shopping_csrt_link']");

    public void openBrowser(){
        driver.get("https://www.saucedemo.com/");
    }

    public void inputUsername(){
        driver.findElement(input_username).sendKeys("username");
    }

    public void inputPassword(){
        driver.findElement(input_password).sendKeys("password");
    }


    public void inputLogin(){
        driver.findElement(input_login).click();
    }

    public void assertHomePage(){
        driver.findElement(icon_cart).isDisplayed();
    }
}
