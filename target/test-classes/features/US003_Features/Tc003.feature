Feature: Functionality of top menu

  Scenario Outline: Produkte, Deine Ziele, Wissenswertes, Ratgeber categories titel should redirect to relavant pages.
    Given The user navigate to novoDaily website
    And accept the cookie
    Then wait for the homepage to load for 4 seconds
    When click on "<Category title>" category title
    And wait for the page to load for 3 seconds
    Then verify that the "<KeyWord>" font is displayed
    And return to the homepage


    Examples:
      |Category title|    |KeyWord|
      |Produkte|          |Alle Produkte|
      |Deine Ziele|       |Deine Ziele|
      |Wissenswertes|     |Wissenswert|
      |Ratgeber|          |Dein Novodaily Ratgeber|