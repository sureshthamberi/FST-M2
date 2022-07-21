package examples;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;

public class AssertValues {
    @Test()
    public void evaluates(){

        // accessing assert without Static Assert import
        Assert.assertEquals(2,4);

        //Directly Accessing Assert method by static class Importing
        assertNotEquals(2,2);

    }

}
