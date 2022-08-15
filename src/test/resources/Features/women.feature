Feature: women page
  @wm @somke
  Scenario:order confirm
    Given user on website cliks women tag
    When user select blouse tag and select an item add it to cart
    And then click proceed checkout  summary page open and user click proceed checkout
    And then user enter aleardy registered information and click sign in button
    And then user click proceed checkout on shipping page user click agree to term checkbox
    And user on payment page click on pay by bank wire
    Then user click on i confirm my order