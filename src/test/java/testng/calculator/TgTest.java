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

    //ability to accept string numbers is shown in the last set of parameters.
    @DataProvider(name = "tgDataProvider")
    public Object[][] tgDataProvider () {
        return new Object[][] {
                {30.0, 0.577},
                {0.0, 0.0},
                {45.0, 1.0},
                {Double.valueOf("60.0"), Double.valueOf("1.732")}
        };
    }

    //Tangens of the 90 can't be counted as sin0=0
    @Test(groups = "infinity", expectedExceptions = NumberFormatException.class)
    public void tg90 () {
        calculator.tg(90.0);
    }

    private double round (double value) {
        return (double) Math.round(value*1000d)/1000d;
    }

}
