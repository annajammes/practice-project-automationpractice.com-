Feature: signIn
  //@sin @smoke
  Scenario: sign into account
    Given user on website cliks on sign in tab and authentication page open
    When user enter valid email address and click create acciunt
  Then user enters personal information
    And user enters address info
    And user click on Register