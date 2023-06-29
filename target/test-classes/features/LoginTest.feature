Feature: Adding Items to Cart


  @testMV1
  Scenario: User Tries to Add Item to Cart Without Being Signed In
    Given the user is on the main page of gadgetarium.us
    When the user selects an item
    And adds an item to the cart
    Then the user should be prompted to sign in or register
    Then the item should be added to the cart

  @testMV2
  Scenario: Verify item in the cart
    Given the user is on the main page of gadgetarium.us
    When adds an item to the cart
    Then the item should be displayed in the cart