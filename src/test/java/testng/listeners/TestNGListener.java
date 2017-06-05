package testng.listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class TestNGListener implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        System.out.println("Method started: " + iInvokedMethod.getTestMethod().getMethodName());

    }

    @Override
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        System.out.println("Method finished [" + iTestResult.getStatus() + "]: "
                + iInvokedMethod.getTestMethod().getMethodName() + "\n");

    }
}