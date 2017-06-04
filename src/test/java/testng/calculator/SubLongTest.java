package testng.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubLongTest extends BaseTest {

    @Test(dataProvider = "subDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testSubLong(long a, long b, long expected) {
        long sub = calculator.sub(a, b);
        Assert.assertEquals(sub, expected);
    }

    //ability to accept string numbers is shown in the last set of parameters.
    @DataProvider(name = "subDataProvider")
    public Object[][] subDataProvider () {
        return new Object[][] {
                {2, 1, 1},
                {0, 0, 0},
                {-1, -2, 1},
                {2, -1, 3},
                {1500, 2500, -1000},
                {Long.valueOf("20"), Long.valueOf("15"), Long.valueOf("5")}
        };
    }
}
