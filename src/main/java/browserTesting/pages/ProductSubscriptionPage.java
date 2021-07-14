package browserTesting.pages;

import browserTesting.factory.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductSubscriptionPage extends PageObject {

    public ProductSubscriptionPage(WebDriver driver) {
        super(driver);
        launchApplication();
    }

    private static String PAGE_URL = "https://qa-automation-challenge.github.io/sandbox/";

    @FindBy(id = "type")
    private WebElement dropDownType;

    @FindBy(id = "support")
    private WebElement dropDownSupportPlan;

    @FindBy(id = "duration")
    private WebElement textFieldMonthlyDuration;

    @FindBy (id = "calculate")
    private WebElement buttonCalculate;

    @FindBy(id = "price")
    private WebElement infoPrice;

    public void launchApplication() {
        driver.get(PAGE_URL);
    }

    public void selectDropDownType(String type) {
        Select select = new Select(dropDownType);
        select.selectByVisibleText(type);
    }

    public void selectDropDownSupportPlan(String plan) {
        Select select = new Select(dropDownSupportPlan);
        select.selectByVisibleText(plan);
    }

    public void setTextFieldMonthlyDuration(String duration) {
        textFieldMonthlyDuration.sendKeys(duration);
    }

    public void clickButtonCalculate() {
        buttonCalculate.click();
    }

    public String getInfoPrice(String price) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) infoPrice));

        return infoPrice.getText();
    }



}
