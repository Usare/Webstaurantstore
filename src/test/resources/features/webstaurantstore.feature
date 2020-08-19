Feature: Adding stainless work table

@Webtest
  Scenario: Search work table
    Given User navigates to webstaurantstore
    When Search for stainless work table
    Then Check the search result ensuring every product item has the word Table its title
    And Add the last of found items to Cart
    Then Empty Cart