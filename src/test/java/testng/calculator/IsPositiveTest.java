package testng.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IsPositiveTest extends BaseTest {

    @Test(dataProvider = "posDataProvider")
    @Parameters({"a", "expected"})
    public void testPositive(long a, boolean expected) {
        checkTime();
        boolean pos = calculator.isPositive(a);
        Assert.assertEquals(pos, expected);
    }

    @DataProvider(name = "posDataProvider")
    public Object[][] positiveDataProvider() {
        return new Object[][]{
                {1, true},
                {0, false},
                {-1, false},
                {-500, false},
                {500, true}
        };
    }
}