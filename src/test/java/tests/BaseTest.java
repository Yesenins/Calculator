package tests;

import calculator.java.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class BaseTest {
    Calculator calculator;

    @BeforeMethod
    public void initTest(){
        calculator = new Calculator();
    }

    @AfterMethod
    public void endTest(){
        System.out.println("End test");
    }
}
