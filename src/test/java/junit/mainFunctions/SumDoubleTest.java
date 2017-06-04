package junit.mainFunctions;

import junit.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SumDoubleTest extends BaseTest {

        private double a;
        private double b;
        private double expected;

        public SumDoubleTest(double a, double b, double expected) {
            this.a = a;
            this.b = b;
            this.expected = expected;
        }

        @Test
        public void sumDouble () {
            Assert.assertEquals(expected, calculator.sum(a, b), 0.0);
        }

        @Parameterized.Parameters
        public static Collection getParameters () {
            return Arrays.asList( new Object[][] {
                    {1.0, 1.0, 2.0},
                    {0.0, 0.0, 0.0},
                    {-1.5, -1.6, -3.1},
                    {2.1, -1.1, 1.0},
                    {1.5555, 1.0, 2.5555}, //Test is failed with these parameters because of the specific features of the double type
                    {Double.valueOf("2.5"), Double.valueOf("2.5"), Double.valueOf("5.0")}
            });
        }
}
