package junit.mainFunctions;

import junit.BaseTest;
import org.junit.Test;

public class SqrtNegTest extends BaseTest {

    @Test(expected = NumberFormatException.class)
    public void negativeSqrt () {
        calculator.sqrt(-4.0);
    }
}
