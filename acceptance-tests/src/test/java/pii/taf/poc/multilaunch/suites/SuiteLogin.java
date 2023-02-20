package pii.taf.poc.multilaunch.suites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

import pii.taf.poc.multilaunch.tests.LoginTests;

@Suite
@SuiteDisplayName("Login test suite")
@SelectClasses({LoginTests.class})
public class SuiteLogin {
}
