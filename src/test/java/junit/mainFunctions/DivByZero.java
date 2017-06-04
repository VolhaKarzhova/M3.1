package junit.mainFunctions;

import junit.BaseTest;
import org.junit.Test;

public class DivByZero extends BaseTest {

    @Test(expected = NumberFormatException.class)
    public void divByZeroLong () {
        calculator.div(12,0);
    }

    @Test(expected = NumberFormatException.class)
    public void divByZeroDouble () {
        calculator.div(12.1, 0.0);
    }
}
