# CRUDTest
Automated framework for sample computer database

## Getting Started
Current framework contains the list of test cases which is split between core CRUD functionality and edge scenarios tests (for example mandatory fields verification).

### Prerequisites
- Chromedriver;
- Java 8; 
- Maven;
- Junit;
- Sutable Command line (CMD or GIT Bash);

### Installing
- Download project from GIT repo using next link https://github.com/stepantzov/BackBaseTest.git.
- Install all the necessary prerequisites from above Prerequisites. 
- Change CHROME_DRIVER_PATH variable at GlobalDefinitions.class to location of Chromedriver on your local machine;

## Running the tests 
- Open any command or GIT Bash;
- Navigate to the project catalog classpath on commandline, eg. c:\Maven\BackBaseTest;
- At this moment there three tests suites available to execution:

**TestCoreSuite.class** - contains Critical priority functionality related to CRUD operations;

**TestEdgeCasesSuite.class** - contains Medium priority Test Cases, such as fields validation test cases;

**TestFullScopeSuite.class** - contains full Test Cases scope with Critical and Medium priority;




- To Run the necessary test suite 1-3, please use the next Maven commands below:

**mvn install -DrunSuite=TestCoreSuite.class**

**mvn install -DrunSuite=TestEdgeCasesSuite.class**

**mvn install -DrunSuite=TestFullScopeSuite.class**


- observe the tests results from console log.

## Built With
* [Maven](https://maven.apache.org/) - Dependency Management


## Authors
Ivan Stepantsov
