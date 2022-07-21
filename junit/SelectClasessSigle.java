package examples;


import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.platform.runner.JUnitPlatform;

    @RunWith(JUnitPlatform.class)
// With a single class
    @SelectClasses(examples.TestFixtures.class)
    public class SelectClasessSigle {}
