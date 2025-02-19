package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractTest extends BaseTest{

    @DataProvider(name = "subtract")
    public Object[][] subtractOperators() {
        return new Object[][]{
                {1.0, 2.5, -1.5},
                {1000000000000.0, 223134654654651.15, -2.2213465465465116E14},
                {10.3, -125.4, 135.7}
        };
    }
    @Test(dataProvider = "subtract", priority = 3, description = "checking the subtraction of fractional numbers")
    public void SubtractTest(Double a, Double b, Double result){
        Assert.assertEquals(calculator.subtract(a, b), result);
    }

    @Test(priority = 1, description = "checking the subtraction of positive integers")
    public void SubtractOfPositiveIntegersTest(){
        Assert.assertEquals(calculator.subtract(5,7), -2);
    }

    @Test(priority = 2, description = "checking the subtraction of negative integers")
    public void SubtractOfNegativeIntegersTest(){
        Assert.assertEquals(calculator.subtract(-100,-1), -99);
    }
}
