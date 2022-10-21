@Test
Feature: Login user page DemoBleze

  Scenario Outline: SigIn session in the page Github correctly
    Given the user navigates to www.github.com/login
    When the user enter your <user> and <password>
    And click in the Sig in button and see de home page
    Then the user close session correctly

    Examples:
      |user|                  |password|
      |dquinte7@gmail.com||1234*|
      |dquinte7@gmail.com||9876543|
      |1234*||dquinte7@gmail.com|