
@Regression
Feature: Users

  Scenario Outline: Validate that is not possible to submit a register without password
    Given I access the API
    When I perform a request with a new "<email>" without password
    Then the status code should be <400>

    Examples:
    | email                    |
    | challenge@automation.com |