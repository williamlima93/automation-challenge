# Challenge

## Requirements

* Maven
* Java (JDK 8)
* Git

## Browser and Web Services Testing

The objective of this challenge is to implement Cucumber steps to develop automatic
functional tests on both browser and a web service.  
It is also expected that the candidate is able to understand unit testing and develop some
JAVA methods.  
First, perform some exploratory tests in the following
portal: https://qa-automation-challenge.github.io/sandbox/. If there is any defect, make a
document to report it.

#### Instructions:

* Look at the unit tests and develop the necessary code to run them with success.
* Develop four automated tests according to the description in the acceptanceCriteria
  directory
    * The tests have to be in .feature files described in Gherkin language
    * A report must be generated after test execution
* Describe how you executed the automated tests in your local machine
* Feel free to change, remove or add new Cucumber steps according to the best coding
  practices

**Note: The solution should be shared in your own Git repository. Make sure that you keep
the Git commit history clean**

#### Test execution:

To execute the tests, run the command

**mvn test -Dcucumber.filter.tags="@Regression"**