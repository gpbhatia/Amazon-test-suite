Feature: Amazon Login Functionality

  As an user
  I want to login
  So that I can login successfully

  @smoke
  Scenario Outline: Login - Happy path

    Given I'm in homepage
    When I clicks on login button
    And I enters data with name "<Username>" and "<Password>"
    Then  user should login successfully


    Examples:
      |Username          |Password|
      |macy2005@gmail.com|chetan1 |
      |macy1234@gmail.com|chetan12|
@gp


Scenario: check Try Prime functionality

  Given I'm in homepage
  When I click on  Try Prime button
  Then user should see the Prime detail page successfully
@gp1
  Scenario: check Your Lists functionality
    Given I'm in homepage
    When I click on  Your Lists button
    Then user should see Get started page successfully