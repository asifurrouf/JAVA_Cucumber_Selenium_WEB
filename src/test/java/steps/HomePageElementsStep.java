package steps;

import drivers.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.CommonPages;
import utils.Locators;
import utils.TimeOut;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePageElementsStep extends DriverFactory {

    //DriverFactory driverFactory = new DriverFactory();
    WebDriver driver = setUp();
    CommonPages commonPages = new CommonPages(driver);

    @Given("I navigate to Ebay Home Page")
    public void i_navigate_to_ebay_home_page() {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("I go to login form")
    public void i_go_to_login_form() {
        commonPages.clickOnButton(Locators.signIn);
        TimeOut.timeout();
    }
    @When("I fill username and password")
    public void i_fill_username_and_password(DataTable dataTable) {
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
    @Then("I will be in the ebay home page")
    public void i_will_be_in_the_ebay_home_page() {
        try {
            commonPages.clickOnButton(Locators.signInBtn);
            TimeOut.timeout();
        } catch (Exception e) {
            commonPages.goToHomePage();
            TimeOut.timeout();
        }
    }
    @When("User can go to {string}")
    public void user_can_go_to(String page) {

        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        switch (page){
            case "dailydeals":
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                commonPages.clickOnButton(Locators.dailyDeals);
                TimeOut.timeout();
                break;
            case "helpAndContact":
                TimeOut.timeout();
                commonPages.clickOnButton(Locators.helpAndContact);
                TimeOut.timeout();
                break;
            case "Selling":
                TimeOut.timeout();
                commonPages.clickOnButton(Locators.sell);
                TimeOut.timeout();
                break;
            case "watchlist":
                TimeOut.timeout();
                commonPages.clickOnButton(Locators.watchlist);
                TimeOut.timeout();
                break;
            case "electronics":
                TimeOut.timeout();
                commonPages.clickOnButton(Locators.electronics);
                TimeOut.timeout();
                break;
            case "fashion":
                TimeOut.timeout();
                commonPages.clickOnButton(Locators.fashion);
                TimeOut.timeout();
                break;
            case "healthAndBeauty":
                TimeOut.timeout();
                commonPages.clickOnButton(Locators.healthAndBeauty);
                TimeOut.timeout();
                break;
            case "sports":
                TimeOut.timeout();
                commonPages.clickOnButton(Locators.sports);
                TimeOut.timeout();
                break;
            case "collectiblesAndArt":
                TimeOut.timeout();
                commonPages.clickOnButton(Locators.collectiblesAndArtPage);
                TimeOut.timeout();
                break;
            case "industrialEquipment":
                TimeOut.timeout();
                commonPages.clickOnButton(Locators.industrialEquipmentPage);
                TimeOut.timeout();
                break;
            case "Motors":
                TimeOut.timeout();
                commonPages.clickOnButton(Locators.motorsPage);
                TimeOut.timeout();
                break;
        }
    }
    @Then("Verify {string} visited by {string}")
    public void verify_visited_by(String page, String text) {
        switch (page){
            case "dailydeals":
                commonPages.verifyPages(Locators.deals, text);
                TimeOut.timeout();
                break;
            case "helpAndContact":
                commonPages.verifyPages(Locators.customerServiceId, text);
                TimeOut.timeout();
                break;
            case "Selling":
                commonPages.verifyPages(Locators.sellingPath, text);
                TimeOut.timeout();
                break;
            case "watchlist":
                //commonPages.verifyPages(Locators.deals, text);
                commonPages.clickOnButton(Locators.watchlist);
                TimeOut.timeout();
                break;
            case "electronics":
                commonPages.verifyPages(Locators.electronicsPath, text);
                TimeOut.timeout();
                break;
            case "fashion":
                commonPages.verifyPages(Locators.fashionPath, text);
                TimeOut.timeout();
                break;
            case "healthAndBeauty":
                commonPages.verifyPages(Locators.healthAndBeautyPath, text);
                TimeOut.timeout();
                break;
            case "sports":
                commonPages.verifyPages(Locators.sportsPath, text);
                TimeOut.timeout();
                break;
            case "collectiblesAndArt":
                commonPages.verifyPages(Locators.collectiblesAndArtPagePath, text);
                TimeOut.timeout();
                break;
            case "industrialEquipment":
                commonPages.verifyPages(Locators.industrialEquipmentPagePath, text);
                TimeOut.timeout();
                break;
            case "Motors":
                commonPages.verifyByUrl(Locators.motorsPageUrl);
                TimeOut.timeout();
                break;
        }
    }
    @Then("User back to Home Page")
    public void user_back_to_home_page() {
        TimeOut.timeout();
        commonPages.goToHomePage();
        TimeOut.timeout();
        driver.quit();
    }
}
