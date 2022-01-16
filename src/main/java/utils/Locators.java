package utils;

import org.openqa.selenium.By;

public class Locators {

    public static String homePageUrl = "https://www.ebay.com/";
    public static String fbLoginPageTitle = "Log in to Facebook | Facebook";
    public static String loginUserName = "ashiq.qups@gmail.com";
    public static String loginPassword = "123456789As@";
    public static By homePageBtn = By.cssSelector("#gh-la");

    //homePageTests
    public static By deals = By.linkText("Deals");
    public static By customerServiceId = By.id("gh-title");
    public static String dealsText = "Deals";
    public static String customerServicesText = "Customer Service";
    public static By sellingPath = By.xpath("/html/body/div[2]/div[1]/div/div[1]/h1/span");
    public static String sellText = "Selling";
    public static By electronicsPath = By.xpath("/html/body/div[5]/div[2]/h1/span");
    public static String electronicsText = "Electronics";
    public static By fashionPath= By.xpath("/html/body/div[5]/div[2]/nav/ol/li[2]/span");
    public static String fashionText = "Fashion That’s Made for You";
    public static By healthAndBeautyPath = By.xpath("/html/body/div[5]/div[2]/h1/span");
    public static String healthAndBeautyText = "Health & Beauty";
    public static By homeAndGardenPath = By.linkText("Home & Garden");
    public static String homeAndGardenText = "Home & Garden";
    public static By sportsPath = By.xpath("/html/body/div[5]/div[2]/section/div[1]/div[2]/h1");
    public static String sportsText = "Sporting Goods";
    public static By collectiblesAndArtPagePath = By.xpath("/html/body/div[5]/div[2]/nav/ol/li[2]/span");
    public static String collectiblesAndArtPageText = "Collectibles";
    public static By industrialEquipmentPagePath = By.xpath("/html/body/div[5]/div[2]/h1/span");
    public static String industrialEquipmentPageText = "Business & Industrial";
    public static String motorsPageUrl = "https://www.ebay.com/sch/6028/i.html?_from=R40&_nkw=Auto+Parts+Accessories&_blrs=recall_filtering";

    public static By dailyDeals = By.linkText("Daily Deals");
    public static By helpAndContact = By.linkText("Help & Contact");
    public static By sell = By.linkText("Sell");
    public static By electronics = By.linkText("Electronics");
    public static By fashion = By.linkText("Fashion");
    public static By healthAndBeauty = By.linkText("Health & Beauty");
    public static By homeAndGarden = By.linkText("Home & Garden");
    public static By sports = By.linkText("Sports");
    public static By collectiblesAndArtPage = By.linkText("Collectibles and Art");
    public static By industrialEquipmentPage = By.xpath("//*[@id='mainContent']/div[1]/ul/li[9]/a");
    public static By motorsPage = By.linkText("Motors");
    public static By watchlist = By.linkText("Watchlist");

    //popular categories
    public static By sneakers = By.xpath("//*[@id='destinations_list2']/ul/li[1]");
    public static By koreanBeauty = By.xpath("//*[@id='destinations_list2']/ul/li[2]");
    public static By wristWatches = By.xpath("//*[@id='destinations_list2']/ul/li[3]");
    public static By fishing = By.xpath("//*[@id='destinations_list2']/ul/li[4]");
    public static By collectibles = By.xpath("//*[@id='destinations_list2']/ul/li[5]");
    public static By smartPhones = By.xpath("//*[@id='destinations_list2']/ul/li[6]");
    public static By popularSell = By.xpath("//*[@id='destinations_list2']/ul/li[7]");

    public static String sneakersUrl = "https://www.ebay.com/b/Retail-Campaign/bn_7116433159";
    public static String koreanBeautyUrl = "https://www.ebay.com/b/Korean-Health-and-Beauty/bn_7116437158";
    public static String wristWatchesUrl = "https://www.ebay.com/b/Wristwatches/31387/bn_2408451";
    public static String fishingUrl = "https://www.ebay.com/b/Fishing-Equipment-Supplies/1492/bn_1851047";
    public static String collectiblesUrl = "https://www.ebay.com/b/Collectibles-Art/bn_7000259855";
    public static String smartPhonesUrl = "https://www.ebay.com/b/Cell-Phones-Smart-Watches-Accessories/15032/bn_1865441";
    public static String popularSellUrl = "https://export.ebay.com/ru/";

    //Registration
    public static By registration = By.linkText("Registration");
    public static By firstSignUpBtn = By.xpath("//*[@id='article_content']/div[2]/div/div/div/div/p[2]/a");
    public static By secondSignUpBtn = By.xpath("//*[@id='article_content']/div[2]/div[2]/div/div/div/a");
    public static By signUpPage = By.xpath("//*[@id='mainContent']/div[3]/h1");
    public static String signUpPageText = "Create an account";
    public static By register = By.linkText("register");
    public static By firstName = By.id("firstname");
    public static By lastName = By.id("lastname");
    public static By email = By.id("Email");
    public static By passwordFill = By.id("password");
    public static By createAccount = By.id("EMAIL_REG_FORM_SUBMIT");

    //Buy
    public static By moneyBackGuarantee = By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li[3]/a");
    public static By biddingAndBuyingHelp = By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li[4]/a");
    public static By stores = By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li[5]/a");
    public static String moneyBackGuaranteeUrl = "https://pages.ebay.com/ebay-money-back-guarantee/";
    public static String biddingAndBuyingHelpUrl = "https://www.ebay.com/help/buying";
    public static String storesUrl = "https://www.ebay.com/b/Stores-HUB/bn_7004224522";


    //Sign In
    public static By signIn = By.linkText("Sign in");
    //public static By fbId = By.id("signin_fb_btn");
    public static By fbXPath = By.xpath("//*[@id='signin_fb_btn']");
    public static By googleId = By.id("signin_ggl_btn");
    public static By userName = By.id("userid");
    public static By continueBtn = By.id("signin-continue-btn");
    public static By passWord = By.id("pass");
    public static By signInBtn = By.id("sgnBt");
    public static By profileBtn = By.id("gh-ug");
    public static By signOut = By.linkText("Sign out");

    //Sell
    public static String startSellingPageUrl = "https://www.ebay.com/sl/sell";
    public static String learnToSellPageUrl = "https://pages.ebay.com/seller-center/get-started/selling-basics.html";
    public static String affiliatesPageUrl = "https://partnernetwork.ebay.com/";

    public static By startSelling = By.linkText("Start selling");
    public static By learnToSell = By.linkText("Learn to sell");
    public static By affiliates = By.linkText("Affiliates");

    //Search Product

    public static By searchBox = By.xpath("//*[@id='gh-ac']");
    public static By searchBtn = By.xpath("//*[@id='gh-btn']");
    public static By categories = By.id("gh-cat");
    public static By categoryNameHealthAndBeauty = By.xpath("//*[@id='gh-cat']/option[20]");

    //About
    public static By companyInfo = By.linkText("Company info");
    public static By news = By.linkText("News");
    public static By investors = By.linkText("Investors");
    public static By careers = By.linkText("Careers");
    public static By governmentRelations = By.linkText("Government relations");
    public static By ads = By.linkText("Advertise with us");
    public static By policies = By.linkText("Policies");
}
