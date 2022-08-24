import com.evri.testing.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepDefinition {

    WebDriver chromeWebDriver;
    HomePage homePage;

    @Given("Browser is open")
    public void browser_is_open() {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\ucheo\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
        chromeWebDriver = new ChromeDriver();
        homePage = new HomePage(chromeWebDriver);

    }
//    @Then("Enter URl")
//    public void enter_u_rl() {
//
//    }
//    @Then("Click Log In button on the top menu panel")
//    public void click_log_in_button_button_on_the_top_menu_panel() {
//        WebElement logInButton = chromeWebDriver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/nav/div[1]/div/div[2]/div[1]"));
//        Assert.assertTrue(logInButton.isDisplayed());
//        logInButton.click();
//
//    }
//
//    @When("Log in window appears")
//    public void log_in_window_appears() {
//        WebElement logInWindow = chromeWebDriver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]"));
//        Assert.assertTrue(logInWindow.isDisplayed());
//
//    }
//    @Then("click Log in button without entered credentials")
//    public void click_log_in_button_without_entered_credentials() {
//    }
    @Then("error messages appear: Email cannot be blank and Password cannot be blank")
    public void error_messages_appear_email_cannot_be_blank_and_password_cannot_be_blank() {
//        WebElement emailCannotBeBlank = chromeWebDriver.findElement(By.xpath("//*[@id=\"auth0-lock-error-msg-email\"]/div"));
//        WebElement passwordCannotBeBlank = chromeWebDriver.findElement(By.xpath("//*[@id=\"auth0-lock-error-msg-password\"]/div"));

//    }
//    @Then("Enter valid email to Email Address field")
//    public void enter_valid_email_to_email_address_field() {
//        WebElement textBoxEmail = chromeWebDriver.findElement(By.xpath("//*[@id=\"1-email\"]"));
//        Assert.assertTrue(textBoxEmail.isEnabled());
//        Assert.assertTrue(textBoxEmail.isDisplayed());
//        textBoxEmail.click();
//        textBoxEmail.sendKeys("John.Walter@bbvhcypp.mailosaur.net");
//
//
//    }
//    @Then("Enter valid password to Password field")
//    public void enter_valid_password_to_password_field() {
//        WebElement textBoxPassword = chromeWebDriver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div/div/div[2]/div[2]/span/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div[1]/div[1]/input"));
//        Assert.assertTrue(textBoxPassword.isEnabled());
//        Assert.assertTrue(textBoxPassword.isDisplayed());
//        textBoxPassword.click();
//        textBoxPassword.sendKeys("Userforexam123");
//
//    }
//    @Then("Click Log in button")
//    public void click_log_in_button() {
//        WebElement testBoxSubmit = chromeWebDriver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div/button/span"));
//        Assert.assertTrue(testBoxSubmit.isEnabled());
//        Assert.assertTrue(testBoxSubmit.isDisplayed());
//        testBoxSubmit.click();

    }

    @When("I log in without credentials")
    public void iLogInWithoutCredentials() {
        homePage.loginWithoutCredentials();
    }

    @Given("I go to home page")
    public void iGoToHomePage() {
        homePage.gotoHome();
    }

    @And("I enter valid credentials")
    public void iEnterValidCredentials() {
        homePage.loginWithValidCredentials();
    }

    @And("close browser")
    public void closeBrowser() {
        chromeWebDriver.close();

    }
}
