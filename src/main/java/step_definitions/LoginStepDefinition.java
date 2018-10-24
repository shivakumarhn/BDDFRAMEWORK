package step_definitions;

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

public class LoginStepDefinition {
    WebDriver driver;

//    @Given("^User is already on login page$")
//    public void user_already_on_login_page() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hns\\Downloads\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://www.freecrm.com");
//    }
//
//    @When("^Title of login page is Free CRM$")
//    public void Title_of_login_page_Free_CRM() {
//        String title = driver.getTitle();
//        System.out.println(title);
//        Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
//    }

    // Reg Exp:
    //    1.\"([^\"]*)\"
    //   2. \"(.*)\"
    @Then("^User enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_UserName_and_Password(String userName, String password) {
        driver.findElement(By.name("username")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(password);
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

    @Then("^user moves to new contact page$")
    public void user_moves_to_new_contact_page() {
        driver.switchTo().frame("mainpanel");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
        driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
    }


    @Then("^User enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
    public void user_enters_contact_details(String firstname, String lastname, String postion) {
        driver.findElement(By.id("firdt_name")).sendKeys(firstname);
        driver.findElement(By.id("surname")).sendKeys(lastname);
        driver.findElement(By.id("company/_position")).sendKeys(postion);
        driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
    }


//    @Then("^Close the browser$")
//    public void Close_the_browser() {
//        driver.quit();
//    }
}
