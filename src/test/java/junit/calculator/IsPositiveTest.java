package junit.calculator;

import junit.common.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class IsPositiveTest extends BaseTest {

    private long a;
    private boolean expected;

    public IsPositiveTest(long a, boolean expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void isPositiveTest() {
        Assert.assertEquals(expected, calculator.isPositive(a));
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        return Arrays.asList(new Object[][]{
                {1, true},
                {0, false},
                {-1, false},
                {-500, false},
                {500, true}
        });
    }
}