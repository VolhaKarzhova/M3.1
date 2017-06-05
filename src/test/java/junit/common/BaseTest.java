package junit.common;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;

public class BaseTest {

    protected Calculator calculator;

     @Before
      public void setCalculator () {
        calculator = new Calculator();
    }

    @After
    public void afterTest () {
        calculator = null;
    }
}
