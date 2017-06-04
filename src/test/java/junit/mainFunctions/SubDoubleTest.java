package junit.mainFunctions;

import junit.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SubDoubleTest extends BaseTest {

    private double a;
    private double b;
    private double expected;

    public SubDoubleTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void subDouble () {
        Assert.assertEquals(expected, calculator.sub(a, b), 0.0);
    }

    @Parameterized.Parameters
    public static Collection getParameters () {
        return Arrays.asList(new Object[][]{
                {2.0, 1.0, 1.0},
                {0.0, 0.0, 0.0},
                {-1.1, -1.1, 0.0},
                {2.1, -1.1, 3.2},
                {1.5555, 1.0, 0.5555}, //Test is failed with these parameters because of the specific features of the double type
                {Double.valueOf("20.0"), Double.valueOf("1.5"), Double.valueOf("18.5")}
        });
    }
}
