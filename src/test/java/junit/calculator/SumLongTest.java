package junit.calculator;

import junit.common.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class SumLongTest extends BaseTest {

    private long a;
    private long b;
    private long expected;

    public SumLongTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void sumLong() {
        Assert.assertEquals(expected, calculator.sum(a, b));
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {0, -5, -5},
                {-1, -1, -2},
                {-10, 15, 5},
                {500, 200, 700}
        });
    }
}