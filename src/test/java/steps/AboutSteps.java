package steps;

import drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CommonPages;
import utils.Locators;
import utils.TimeOut;

public class AboutSteps extends DriverFactory {

    WebDriver driver = setUp();
    CommonPages commonPages = new CommonPages(driver);

    @Given("I navigate to Ebay web")
    public void i_navigate_to_ebay_web() {
        driver.get(Locators.homePageUrl);
        driver.manage().window().maximize();
        TimeOut.timeout();
    }
    @When("User can go to {string} section elements")
    public void user_can_go_to_section_elements(String elements) {
        switch (elements) {
            case "CompanyInfo":
                commonPages.clickOnButton(Locators.companyInfo);
                TimeOut.timeout();
                break;
            case "News":
                commonPages.clickOnButton(Locators.news);
                TimeOut.timeout();
                break;
            case "Investors":
                commonPages.clickOnButton(Locators.investors);
                TimeOut.timeout();
                break;
            case "Careers":
                //commonPages.verifyPages(Locators.deals, text);
                commonPages.clickOnButton(Locators.careers);
                TimeOut.timeout();
                break;
            case "GovernmentRelations":
                commonPages.clickOnButton(Locators.governmentRelations);
                TimeOut.timeout();
                break;
            case "AdvertiseWithUs":
                commonPages.clickOnButton(Locators.ads);
                TimeOut.timeout();
                break;
            case "Policies":
                commonPages.clickOnButton(Locators.policies);
                TimeOut.timeout();
                break;
        }
    }
    @Then("Verify {string} page by it's {string}")
    public void verify_page_by_it_s(String page, String url) {
        switch (page) {
            case "CompanyInfo":
            case "News":
            case "Investors":
            case "Careers":
            case "GovernmentRelations":
            case "AdvertiseWithUs":
            case "Policies":
                //commonPages.verifyPages(Locators.deals, text);
                commonPages.verifyByUrl(url);
                TimeOut.timeout();
                break;
        }
        driver.quit();
    }

}
