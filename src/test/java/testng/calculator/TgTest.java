package testng.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TgTest extends BaseTest {

    @Test(dataProvider = "tgDataProvider")
    @Parameters({"a", "expected"})
    public void testTg(double a, double expected) {
        double tg = round(calculator.tg(a));
        Assert.assertEquals(tg, expected);
    }

    @DataProvider(name = "tgDataProvider")
    public Object[][] tgDataProvider() {
        return new Object[][]{
                {30.0, 0.577},
                {0.0, 0.0},
                {45.0, 1.0},
                {60.0, 1.732}
        };
    }

    @Test(groups = "infinity", expectedExceptions = NumberFormatException.class, alwaysRun = true)
    public void tg90() {
        calculator.tg(90.0);
    }

    private double round(double value) {
        return (double) Math.round(value * 1000d) / 1000d;
    }
}