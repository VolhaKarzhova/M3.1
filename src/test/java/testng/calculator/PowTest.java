package testng.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PowTest extends BaseTest {

    @Test(dataProvider = "powDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testPowDouble(double a, double b, double expected) {
        double pow = calculator.pow(a, b);
        Assert.assertEquals(pow, expected);
    }

    //ability to accept string numbers is shown in the last set of parameters.
    @DataProvider(name = "powDataProvider")
    public Object[][] powDataProvider () {
        return new Object[][] {
                {2.0, 1.0, 2.0},
                {25.0, 0.0, 1.0},
                {2.0, -1.0, 0.5},
                {-2.0, 2.0, 4.0},
                {-2.2, 2.0, 4.84},//Test fails because of the specific features of the double type
                {Double.valueOf("81.0"), Double.valueOf("0.25"), Double.valueOf("3.0")}
        };
    }

}
