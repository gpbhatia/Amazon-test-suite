Feature: Amazon Search Functionality

  As an user
  I want to search a product
  So that I can view the product page successfully

  @smoke1
  Scenario Outline: Search
    Given user is in home page
    When user clicks on searchbar
    When user enters "<product>"
    Then user should see the product detail page successfully
    Examples:
    |product|
    |laptop |