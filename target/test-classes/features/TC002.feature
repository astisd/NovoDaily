@wip
  Feature: Functionality of "Produkte" dropdown on the homepage
    Background: it is the same first test-step for all scenarios.
      Given The user navigate to novoDaily website
      And accept the cookie

      Scenario: Verify that Produkte menu on the homepage open successfully

        Then wait for the homepage to load for 3 seconds
        When hovers over a Produkte menu
        And hovers over each tab within the product menu until the 'Bundles' tab is visible
        Then click on the 'Bundles' tab to open it in a separate tab
        And verify that the 'Bundles' titel is displayed on the new tab
        Then close the browser