package testng.runner;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import testng.listeners.MyListener;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {

    public static void main(String[] args) {

        TestListenerAdapter tln = new TestListenerAdapter();
        TestNG ng = new TestNG();
        ng.addListener(tln);
        ng.addListener(new MyListener());

        XmlSuite suite = new XmlSuite();
        suite.setName("CalculatorTest");

        List<String> files = new ArrayList<String>();
        files.addAll(new ArrayList<String>() {{
            add("./src/main/resources/suites/suiteTest.xml");
        }});
        suite.setSuiteFiles(files);

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);
        ng.setXmlSuites(suites);

        ng.run();
    }
}

