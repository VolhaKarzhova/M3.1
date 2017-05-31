package testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumTest {

   @Test
   @Parameters({"a", "b", "expected"})
    public void testSum (long a, long b, long expected) {
        Calculator calculator = new Calculator();
        long sum = calculator.sum(a, b);
        Assert.assertEquals(sum, expected);

    }
}
