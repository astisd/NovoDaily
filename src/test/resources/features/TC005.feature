@wip

  Feature: Functionality of "search" box on the homepage
    Background: it is the same first test-step for all scenarios.
      Given The user navigate to novoDaily website
      And accept the cookie

      Scenario Outline: Verify that if a user writes any product name in the search section,
      then can see a production and it's price .

        When click on search box and type "<nutrition>"
        And verify that the price, number, logo of product are displayed
        And verify that product name contains any of the words written in the search box
        Then close the browser

        Examples:
        |NovoDailies|
        |NovoDaily B12|
        |NovoDaily Bundle - B|
        |NovoDaily Bundle - BD|
        |NovoDaily Bundle - D|
        |NovoDaily D3|
        |NovoDaily Lipids|
        |NovoDaily Magnesium|
        |NovoDaily Nutrition|
        |NovoDaily Shape|
        |NovoDaily Subscription - BS|
        |NovoDaily Subscription - DBS|
        |NovoDaily Subscription - DS|
