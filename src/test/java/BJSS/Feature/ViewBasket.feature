Feature: View Basket

  Background: Login
    Given I am on the shopping website
    And And I click on the sign in link
    When I enter the following login details
      | Email Address | mitchell.agoma@gmail.com |
      | Password      | BJSSTest                 |
    Then I am on the my account page

  Scenario: View Basket and Confirm Items
    When I click on Add to cart
    And I am on the order page
    Then the order summary contains the following
      | Number of product      | 2      |
      | Size of first product  | M      |
      | Size of second product | S      |
      | Total Price of product | $35.02 |

