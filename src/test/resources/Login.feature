Feature: User can login to ebay

  Scenario: User login to ebay web
    Given user go to ebay
    When user go to login form
    And user fill username and password
      |  Locators.loginUserName   |  Locators.loginPassword  |
    Then user will be in the ebay home page