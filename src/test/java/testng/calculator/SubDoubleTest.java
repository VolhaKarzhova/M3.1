package testng.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubDoubleTest extends BaseTest {

    @Test(dataProvider = "subDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testSubDouble(double a, double b, double expected) {
        double sub = calculator.sub(a, b);
        Assert.assertEquals(sub, expected);
    }

    @DataProvider(name = "subDataProvider")
    public Object[][] subDataProvider() {
        return new Object[][]{
                {2.0, 1.0, 1.0},
                {0.0, 0.0, 0.0},
                {-1.1, -1.1, 0.0},
                {2.1, -1.1, 3.2},
                {1.5555, 1.0, 0.5555},
                {20.0, 1.5, 18.5}
        };
    }
}