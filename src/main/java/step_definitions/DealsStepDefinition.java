package step_definitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

// data table with Lists for parameterization of test cases

public class DealsStepDefinition {

    WebDriver driver;


//    @Given("^User is already on login page$")
//    public void user_already_on_login_page() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hns\\Downloads\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://www.freecrm.com");
//    }

//    @When("^Title of login page is Free CRM$")
//    public void Title_of_login_page_Free_CRM() {
//        String title = driver.getTitle();
//        System.out.println(title);
//        Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
//    }


    @Then("^User enters username and password$")
    public void user_enters_username_and_password(DataTable credentials) {
        List<List<String>> data = credentials.raw();
        driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
        driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
    }

//    @Then("^User clicks on login button$")
//    public void user_clicks_on_login_button() {
//        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", loginBtn);
//    }
//
//    @Then("^User is on home page$")
//    public void user_is_on_home_page() {
//        String title = driver.getTitle();
//        System.out.println("Home page title ::" + title);
//        Assert.assertEquals("CRMPRO", title);
//    }

//    @Then("^user moves to new deal page$")
//    public void user_moves_to_new_deal_page() {
//        driver.switchTo().frame("mainpanel");
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//        driver.findElement(By.xpath("//a[contains(text(),'New Deals')]")).click();
//    }

    @Then("^User enters deal details$")
    public void user_enters_deal_details(DataTable dealsData) {
        List<List<String>> dealValues = dealsData.raw();
        driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
        driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
        driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
        driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
        driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
    }

//    @Then("^Close the browser$")
//    public void Close_the_browser() {
//        driver.quit();
//    }


}