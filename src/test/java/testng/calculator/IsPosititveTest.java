package testng.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IsPosititveTest extends  BaseTest {

    @Test(dataProvider = "posDataProvider")
    @Parameters({"a", "expected"})
    public void testPositive(long a, boolean expected) {
        checkTime();
        boolean pos = calculator.isPositive(a);
        Assert.assertEquals(pos, expected);
    }
    //ability to accept string numbers is shown in the last set of parameters.
    @DataProvider(name = "posDataProvider")
    public Object[][] posDataProvider () {
        return new Object[][] {
                {1, true},
                {0, false},
                {-1, false},
                {-(-2), true},
                {Long.valueOf("10"), Boolean.valueOf("true")}
        };
    }
}
