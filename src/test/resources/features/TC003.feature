#@wip
  Feature: Functionality of "Deine Ziele" menu on the homepage
    Background: it is the same first test-step for all scenarios.
      Given The user navigate to novoDaily website
      And accept the cookie

      Scenario: Verify that the menu on the homepage open successfully

        Then wait for the homepage to load for 3 seconds
        When hovers over the Deine Ziele menu
        And hovers over each tab within the product menu until the "Abnehmen" tab is visible
        Then click on the "Abnehmen" tab to open it in a separate tab
        And verify that the "Abnehmen" titel is displayed on the new tab
        Then close the browser