Feature: User can visit all Home page's elements

  Background: User is Logged In
    Given I navigate to Ebay Home Page
    When I go to login form
    And I fill username and password
       |  Locators.loginUserName   |  Locators.loginPassword  |
    Then I will be in the ebay home page

    Scenario Outline: User visit every element of home page
      #Given I navigate to Ebay Home Page
      When User can go to "<Page>"
      Then Verify "<Page>" visited by "<PageText>"
      And User back to Home Page

      Examples:
        |     Page          |    PageText         |
        |  dailydeals       |      Deals         |
        |  helpAndContact    |   Customer Service  |
        |  Selling          |      You are on selling home page |
        |  watchlist          |      watchlist   |
        |  electronics        |  Electronics |
        |  fashion             | Fashion That’s Made for You         |
        |  healthAndBeauty     |      Health & Beauty         |
        |  sports              |     Sporting Goods         |
        |  collectiblesAndArt  |      Collectibles         |
        |  industrialEquipment  |      Business & Industrial         |
        |  Motors                |      Motors         |
