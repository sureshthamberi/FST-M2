package examples;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.platform.runner.JUnitPlatform;

    @RunWith(JUnitPlatform.class)
// With multiple packages
    //@SelectPackages({"SmokeTests", "CalculatorTests"})
    @SelectPackages({"examples", "activities"})
    public class SelectMultiplePackages {}

