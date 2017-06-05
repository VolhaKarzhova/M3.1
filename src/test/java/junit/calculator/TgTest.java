package junit.calculator;

import junit.common.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TgTest extends BaseTest {

    private double a;
    private double expected;

    public TgTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void cosTest() {
        double tg = round(calculator.tg(a));
        Assert.assertEquals(expected, tg, 0.0);
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        return Arrays.asList(new Object[][]{
                {30.0, 0.577},
                {0.0, 0.0},
                {45.0, 1.0},
                {60.0, 1.732}
        });
    }

    private double round(double value) {
        return (double) Math.round(value * 1000d) / 1000d;
    }
}