Feature: User can visit all Categories from home page

  Scenario Outline: User visit every categories of home page
    Given I navigate to Ebay
    When User can go to "<Categories>" From home page
    Then Verify "<Categories>" visited by it's "<url>"
    And User back to Home

    Examples:
      |     Categories          |    url                                                                  |
      |  sneakers              |      https://www.ebay.com/b/Retail-Campaign/bn_7116433159               |
      |  koreanBeauty           |  https://www.ebay.com/b/Korean-Health-and-Beauty/bn_7116437158          |
      |  wristWatches          |      https://www.ebay.com/b/Wristwatches/31387/bn_2408451                |
      |  fishing               |      https://www.ebay.com/b/Fishing-Equipment-Supplies/1492/bn_1851047   |
      |  collectibles          |  https://www.ebay.com/b/Collectibles-Art/bn_7000259855                    |
      |  smartPhones           | https://www.ebay.com/b/Cell-Phones-Smart-Watches-Accessories/15032/bn_1865441  |
      |  popularSell           |      https://export.ebay.com/ru/                                                |
