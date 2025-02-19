package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplyTest extends BaseTest{

    @DataProvider(name = "multiply")
    public Object[][] multiplyOperators() {
        return new Object[][]{
                {5.2, 7.3, 37.96},
                {10.5, -100.3, -1053.15}
        };
    }
    @Test(dataProvider = "multiply", priority = 1, description = "checking the multiplication of fractional numbers")
    public void multiplicationFractionalTest(Double a, Double b, Double result){
        Assert.assertEquals(calculator.multiply(a, b), result);
    }

    @Test(priority = 2, description = "checking the multiplication of integers")
    public void multiplicationIntegersTest(){
        Assert.assertEquals(calculator.multiply(10,5), 50);
    }

    @Test(priority = 4, description = "checking multiplication by zero")
    public void multiplicationByZeroTest(){
        Assert.assertEquals(calculator.multiply(0,5), 0);
    }

    @Test(priority = 3, description = "checking the multiplication of negative numbers")
    public void multiplyingNegativeNumbersTest(){
        Assert.assertEquals(calculator.multiply(-100.0, -2.0), 200.0);
        Assert.assertEquals(calculator.multiply(-100.0, 3.0), -300.0);
    }
}
