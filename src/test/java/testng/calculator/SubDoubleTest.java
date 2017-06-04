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

    //ability to accept string numbers is shown in the last set of parameters.
    @DataProvider(name = "subDataProvider")
    public Object[][] subDataProvider () {
        return new Object[][] {
                {2.0, 1.0, 1.0},
                {0.0, 0.0, 0.0},
                {-1.1, -1.1, 0.0},
                {2.1, -1.1, 3.2},
                {1.5555, 1.0, 0.5555}, //Test is failed with these parameters because of the specific features of the double type
                {Double.valueOf("20.0"), Double.valueOf("1.5"), Double.valueOf("18.5")}
        };
    }
}
