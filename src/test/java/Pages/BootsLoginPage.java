package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootsLoginPage
{
    @FindBy(xpath = "//input[@id='j_idt88:name']")
    public static WebElement searchbtn;

    public void gsearchbtn(WebDriver driver, String strkeyword)
    {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(searchbtn));
        searchbtn.sendKeys(strkeyword);
        System.out.println("jenkins");
    }
}
