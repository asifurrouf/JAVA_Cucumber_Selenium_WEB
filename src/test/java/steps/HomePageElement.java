package steps;

import drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CommonPages;
import utils.Locators;
import utils.TimeOut;

import java.util.concurrent.TimeUnit;

public class HomePageElement extends DriverFactory{

    //DriverFactory driverFactory = new DriverFactory();
    WebDriver driver = setUp();
    CommonPages commonPages = new CommonPages(driver);



    @When("User can click on Daily Deals button")
    public void user_can_click_on_daily_deals_button() {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        commonPages.clickOnButton(Locators.dailyDeals);
        TimeOut.timeout();
    }
    @Then("Verify daily deals page")
    public void verify_daily_deals_page() {
        commonPages.verifyPages(Locators.deals, Locators.dealsText);
        TimeOut.timeout();
    }
    @Then("Go Back to Home Page")
    public void go_back_to_home_page() {
        TimeOut.timeout();
        commonPages.goToHomePage();
        TimeOut.timeout();
        driver.quit();
    }

}
