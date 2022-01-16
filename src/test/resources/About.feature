Feature: User can visit About Section

  Scenario Outline: User visit About section
    Given I navigate to Ebay web
    When User can go to "<About>" section elements
    Then Verify "<About>" page by it's "<url>"

    Examples:
      |       About        |    url                                                 |
      |  CompanyInfo       |      https://www.ebayinc.com/company/               |
      |  News               | https://www.ebayinc.com/stories/news/         |
      |  Investors          |      https://investors.ebayinc.com/overview/default.aspx        |
      |  Careers            |      https://careers.ebayinc.com/                       |
      |  GovernmentRelations|  https://www.ebaymainstreet.com/                    |
      |  AdvertiseWithUs    | https://www.ebayads.com/                                              |
      |  Policies           |      https://www.ebay.com/help/policies/default/ebays-rules-policies?id=4205  |
