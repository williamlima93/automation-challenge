
@Regression
Feature: Users

  Scenario: Validate that it is possible to add a new user with a job
    Given I access the API
    When I perform a request to create the user "Toy" and job "singer"
    Then the user and the job should be created with status code <201>

