Feature: cart action
  @c @smoke
  Scenario: adding and deleting items to the cart
    Given :user on automationpractice website clicks on cart icon
    When :user clicks on checkout option
    And user clicks on dresses option and then on Evenig dresses and add an item
    And user increses item quantity and decrese item quantity and cliks on delete icon
    And user clicks on Home icon and on Best seller option add an item
    And user clicks continue shopping option
    Then user clicks on cart option again and clicks on close option cart is empty now
