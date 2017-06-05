package testng.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IsNegativeTest extends BaseTest {

    @Test(dataProvider = "negDataProvider")
    @Parameters({"a", "expected"})
    public void testNegative(long a, boolean expected) {
        boolean pos = calculator.isNegative(a);
        Assert.assertEquals(pos, expected);
    }

    @DataProvider(name = "negDataProvider")
    public Object[][] negDataProvider() {
        return new Object[][]{
                {-1, true},
                {0, false},
                {1, false},
                {500, false},
                {-500, true}
        };
    }
}