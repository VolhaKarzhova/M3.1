package testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTest {

   @Test
    public void testSum () {
        Calculator calculator = new Calculator();
        long sum = calculator.sum(1,1);
        Assert.assertEquals(sum, 2);

    }
}
