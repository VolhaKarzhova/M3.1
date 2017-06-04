package testng.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CtgTest extends BaseTest {

    @Test(dataProvider = "ctgDataProvider")
    @Parameters({"a", "expected"})
    public void testCtg(double a, double expected) {
        double ctg = round(calculator.ctg(a));
        Assert.assertEquals(ctg, expected);
    }

    //ability to accept string numbers is shown in the last set of parameters.
    @DataProvider(name = "ctgDataProvider")
    public Object[][] ctgDataProvider () {
        return new Object[][] {
                {30.0,1.732},
                {45.0, 1.0},
                {60.0, 0.577},
                {Double.valueOf("90.0"), Double.valueOf("0.0")}
        };
    }

    //Cotangens of 0 can't be counted though double 0.0 is not actually zero , anyway there should be an exception
    @Test(groups = "infinity", expectedExceptions = NumberFormatException.class)
    public void ctg0 () {
        calculator.ctg(0.0);
    }

    private double round (double value) {
        return (double) Math.round(value*1000d)/1000d;
    }
}
