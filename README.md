Aim of this project to train parallel test execution.
Also this project proof compatibility between Java 13 (openjdk) and common test automation tools (JUnit5, Selenium)

How to launch tests:
1) Download chromedriver and put it to taf-junit5-openjdk/acceptance-tests/src/main/resources/chromedriver folder
2) Follow instructions of taf-junit5-openjdk/acceptance-tests/src/main/resources/junit-platform.properties.template and set parallel execution properties 
3) Launch options:
 - Launch tests via IDE acceptance-tests/src/test/java/pii/taf/poc/multilaunch/tests
- Use maven profiles with predefined suites smoke-tests, acceptance-tests  
**Example:** mvn clean test -Pacceptance-tests
- Use test tags and build unique test suite  
**Example:** mvn clean -Djunit.tags='smoke|login' test
