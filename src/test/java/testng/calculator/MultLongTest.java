package testng.calculator;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultLongTest extends BaseTest {
    @Test(dataProvider = "multDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testMultLong(long a, long b, long expected) {
        long mult = calculator.mult(a, b);
        Assert.assertEquals(mult, expected);
    }

    @DataProvider(name = "multDataProvider")
    public Object[][] multDataProvider() {
        return new Object[][]{
                {-1, 0, 0},
                {0, 0, 0},
                {-1, -2, 2},
                {2, -1, -2},
                {1500, 2, 3000}
        };
    }
}