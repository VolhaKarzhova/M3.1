package junit.mainFunctions;


import junit.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PowTest extends BaseTest {

    private double a;
    private double b;
    private double expected;

    public PowTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void powTest () {
        Assert.assertEquals(expected, calculator.pow(a, b), 0.0);
    }

    @Parameterized.Parameters
    public static Collection getParameters () {
        return Arrays.asList(new Object[][]{
                {2.0, 1.0, 2.0},
                {25.0, 0.0, 1.0},
                {2.0, -1.0, 0.5},
                {-2.0, 2.0, 4.0},
                {-2.2, 2.0, 4.84},//Test fails because of the specific features of the double type
                {Double.valueOf("81.0"), Double.valueOf("0.25"), Double.valueOf("3.0")}
        });
    }
}
