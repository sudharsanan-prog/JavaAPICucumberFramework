package cucumber.Options;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class HtmlReportGenerator {
    public static void generateReport() {
        File reportOutputDirectory = new File("target/cucumber-html-reports");

        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/jsonReports/cucumber-report.json");

        String projectName = "Automation Results";

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        configuration.setBuildNumber("1");
        configuration.addClassifications("Platform", "Windows 11");
        configuration.addClassifications("Browser", "Chrome");
        configuration.addClassifications("Branch", "release/1.0");

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
}