package testng.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivLongTest extends BaseTest {

    @Test(dataProvider = "divDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testDivLong(long a, long b, long expected) {
        long div = calculator.div(a, b);
        Assert.assertEquals(div, expected);
    }

    @Test (expectedExceptions = NumberFormatException.class)
    public void divByZero() {
        long div = calculator.div(1, 0);
    }

    //ability to accept string numbers is shown in the last set of parameters.
    @DataProvider(name = "divDataProvider")
    public Object[][] divDataProvider () {
        return new Object[][] {
                {-8, 4, -2},
                {-4, -2, 2},
                {2, -1, -2},
                {2000, 1000, 2},
                {Long.valueOf("20"), Long.valueOf("2"), Long.valueOf("10")}
        };
    }
}

