package StepDefinition;

import Pages.BootsLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BootsLoginSteps
{
WebDriver driver;

BootsLoginPage objloginpage = new BootsLoginPage();
    @Given("URL is launched")
    public void url_is_launched() {
        System.setProperty(
                "webdriver.chrome.driver",
                "/Users/divumanojuu/Downloads/chrome-mac-x64.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.leafground.com/input.xhtml");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, BootsLoginPage.class);
        objloginpage.gsearchbtn(driver, "Dhivya");
        driver.quit();
    }
    @When("the homepage is opened")
    public void the_homepage_is_opened() {
        System.out.println("Hello World");
    }
    @When("Click login\\/register link")
    public void click_login_register_link() {
        System.out.println("Hello World");
    }
    @Then("validate the page is navigated to login\\/registartion page")
    public void validate_the_page_is_navigated_to_login_registartion_page() {
        System.out.println("Hello World");
    }

}
