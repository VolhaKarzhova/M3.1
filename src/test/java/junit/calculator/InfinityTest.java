package junit.calculator;

import junit.common.BaseTest;
import org.junit.Test;

public class InfinityTest extends BaseTest {

    @Test(expected = NumberFormatException.class)
    public void tg90() {
        calculator.tg(90.0);
    }

    @Test(expected = NumberFormatException.class)
    public void ctg0() {
        calculator.ctg(0.0);
    }
}