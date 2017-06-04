package junit;

import junit.mainFunctions.*;
import junit.posNegFunctions.IsNegativeTest;
import junit.posNegFunctions.IsPositiveTest;
import junit.trigonometry.*;
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
        SqrtNegTest.class,
        SqrtNegTest.class,
        IsNegativeTest.class,
        IsPositiveTest.class,
        CosTest.class,
        SinTest.class,
        TgTest.class,
        CtgTest.class,
        InfinityTest.class,
})
public class JunitSuit {}
