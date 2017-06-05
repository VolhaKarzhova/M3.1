package junit.calculator;

import junit.common.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SqrtTest extends BaseTest {

    private double a;
    private double expected;

    public SqrtTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void sqrtTest() {
        Assert.assertEquals(expected, calculator.sqrt(a), 0.0);
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        return Arrays.asList(new Object[][]{
                {4.0, 2.0},
                {1.21, 1.1},
                {0.0, 0.0},
                {156.25, 12.5}
        });
    }
}