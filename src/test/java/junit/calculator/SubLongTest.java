package junit.calculator;

import junit.common.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SubLongTest extends BaseTest {

    private long a;
    private long b;
    private long expected;

    public SubLongTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void subLong() {
        Assert.assertEquals(expected, calculator.sub(a, b));
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        return Arrays.asList(new Object[][]{
                {2, 1, 1},
                {0, 0, 0},
                {-1, -2, 1},
                {2, -1, 3},
                {1500, 2500, -1000},
        });
    }
}