package junit.suites;

import junit.calculator.*;
import junit.calculator.IsNegativeTest;
import junit.calculator.IsPositiveTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SumDoubleTest.class,
        SumLongTest.class,
        SubDoubleTest.class,
        SubLongTest.class,
        MultDoubleTest.class,
        MultLongTest.class,
        DivByZero.class,
        DivDoubleTest.class,
        DivLongTest.class,
        PowTest.class,
        SqrtNegativeTest.class,
        SqrtNegativeTest.class,
        IsNegativeTest.class,
        IsPositiveTest.class,
        CosTest.class,
        SinTest.class,
        TgTest.class,
        CtgTest.class,
        InfinityTest.class,
})
public class JunitSuit {}
