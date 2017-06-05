package testng.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CosTest extends BaseTest {

    @Test(groups = "cos", dataProvider = "cosDataProvider")
    @Parameters({"a", "expected"})
    public void testCos(double a, double expected) {
        double cos = round(calculator.cos(Math.toRadians(a)));
        Assert.assertEquals(cos, expected);
    }

    @DataProvider(name = "cosDataProvider")
    public Object[][] cosDataProvider() {
        return new Object[][]{
                {0.0, 1.0},
                {30.0, 0.866},
                {45.0, 0.707},
                {60.0, 0.5},
                {90.0, 0.0}
        };
    }

    private double round(double value) {
        return (double) Math.round(value * 1000d) / 1000d;
    }
}