package steps;

import drivers.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CommonPages;
import utils.Locators;
import utils.TimeOut;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class LoginSteps extends DriverFactory{
    //DriverFactory driverFactory = new DriverFactory();
    WebDriver driver = setUp();
    CommonPages commonPages = new CommonPages(driver);

    @Given("user go to ebay")
    public void user_go_to_ebay() {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
    }
    @When("user go to login form")
    public void user_go_to_login_form() {
        commonPages.clickOnButton(Locators.signIn);
        TimeOut.timeout();
    }
    @When("user fill username and password")
    public void user_fill_username_and_password(DataTable dataTable) {
        List<List<String>> userList = dataTable.asLists(String.class);
        List<String> credential = userList.get(0);
        //List<String> password = userList.get(1);

        try {
            //String username = userList.get(0);
            commonPages.sendText(Locators.userName, credential.get(0));
            TimeOut.timeout();
            commonPages.clickOnButton(Locators.continueBtn);
            TimeOut.timeout();
            commonPages.sendText(Locators.passWord, credential.get(1));
        } catch (Exception e)
        {
            commonPages.goToHomePage();
            TimeOut.timeout();
        }
    }
    @Then("user will be in the ebay home page")
    public void user_will_be_in_the_ebay_home_page() {
        try {
            commonPages.clickOnButton(Locators.signInBtn);
            TimeOut.timeout();
            driver.quit();
        } catch (Exception e) {
            commonPages.goToHomePage();
            TimeOut.timeout();
            driver.quit();
        }
    }
}
