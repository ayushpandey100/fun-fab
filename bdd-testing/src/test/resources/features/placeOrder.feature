Feature: Create Account Feature for Amazon
  This is create account feature for Amazon Web UI to validate the new account creation functionalities

#  Background: Amazon Web UI is launched successfully
#    Given User navigates to AmazonWeb UI
#    Then User should see below title:
#    """
#    Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in
#    """

#  Scenario: Validate that a new user is able to create an account
#    Given User navigates to AmazonWeb UI
#    When User performs click on Sign In link on Home Page
#    And User clicks on Create Account Button on Sign In Page
#    Then User navigates to Create Account Page
#    When User enters "Ayush" as your Name
#    And User enters "7652058920" as Mobile Number
#    And User enters "abc@1234" as a password
#    And User clicks on Continue button

@smoke
  Scenario: Validate search functionality for multiple search keywords
    Given User navigates to AmazonWeb UI
    When User performs keyword search on Home Page with multiple parameters as below:
      | Mobile |
      | Apple  |
      | Flower |
#
#  Scenario: Validate cucumber is best BDD framework
#    Given User launch the swiggy app
#    When User added the food item to the cart
#    And User checkout after successful payment
#    Then User should be able to see the order status


#  Scenario: Validate that a new user is able to create an account for datatable
#    Given User navigates to AmazonWeb UI
#    When User performs click on Sign In link on Home Page
#    And User clicks on Create Account Button on Sign In Page
#    Then User navigates to Create Account Page
#    When User enters correct account information as below
#      | Name  | Mobile     | Password |
#      | Ayush | 9519176303 | ayus@123 |
#      | Ria   | 9519176606 | ria@123  |
#    And User clicks on Continue button


#  Scenario Outline: Validate that a new user is able to create an account
#    Given User navigates to AmazonWeb UI
#    When User performs click on Sign In link on Home Page
#    And User clicks on Create Account Button on Sign In Page
#    Then User navigates to Create Account Page
#    When User enters "<Name>" as your Name
#    And User enters "<Mobile>" as Mobile Number
#    And User enters "<Password>" as a password
#    And User clicks on Continue button
#  Examples:
#    | Name  | Mobile     | Password  |
#    | Ayush | 7645892123 | wer#asd   |
#    | ravi  | 7645457223 | qwert@123 |