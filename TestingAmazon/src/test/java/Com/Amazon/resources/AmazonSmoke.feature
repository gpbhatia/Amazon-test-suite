Feature: As a customer i like to verify Home Page feature

  Background: User is on Home Page

    Scenario Outline: Verify key button are visible on Home Page
      Then Following buttons should be present on Home Page
      And User should be able to click each button"<ButtonId>" "<ButtonName>" "<ClickMessage>"
      Examples:
      |ButtonId               |ButtonName             |ClickMessage                      |
      |Help                   |Help page              |Browse Help Topics                |
      |Amazon Assistant       |Amazon Assistant       |Shop smarter online               |
      |Become an Amazon Vendor|Become an Amazon Vendor|Vendor express                    |
      |Hello,Sign in          |Sign in                |E-mail                            |
      |Try Prime              |Try Amazon Prime       |Start your 30 day Prime free trial|

