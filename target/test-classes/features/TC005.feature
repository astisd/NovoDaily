

  Feature: Functionality of "search" box on the homepage
    Background: it is the same first test-step for all scenarios.
      Given The user navigate to novoDaily website
      And accept the cookie

      Scenario Outline: Verify that if a user writes any product name in the search section,
      then can see a production and it's price .

        When click on search box and type any "<productname>"
        Then wait for the homepage to load for 5 seconds
        And verify that the "<price>", "<number>", logo of product are displayed
        And verify that "<product name>" contains any of the words written in the search box
        Then close the browser

        Examples:
        |productname|             |price|         |number|     |product name|
        |NovoDailies|             |99,00|         |1|           |NovoDailies|
        |NovoDaily B12|           |89,00|         |1|           |NovoDaily B12|
        |NovoDaily Bundle - B|    |89,00|         |1|           |NovoDaily Bundle - B|
        |NovoDaily Bundle - BD|   |775,00|        |1|            |NovoDaily Bundle - BD|
        |NovoDaily Bundle - D|    |524,00|        |1|            |NovoDaily Bundle - D|
        |NovoDaily D3|            |89,00|         |1|             |NovoDaily D3|
        |NovoDaily Lipids|        |89,00|         |1|             |NovoDaily Lipids|
        |NovoDaily Magnesium|     |89,00|         |1|             |NovoDaily Magnesium|
        |NovoDaily Nutrition|     |320,00|        |1|             |NovoDaily Nutrition|
        |NovoDaily Shape|         |289,00|        |1|             |NovoDaily Shape|
        |NovoDaily Subscription - BS| |99,00|     |1|             |NovoDaily Subscription - BS|
        |NovoDaily Subscription - DBS|  |149,00|  |1|             |NovoDaily Subscription - DBS|
        |NovoDaily Subscription - DS|    |99,00|  |1|             |NovoDaily Subscription - DS|
