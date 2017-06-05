package junit.calculator;

import junit.common.BaseTest;
import org.junit.Test;

public class SqrtNegativeTest extends BaseTest {

    @Test(expected = NumberFormatException.class)
    public void negativeSqrt() {
        calculator.sqrt(-4.0);
    }
}