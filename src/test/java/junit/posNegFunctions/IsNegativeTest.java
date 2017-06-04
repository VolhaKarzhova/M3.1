package junit.posNegFunctions;

import junit.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class IsNegativeTest extends BaseTest {

    private long a;
    private boolean expected;

    public IsNegativeTest(long a, boolean expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void isNegativeTest () {
        Assert.assertEquals(expected, calculator.isNegative(a));
    }

    @Parameterized.Parameters
    public static Collection getParameters () {
        return Arrays.asList(new Object[][]{
                {-1, true},
                {0, false},
                {1, false},
                {-(-2), false},
                {Long.valueOf("10"), Boolean.valueOf("false")}
        });
    }
}
