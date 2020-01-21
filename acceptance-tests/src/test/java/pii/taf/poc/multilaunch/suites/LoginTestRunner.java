package pii.taf.poc.multilaunch.suites;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;
import pii.taf.poc.multilaunch.tests.LoginTests;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Login test suite")
@SelectClasses(LoginTests.class)
public class LoginTestRunner {
}
