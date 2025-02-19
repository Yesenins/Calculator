package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

public class DivideTest extends BaseTest {

    @Test(priority = 1, description = "checking the division of positive numbers")
    public void divisionOfPositiveNumbersTest(){
        Assert.assertEquals(calculator.divide(12.0, 3.0), 4.0);
    }

    @DataProvider(name = "divide")
    public Object[][] divideOperators() {
        return new Object[][]{
                {-99.0, -2.4, 41.25},
                {-102.0, 3.2, -31.875}
        };
    }
    @Test(dataProvider = "divide", priority = 3, description = "checking the division of negative numbers")
    public void divisionOfNegativeNumbersTest(Double a, Double b, Double result) {
        Assert.assertEquals(calculator.divide(a, b), result);
    }

    @Test(retryAnalyzer = Retry.class, priority = 3, description = "checking the division of numbers by zero")
    public void divideByZeroTest() {
        assertTrue("Divide by zero gives infinity as result", Double.isInfinite(calculator.divide(3.0, 0.0)));
    }

    @Test(priority = 4, description = "checking the division of zero by numbers")
    public void divideZeroByNumbersTest() {
        Assert.assertEquals((calculator.divide(0.0, 12.0)), 0.0);
    }
}
