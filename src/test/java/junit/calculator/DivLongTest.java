package junit.calculator;

import junit.common.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DivLongTest extends BaseTest {

    private long a;
    private long b;
    private long expected;

    public DivLongTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void divLong() {
        Assert.assertEquals(expected, calculator.div(a, b));
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        return Arrays.asList(new Object[][]{
                {-8, 4, -2},
                {-4, -2, 2},
                {2, -1, -2},
                {2000, 1000, 2},
        });
    }
}