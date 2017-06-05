package junit.calculator;

import junit.common.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SinTest extends BaseTest {

    private double a;
    private double expected;

    public SinTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void sinTest() {
        double sin = round(calculator.sin(Math.toRadians(a)));
        Assert.assertEquals(expected, sin, 0.0);
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        return Arrays.asList(new Object[][]{
                {0.0, 0.0},
                {30.0, 0.5},
                {45.0, 0.707},
                {60.0, 0.866},
                {90.0, 1.0}
        });
    }

    private double round(double value) {
        return (double) Math.round(value * 1000d) / 1000d;
    }
}