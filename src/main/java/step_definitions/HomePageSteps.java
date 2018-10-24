package step_definitions;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class HomePageSteps extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    @Given("^User opens browser$")
    public void user_opens_browser() {
        TestBase.initialization();
    }

    @Then("^User is on login page$")
    public void user_is_on_login_page() {
        loginPage = new LoginPage();
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(prop.getProperty("loginPageTitle"), title);
    }

    @Then("^User logs into app$")
    public void user_enters_credentials_username_and_password() {
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Then("^Validate the home page title$")
    public void validate_the_home_page_title() {
        String title = homePage.verifyHomePageTitle();
        Assert.assertEquals(prop.getProperty("homePageTitle"), title);
    }

}
