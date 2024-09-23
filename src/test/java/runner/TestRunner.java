package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        // Plugins de salida
        plugin = {
                "pretty"
        },

        features = "src/test/resources/features",
        glue = "steps"
// monochrome = true // Descomenta para salida sin colores

)
public class TestRunner {
}