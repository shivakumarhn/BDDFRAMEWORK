package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksStepDefinition {

    //Global Hooks
   /* @Before(order=0)
    public void setUp() {
        System.out.println("Launch FF");
        System.out.println("Enter url for free crm");
    }

    @After(order=0)
    public void tearDown() {
        System.out.println("Close the browser");
    }
    @Before(order = 1)
    public void setUp1() {
        System.out.println("Launch FF");
        System.out.println("Enter url for free crm");
    }

    @After(order=1)
    public void tearDown1() {
        System.out.println("Close the browser");
    }
*/
    //    Local - only for first scenario
   /* @Before("@First")
    public void beforeFirst() {
        System.out.println("before only first scenario ");
    }

    @After("@First")
    public void afterFirst() {
        System.out.println("after only first scenario");
    }

    @Before("@Second")
    public void beforeSecond() {
        System.out.println("before only second scenario ");
    }

    @After("@Second")
    public void afterSecond() {
        System.out.println("after only second scenario");
    }


    @Before("@Third")
    public void beforeThird() {
        System.out.println("before only third scenario ");
    }

    @After("@Third")
    public void afterThird() {
        System.out.println("after only third scenario");
    }


    @Given("^This is first step$")
    public void this_is_first_step() {
        System.out.println("1st step");
    }

    @When("^This is second step$")
    public void this_is_second_step() {
        System.out.println("2nd step");
    }

    @Then("^This is third step$")
    public void this_is_third_step() {
        System.out.println("3rd step");
    }
*/

}
