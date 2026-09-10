package cucumber.Options;

// Import JUnit's AfterClass instead of TestNG
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        plugin = {"pretty", "json:target/jsonReports/cucumber-report.json"},
        glue = {"stepDefinition"},
        tags = "@DeletePlace"
)
public class TestRunner {

    @AfterClass
    public static void writeExtentReport() {
        // Call the method to generate the HTML report
        HtmlReportGenerator.generateReport();
    }
}