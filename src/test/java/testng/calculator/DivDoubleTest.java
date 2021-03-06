package testng.calculator;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivDoubleTest extends BaseTest {

    @Test(priority = 0, dataProvider = "divDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testDivDouble(double a, double b, double expected) {
        double div = calculator.div(a, b);
        Assert.assertEquals(div, expected);
    }

    @Test(priority = 1, expectedExceptions = NumberFormatException.class)
    public void divByZero() {
        calculator.div(1.0, 0.0);
    }

    @DataProvider(name = "divDataProvider")
    public Object[][] divDataProvider() {
        return new Object[][]{
                {-8.0, 4.0, -2.0},
                {-4.0, -2.5, 1.6},
                {2.6, -1.0, -2.6},
                {20.8, 2.0, 10.4},
        };
    }
}