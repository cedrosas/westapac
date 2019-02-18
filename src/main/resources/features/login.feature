Feature: Login

  Scenario Outline: Login
    Given I am on the Login Page
    When I fill in User Name with <username>
    And  I fill in Password with <password>
    And  I press Login
    Then  I should be on the users home page
    And  I should see "Login successful"

  Examples:
   | username | password |
   | admin    | 12345    |

