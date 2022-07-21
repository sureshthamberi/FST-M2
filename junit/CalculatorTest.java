package examples;

import org.junit.Assert;

import org.junit.jupiter.api.*;



public class CalculatorTest {
        static Calculator calc;

        @BeforeAll
        static public void setUp(){
            calc=new Calculator();
        }
        @BeforeEach
        public void printing(){
            //system.out.println("reapeting step");

        }
        //@Test
        @RepeatedTest(2)
        //@DisplayName("Addition testing")
        public void additionTest(){
            //Call add method
            int result= calc.add(5,10);
            //Assertion
            Assert.assertEquals(15,result);
        }
        @Test
        @Disabled
        public void multiplicationTest(){
            //Call mul method
            int result = calc.multiply(5,2);
            //Assertion
            //Assert.assertEquals(10,result);  //Junit 4- normal but both works fine but use jupitor is available
            Assertions.assertEquals(10,result,"the number is 10");      //Junit5-Jupitor
        }

    }

