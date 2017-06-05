package testng.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SqrtTest extends BaseTest {

    @Test(dataProvider = "sqrtDataProvider")
    @Parameters({"a", "expected"})
    public void testSqrtDouble(double a, double expected) {
        double sqrt = calculator.sqrt(a);
        Assert.assertEquals(sqrt, expected);
    }

    @DataProvider(name = "sqrtDataProvider")
    public Object[][] sqrtDataProvider() {
        return new Object[][]{
                {4.0, 2.0},
                {1.21, 1.1},
                {0.0, 0.0},
                {156.25, 12.5}
        };
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void negativeArg() {
        calculator.sqrt(-4.0);
    }
}