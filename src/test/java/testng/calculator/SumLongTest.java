package testng.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumLongTest extends BaseTest {

    @Test(dataProvider = "sumDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testSum(long a, long b, long expected) {
        checkTime();
        long sum = calculator.sum(a, b);
        Assert.assertEquals(sum, expected);
    }

    @DataProvider(name = "sumDataProvider")
    public Object[][] sumDataProvider() {
        return new Object[][]{
                {1, 1, 2},
                {0, 0, 0},
                {-1, -1, -2},
                {2, -1, 1},
                {5000, 5000, 10000},
                {-5, 2, -3},
        };
    }
}