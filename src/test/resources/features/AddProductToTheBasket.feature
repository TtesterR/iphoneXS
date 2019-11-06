Feature: Add iphoneXS to the basket
  In order to look cooler
  I want to buy iphoneXS

  Scenario: Add 'iphoneXS' to the basket
    Given the user is on the Rozetka home page
    When the user looks up product "iphone"
    And the user choose product "iphoneXS"
    And the user changes the color of the phone to Space gray
    And The user adds the phone to the basket
    Then  they should see product "Apple iPhone Xs 256GB Space Gray (MT9H2)" to the basket

