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
    //ability to accept string numbers is shown in the last set of parameters.
    @DataProvider(name = "negDataProvider")
    public Object[][] negDataProvider () {
        return new Object[][] {
                {-1, true},
                {0, false},
                {1, false},
                {-(-2), false},
                {Long.valueOf("10"), Boolean.valueOf("false")}
        };
    }
}
