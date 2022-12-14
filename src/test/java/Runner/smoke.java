package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/Features/home.feature",
        glue = "Steps",
        dryRun =false,
        monochrome = true,
        tags = "@t",
        plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json"}
)
public class smoke {
}
