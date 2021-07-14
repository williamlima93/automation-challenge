package browserTesting.steps;


import browserTesting.factory.DriverFactory;
import browserTesting.pages.ProductSubscriptionPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BrowserTestingSteps extends DriverFactory {

    ProductSubscriptionPage productSubscriptionPage;

    public BrowserTestingSteps() {
        this.productSubscriptionPage = new ProductSubscriptionPage(driver);
    }

    @Given("^I open Chrome and launch the application$")
    public void openChromeAndLaunchApplication() {
        productSubscriptionPage.launchApplication();
    }

    @When("^I select type \"(.*)\"$")
    public void selectType(String type) {
        productSubscriptionPage.selectDropDownType(type);
    }

    @When("^I select support plan \"(.*)\"$")
    public void selectSupportPlan(String plan) {
        productSubscriptionPage.selectDropDownSupportPlan(plan);
    }

    @When("^I choose a duration of \"(.*)\" months$")
    public void writeMonthlyDuration (String duration)
    {
        productSubscriptionPage.setTextFieldMonthlyDuration(duration);
    }

    @When("^I click in calculate price button")
    public void clickCalculatePriceButton()
    {
        productSubscriptionPage.clickButtonCalculate();
    }

    @Then("^the price should be \"(.*)\"$")
    public void	validatePrice(String price) {
        productSubscriptionPage.getInfoPrice(price);
        Assert.assertEquals(price, productSubscriptionPage.getInfoPrice(price));
    }


/*
    @Then("^I attach file \"(.*)\"$")
    public void	attachFile(String file) throws  {
        WebElement uploadElement = driver.findElement(By.id("attachment"));
        uploadElement.sendKeys(file);
    }
*/
}
