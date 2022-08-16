Feature: search
  @regression
  Scenario: to test search bar
    Given user on automationpractice website
    When user enter data to search
    Then data displayed successfully

  @regression @n
    Scenario: click next and previous button
  * user clicks next button and previous button on home page

  @regression @f
  Scenario: customer service
    * user select a subject heading
    * user then enter email address and order reference
    * user then attach file
    * user enter message
    * user cliks send