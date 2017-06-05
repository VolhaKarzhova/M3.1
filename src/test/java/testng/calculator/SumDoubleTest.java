package testng.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumDoubleTest extends BaseTest {

    @Test(dataProvider = "sumDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testSumDouble(double a, double b, double expected) {
        checkTime();
        double sum = calculator.sum(a, b);
        Assert.assertEquals(sum, expected);
    }

    @DataProvider(name = "sumDataProvider")
    public Object[][] sumDataProvider () {
        return new Object[][] {
                {1.0, 1.0, 2.0},
                {0.0, 0.0, 0.0},
                {-1.5, -1.6, -3.1},
                {2.1, -1.1, 1.0},
                {1.5555, 1.0, 2.5555},
                {2.5, 2.5, 5.0}
        };
    }
}