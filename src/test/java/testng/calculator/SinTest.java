package testng.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SinTest extends BaseTest {

    @Test(groups = "sin", dataProvider = "sinDataProvider")
    @Parameters({"a", "expected"})
    public void testSin(double a, double expected) {
        double sin = round(calculator.sin(Math.toRadians(a)));
        Assert.assertEquals(sin, expected);
    }

    //ability to accept string numbers is shown in the last set of parameters.
    @DataProvider(name = "sinDataProvider")
    public Object[][] sinDataProvider () {
        return new Object[][] {
                {0.0, 0.0},
                {30.0,0.5},
                {45.0, 0.707},
                {60.0, 0.866},
                {Double.valueOf("90.0"), Double.valueOf("1.0")}
        };
    }

    private double round (double value) {
        return (double) Math.round(value*1000d)/1000d;
    }
}
