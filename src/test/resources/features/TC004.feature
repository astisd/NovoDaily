#@wip

  Feature: functionality of "Stress reduzieren" navigation link
    Background: it is the same first test-step for all scenarios.
      Given The user navigate to novoDaily website
      And accept the cookie

      Scenario: Verify that a user can click on "Stress reduzieren" navigation link and can see sub-options

        Then wait for the homepage to load for 5 seconds
        When hovers over the Deine Ziele menu
        And click on the "Stress reduzieren" tab to open it in a separate tab
        Then scroll down til "Abnehmen" navigate-link is visible
        And click on the "Stress reduzieren" navigate-link
        And verify that the "Outdoor-Yoga" font is displayed
        Then close the browser
