
@Regression
Feature: Product Subscription

  Scenario: Validate the product price for a full special support plan for 6 months simulation
    Given I open Chrome and launch the application
    When I select type "Special"
    And I select support plan "Full"
    And I choose a duration of "6" months
    And I click in calculate price button
    Then the price should be "2249.10"
