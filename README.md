Aim of this project to train parallel test execution.
Also this project proof compatibility between Java 13 (openjdk) and common test automation tools (JUnit5, Selenium)

How to launch tests in parallel
1) Download chromedriver and put it to taf-junit5-openjdk/acceptance-tests/src/main/resources/chromedriver folder
2) Follow instructions of taf-junit5-openjdk/acceptance-tests/src/main/resources/junit-platform.properties.template and set parallel execution properties 
3) Launch tests taf-junit5-openjdk/acceptance-tests/src/main/java/pii/taf/poc/multilaunch/tests