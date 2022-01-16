Feature: User can create a new account

  Scenario Outline: New user create account
    Given User navigate to ebay
    When user click on register
    And fill "<FirstName>", "<LastName>", "<Email>" and "<Password>"
    And user click on Create Account
    Then user can go to home page

    Examples:
     | FirstName | LastName | Email                | Password     |
     | Ashiq     |   new    | ashiq.new5@gmail.com | asdfgh123@ |
     | Ashiq     |   new    | ashiq.new6@gmail.com | asdfgh123@ |
     | Ashiq     |   new    | ashiq.new7@gmail.com | asdfgh123@ |
     | Ashiq     |   new    | ashiq.new8@gmail.com | asdfgh123@ |

