package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Locators;
import org.testng.Assert;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class CommonPages {

    WebDriver driver;

    public CommonPages (WebDriver driver) { this.driver = driver; }

    public void clickOnButton (By btn) {

        driver.findElement((btn)).click();
    }

    public void sendText(By field, String text) {
        driver.findElement(field).sendKeys(text);
    }
    public String getText(By element) {
        return driver.findElement(element).getText();
    }

    public void back () {
        if (!Objects.equals(driver.getCurrentUrl(), Locators.homePageUrl))
        {
            driver.navigate().back();
        }
    }

    public void verifyPages(By element, String text){
        String elementText = driver.findElement(element).getText();
        Assert.assertEquals(elementText, text);
        System.out.println("Successfully visited " + elementText);
    }
    public void verifyByUrl(String url) {
        Assert.assertEquals(driver.getCurrentUrl(), url);
        System.out.println("Successfully visited " + url);
    }
    public void goToHomePage () {
        driver.findElement(Locators.homePageBtn).click();
    }
}
