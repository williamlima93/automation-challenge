package webServiceTesting.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import webServiceTesting.util.CreateUser;

public class WebServiceTestingSteps {

  private CreateUser createUser;
  private RequestSpecification request;
  private Response response;

  @Given("^I use user creation service$")
  public void useUserCreationWebService() {
    createUser = new CreateUser();
  }

  @When("^I set name \"([^\"]*)\"$")
  public void setName(String name) {
    createUser.setName(name);
  }

  @When("^I set job \"([^\"]*)\"$")
  public void setJob(String job) {
    createUser.setJob(job);
  }

  @Then("^I validate my response is correct$")
  public void validateMyResponseIsCorrect() {
  }

  @Given("^I access the API$")
  public void iAccessTheAPI() {
    RestAssured.baseURI = "https://reqres.in/api";
    request = RestAssured.given();
    request.header("Content-Type", "application/json");
  }

  @When("^I perform a request to create the user \"([^\"]*)\" and job \"([^\"]*)\"$")
  public void iPerformARequestToCreateTheUserAndJob(String name, String job) {
    response = request.
               body("{ \"name\": \""+ name +"\" ,\"job\": \""+ job +"\" }").
               post("/users").
               then().extract().response();
  }

  @Then("^the user and the job should be created with status code <(\\d+)>$")
  public void theUserAndTheJobShouldBeCreatedWithStatusCode(int statusCode) {
    Assertions.assertEquals(statusCode, response.getStatusCode());
  }

  @When("^I perform a request to delete a user with id <(\\d+)>$")
  public void iPerformARequestToDeleteAUserWithId(int userId) {
    response = request.
               delete("/users/\""+userId+"\"").
               then().extract().response();
  }

  @Then("^the user should be deleted successfully$")
  public void theUserShouldBeDeletedSuccessfully() {
    Assertions.assertEquals(204, response.getStatusCode());
  }

  @When("^I perform a request with a new \"([^\"]*)\" without password$")
  public void iPerformARequestWithANewWithoutPassword(String email){
    response = request.
               body("{ \"email\": \""+email+"\"}").
               post("/register").
               then().extract().response();
  }

  @Then("^the status code should be <(\\d+)>$")
  public void theStatusCodeShouldBe(int statusCode) {
    Assertions.assertEquals(statusCode, response.getStatusCode());
//    System.out.println(response.getStatusCode());
//    System.out.println(response.getBody().asString());
  }
}
