$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TC001.feature");
formatter.feature({
  "line": 3,
  "name": "Product Subscription",
  "description": "",
  "id": "product-subscription",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Validate the product price for a full special support plan for 6 months simulation",
  "description": "",
  "id": "product-subscription;validate-the-product-price-for-a-full-special-support-plan-for-6-months-simulation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I open Chrome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I select type \"Special\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I select support plan \"Full\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I choose a duration of \"6\" months",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click in calculate price button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the price should be \"2249.10\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BrowserTestingSteps.openChromeAndLaunchApplication()"
});
formatter.result({
  "duration": 242175900,
  "error_message": "java.lang.NullPointerException\r\n\tat browserTesting.pages.ProductSubscriptionPage.\u003cinit\u003e(ProductSubscriptionPage.java:17)\r\n\tat browserTesting.steps.BrowserTestingSteps.openChromeAndLaunchApplication(BrowserTestingSteps.java:17)\r\n\tat ✽.Given I open Chrome and launch the application(TC001.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Special",
      "offset": 15
    }
  ],
  "location": "BrowserTestingSteps.selectType(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Full",
      "offset": 23
    }
  ],
  "location": "BrowserTestingSteps.selectSupportPlan(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 24
    }
  ],
  "location": "BrowserTestingSteps.writeMonthlyDuration(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BrowserTestingSteps.clickCalculatePriceButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2249.10",
      "offset": 21
    }
  ],
  "location": "BrowserTestingSteps.validatePrice(String)"
});
formatter.result({
  "status": "skipped"
});
});