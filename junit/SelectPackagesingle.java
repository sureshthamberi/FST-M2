package examples;

import org.junit.jupiter.api.Test;
//import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(JUnitPlatform.class)
// With single package name
    @SelectPackages("examples")
    public class SelectPackagesingle  { }

