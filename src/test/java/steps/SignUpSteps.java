package steps;

import drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CommonPages;
import utils.Locators;
import utils.TimeOut;

public class SignUpSteps extends DriverFactory {

    WebDriver driver = setUp();
    CommonPages commonPages = new CommonPages(driver);

    @Given("User navigate to ebay")
    public void user_navigate_to_ebay() {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
    }
    @When("user click on register")
    public void user_click_on_register() {
        commonPages.clickOnButton(Locators.register);
        TimeOut.timeout();
    }
    @When("fill {string}, {string}, {string} and {string}")
    public void fill_and(String firstName, String lastname, String email, String password) {
        try {
            TimeOut.timeout();
            commonPages.sendText(Locators.firstName, firstName);
            commonPages.sendText(Locators.lastName, lastname);
            TimeOut.timeout();
            commonPages.sendText(Locators.email, email);
            TimeOut.timeout();
            commonPages.sendText(Locators.passwordFill, password);
            TimeOut.timeout();
            TimeOut.timeout();
        } catch (Exception e) {
            commonPages.clickOnButton(Locators.homePageBtn);
            TimeOut.timeout();
        }

    }
    @When("user click on Create Account")
    public void user_click_on_create_account() {
        try {
            commonPages.clickOnButton(Locators.createAccount);
            TimeOut.timeout();
        } catch (Exception e) {
            TimeOut.timeout();
            commonPages.clickOnButton(Locators.homePageBtn);
            TimeOut.timeout();
        }
    }
    @Then("user can go to home page")
    public void user_can_go_to_home_page() {
        TimeOut.timeout();
        commonPages.clickOnButton(Locators.homePageBtn);
        TimeOut.timeout();
        driver.quit();
    }

}
