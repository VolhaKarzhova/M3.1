package testng.calculator;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;

import java.util.Date;

public class BaseTest {

    protected Calculator calculator;

    @BeforeSuite
    public void setPhrase() {
        System.out.println("Set of Unit tests for Calculator applications starts");
    }

    @BeforeClass()
    public void setUp() {
        calculator = new Calculator();
    }

    @BeforeGroups(value = {"cos"})
    public void setStartPhrase() {
        System.out.println("Calculation of COS starts");
    }

    @AfterGroups(value = {"cos"})
    public void setFinishPhrase() {
        System.out.println("Tests are completed");
    }

    @BeforeGroups(value = {"sin"})
    public void setStartPhraseSin() {
        System.out.println("Calculation of SIN starts");
    }

    @AfterGroups(value = {"sin"})
    public void setFinishPhraseSin() {
        System.out.println("Tests are completed");
    }

    @AfterSuite
    public void setPhraseDone() {
        System.out.println("Set of Unit tests for Calculator application completed. Please, check the results");
    }

    protected void checkTime() {
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
    }
}