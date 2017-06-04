package testng.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultDoubleTest extends BaseTest {

    @Test(dataProvider = "multDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testMultDouble(double a, double b, double expected) {
        double mult = calculator.mult(a, b);
        Assert.assertEquals(mult, expected);
    }

    //ability to accept string numbers is shown in the last set of parameters.
    @DataProvider(name = "multDataProvider")
    public Object[][] multDataProvider () {
        return new Object[][] {
                {2.0, 1.0, 2.0},
                {0.0, 0.0, 0.0},
                {-1.1, -1.1, 1.21},
                {2.1, -1.1, -2.31},
                {1.555, 1.0, 1.555},
                {Double.valueOf("20.0"), Double.valueOf("1.5"), Double.valueOf("30.0")}
        };
    }
}
