package junit.calculator;

import junit.common.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MultDoubleTest extends BaseTest {

    private double a;
    private double b;
    private double expected;

    public MultDoubleTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void multDouble() {
        Assert.assertEquals(expected, calculator.mult(a, b), 0.0);
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        return Arrays.asList(new Object[][]{
                {2.0, 1.0, 2.0},
                {0.0, 0.0, 0.0},
                {-1.1, -1.1, 1.21},
                {2.1, -1.1, -2.31},
                {1.555, 1.0, 1.555},
                {20.0, 1.5, 0.0}
        });
    }
}