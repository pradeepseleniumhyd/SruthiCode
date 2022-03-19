package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\LENOVO\\Documents\\code\\ToolsQA\\src\\test\\java\\features\\FBLoginParameters3.feature",
		glue= {"stepDefinitions"},
		dryRun = false,
		monochrome = true,
		publish=true,
		plugin={"pretty","html:target/sruthi/Toolsqa.html","junit:target/sruthi/toolsQa.json","junit:target/sruthi/toolsqa.xml"}
		//tags="~@Sruthi or @Pradeep"
		//tags	= "@E2E"
		)
public class LoginRunner {

}
