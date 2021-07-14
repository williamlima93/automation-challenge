package webServiceTesting.util;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class CreateUser {

  private String name;
  private String surname;
  private String job;
  private final RequestSpecification requestSpecification;

  public CreateUser() {
    this.requestSpecification = RestAssured.given()
        .baseUri("https://reqres.in/api")
        .basePath("/users");
  }

  public RequestSpecification getRequestSpecification() {
    return requestSpecification;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setJob(String job) { this.job = job; }

  public void setSurname(String surname) { this.surname = surname; }

  public String buildBody() {
    String body = "{\n" +
            "    \"name\": \""+ this.name +"\",\n" +
            "    \"job\": \""+ this.job +"\"\n" +
            "}";
    return body;
  }

  public String buildBodyWithSurname() {
    String bodyWithSurname = "{\n " +
            "   \"name\": \""+ this.name + " " + this.surname + "\",\n " +
            "   \"job\": \""+ this.job + "\"\n" +
            "}";
    return bodyWithSurname;
  }
}
