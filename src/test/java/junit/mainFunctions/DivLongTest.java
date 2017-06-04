package junit.mainFunctions;

import junit.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
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
    public void divLong () {
        Assert.assertEquals(expected, calculator.div(a, b));
    }

    @Parameterized.Parameters
    public static Collection getParameters () {
        return Arrays.asList(new Object[][]{
                {-8, 4, -2},
                {-4, -2, 2},
                {2, -1, -2},
                {2000, 1000, 2},
                {Long.valueOf("20"), Long.valueOf("2"), Long.valueOf("10")}
        });
    }
}

