package junit.calculator;

import junit.common.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MultLongTest extends BaseTest {

    private long a;
    private long b;
    private long expected;

    public MultLongTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void multLong() {
        Assert.assertEquals(expected, calculator.mult(a, b));
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        return Arrays.asList(new Object[][]{
                {-1, 0, 0},
                {0, 0, 0},
                {-1, -2, 2},
                {2, -1, -2},
                {1500, 2, 3000},
        });
    }
}