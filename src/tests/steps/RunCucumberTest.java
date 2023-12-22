import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/tests/features", // Chemin vers le répertoire contenant les .feature
        glue = "steps",                            // Chemin vers le package contenant les Step Definitions
        plugin = {"pretty", "html:target/cucumber-reports"} // Report HTML généré dans le répertoire target/cucumber-reports
)
public class RunCucumberTest {
    // Pas besoin de code
}