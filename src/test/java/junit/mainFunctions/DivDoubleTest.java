package junit.mainFunctions;

import junit.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DivDoubleTest extends BaseTest {

    private double a;
    private double b;
    private double expected;

    public DivDoubleTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void divDouble () {
        Assert.assertEquals(expected, calculator.div(a, b), 0.0);
    }

    @Parameterized.Parameters
    public static Collection getParameters () {
        return Arrays.asList(new Object[][]{
                {-8.0, 4.0, -2.0},
                {-4.0, -2.5, 1.6},
                {2.6, -1.0, -2.6},
                {20.8, 2.0, 10.4},
                {Double.valueOf("20.0"), Double.valueOf("2.0"), Double.valueOf("10.0")}
        });
    }
}
