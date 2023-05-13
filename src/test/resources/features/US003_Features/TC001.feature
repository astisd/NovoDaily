@new
  Feature: Functionality of top menu
    Background: it is the same first test-step for all scenarios.
      Given The user navigate to novoDaily website
      And accept the cookie

      Scenario Outline: : Verify that Produkte, Deine Ziele, Wissenswertes, Ratgeber categories  are active
        When hovers over a "<CategoryName>" categoriy title
        And wait for 5 seconds
        Then verify that the navigation flyout is displayed
        Then close the browser

        Examples:
        |CategoryName|
        |Produkte|
        |Deine Ziele|
        |Wissenswertes|
        |Ratgeber|
