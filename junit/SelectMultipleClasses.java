package examples;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.platform.runner.JUnitPlatform;

    @RunWith(JUnitPlatform.class)
    @SelectClasses({
            examples.TestFixtures.class,
            examples.AssertValues.class,
            examples.GroupAssertion.class
    })
    public class SelectMultipleClasses {}
