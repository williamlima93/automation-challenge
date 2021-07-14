
@Regression
Feature: Users

  Scenario: Validate that it is possible to delete a user
    Given I access the API
    When I perform a request to delete a user with id <2>
    Then the user should be deleted successfully