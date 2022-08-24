package com.evri.testing;

import org.openqa.selenium.By;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver chromeWebDriver;

    public HomePage(WebDriver driver) {
        this.chromeWebDriver = driver;
    }

    // Define Objects
    public WebElement loginButton(){
       return chromeWebDriver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/nav/div[1]/div/div[2]/div[1]"));

    }

    public WebElement acceptAllCookies(){
        return chromeWebDriver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));

    }

    public WebElement submitButton() {
        return chromeWebDriver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div/button/span/text()"));


    }

    public WebElement loginModal() {
        return chromeWebDriver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]"));

    }

    public WebElement textEmailBox() {
        return chromeWebDriver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div/div/div[2]/div[2]/span/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div[1]/div[1]/input"));
    }

    public WebElement textPasswordBox() {
        return chromeWebDriver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div/div/div[2]/div[2]/span/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div[1]/div[1]/input"));

    }
    // Todo: Change!
    public WebElement emailErrorText() {
        return chromeWebDriver.findElement(By.xpath("//*[@id=\"auth0-lock-error-msg-email\"]/div"));
    }
    // Todo: Change!
    public WebElement passwordErrorText() {
        return chromeWebDriver.findElement(By.xpath("//*[@id=\"auth0-lock-error-msg-password\"]/div"));
    }
    // Define methods
    public void gotoHome(){
        chromeWebDriver.get("https://www.evri.com");
        acceptAllCookies().click();
    }

    public void loginWithoutCredentials(){
        loginButton().click();
        Assert.assertTrue(loginModal().isDisplayed());
        submitButton().click();
        Assert.assertEquals("Email can't be blank", emailErrorText().getText());
        Assert.assertEquals("Password can't be blank", passwordErrorText().getText());

    }

    public void loginWithValidCredentials(){
        textEmailBox().sendKeys("John.Walter@bbvhcypp.mailosaur.net");
        textPasswordBox().sendKeys("Userforexam123");
        submitButton().click();
    }
}
