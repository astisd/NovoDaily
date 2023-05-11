#@wip
Feature: NovoDaily Logo Functionality

  Background: it is the same first test-step for all scenarios.
    Given The user navigate to novoDaily website
    And accept the cookie

  Scenario: Verify that a user can click on the NOVODAILY logo and refresh the homepage.

    Then wait for the homepage to load for 3 seconds
    When The User click on the NovoDaily font logo
    And verify that the logo of NovoDaily is displayed on the homepage
    Then close the browser

