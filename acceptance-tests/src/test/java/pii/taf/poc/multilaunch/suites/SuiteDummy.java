package pii.taf.poc.multilaunch.suites;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Suite of simple JUnit 5 tests")
@SelectPackages({"pii.taf.poc.multilaunch.tests.simple"})
public class SuiteDummy {
}
