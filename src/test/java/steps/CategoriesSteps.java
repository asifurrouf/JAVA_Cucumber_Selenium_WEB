package steps;

import drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CommonPages;
import utils.Locators;
import utils.Others;
import utils.TimeOut;

import java.util.concurrent.TimeUnit;

public class CategoriesSteps extends DriverFactory {

    WebDriver driver = setUp();
    CommonPages commonPages = new CommonPages(driver);
    Others others = new Others(driver);

    @Given("I navigate to Ebay")
    public void i_navigate_to_ebay() {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
    }
    @When("User can go to {string} From home page")
    public void user_can_go_to_from_home_page(String items) {
        switch (items){
            case "sneakers":
                //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                others.scrollToElement(Locators.sneakers);
                commonPages.clickOnButton(Locators.sneakers);
                TimeOut.timeout();
                break;
            case "koreanBeauty":
                TimeOut.timeout();
                commonPages.clickOnButton(Locators.koreanBeauty);
                TimeOut.timeout();
                break;
            case "wristWatches":
                TimeOut.timeout();
                commonPages.clickOnButton(Locators.wristWatches);
                TimeOut.timeout();
                break;
            case "fishing":
                TimeOut.timeout();
                commonPages.clickOnButton(Locators.fishing);
                TimeOut.timeout();
                break;
            case "collectibles":
                TimeOut.timeout();
                commonPages.clickOnButton(Locators.collectibles);
                TimeOut.timeout();
                break;
            case "smartPhones":
                TimeOut.timeout();
                commonPages.clickOnButton(Locators.smartPhones);
                TimeOut.timeout();
                break;
            case "popularSell":
                TimeOut.timeout();
                commonPages.clickOnButton(Locators.popularSell);
                TimeOut.timeout();
                break;
        }
    }
    @Then("Verify {string} visited by it's {string}")
    public void verify_visited_by_it_s(String items, String url) {
        switch (items){
            case "sneakers":
            case "koreanBeauty":
            case "fishing":
            case "collectibles":
            case "smartPhones":
            case "popularSell":

                //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                commonPages.verifyByUrl(url);
                TimeOut.timeout();
                break;
            case "wristWatches":
                TimeOut.timeout();
                commonPages.verifyByUrl(url);
                TimeOut.timeout();
                break;
        }
    }
    @Then("User back to Home")
    public void user_back_to_home() {
        TimeOut.timeout();
        try{
            commonPages.goToHomePage();
            TimeOut.timeout();
            driver.quit();
        } catch (Exception e) {
            driver.quit();
        }
    }
}
