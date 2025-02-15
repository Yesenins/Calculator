package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest extends BaseTest{

    @DataProvider(name = "sum")
    public Object[][] sumOperators() {
        return new Object[][]{
                {5.1, 7.3, 12.4},
                {1.0, 2.5, 3.5},
                {-100.0, -1.0, -101.0}
        };
    }

    @Test(dataProvider = "sum", priority = 1, description = "checking the addition of fractional numbers")
    public void sumFractionalTest(Double a, Double b, Double result){
        Assert.assertEquals(calculator.sum(a,b), result);
    }

    @Test(priority = 3, description = "checking the addition of large positive numbers")
    public void sumOfLargeFractionalPositiveNumbersTest(){
        Assert.assertEquals(calculator.sum(1000000000000.0,223134654654651.15),2.2413465465465116E14);
    }

    @Test(priority = 2, description = "checking the addition of positive and negative numbers")
    public void sumNegativeAndPositiveIntegersTest(){
        Assert.assertEquals(calculator.sum(10, -100), -90);
    }
}
