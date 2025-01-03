package RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src\\test\\resources\\Login.feature", 
		glue = "steps",
		plugin= {"pretty", "html:target/result.html"},
		dryRun = true
		//monochrome=true
	//	snippets = SnippetType.CAMELCASE
	)

public class Runner {
	

}
