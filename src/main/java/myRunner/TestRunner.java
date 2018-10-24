package myRunner;


import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\hns\\IdeaProjects\\FreeCrmBddFramework\\src\\main\\java\\com\\qa\\features\\freecrm.feature",  //Path of the feature files
        glue = "step_definitions",   //Path of stepDefinition files
        format = {"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //To generate different types of output
        monochrome = true, //Display the console output in a readable format
        strict = true, //It will check if any step is not defined in step definition file
        dryRun = false  //To check mapping is proper between feature file and step def file
//        tags = {"~@SmokeTest" , "~@RegressionTest","~@End2End"}
)
public class TestRunner {

}
//ORed : tags = {"@SmokeTest , @RegressionTest"} -->Executes all tests tagged as @SmokeTest OR @RegressionTest
//ANDed : tags = {"@SmokeTest" , "@RegressionTest"} -->Executes all tests tagged as  @SmokeTest AND @RegressionTest
// ~ : tags = {"~@SmokeTest" , "~@RegressionTest"} -->Executes all tests by ignoring @SmokeTest AND @RegressionTest