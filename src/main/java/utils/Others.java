package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Others {
    WebDriver driver;

    public Others (WebDriver driver) { this.driver = driver; }
    public void scrollToElement(By element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement elem = driver.findElement(element);
        js.executeScript("arguments[0].scrollIntoView();", elem);
    }
}
