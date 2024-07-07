Feature: Login functionality testing on pixabay website

  @smoke
  Scenario: User is able to successfully login on pixabay website
    Given User launched the pixabay website
    When User entered correct credential
    Then User is able to login to pixabay website

  Scenario: User is able to successfully logout on pixabay website
    Given User is loged in pixabay website
    When User clicked on logout button on home page
    Then User is successfully logout of the pixabay website

  @smoke
  Scenario: I want to place order on amazon webiste
    Given User launched amazon website
    When User select item to buy
    And User added the item in cart
    And User placed the order
    Then User will be able to see arrival date on place order page
    But user is also eligible to place duplicate order