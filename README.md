# BackBaseTest
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
- Install all the necessary prerequisites from above. 
- Change CHROME_DRIVER_PATH variable at GlobalDefinitions.class to location of Chromedriver on your local machine;

## Running the tests 
- Open any command or GIT Bash;
- Navigate to the project catalog classpath on commandline, eg. c:\Maven\BackBaseTest;
- At this moment there two tests suites available to execution:

TestCoreSuite.class - contains Critical functionality related to CRUD operations;
TestEdgeCasesSuite.class - contains all the Test Cases with medium priority, such as fields validation test cases;

- According to above statement, to Run the necessary test suite please use the next Maven commands below:

**mvn install -DrunSuite=TestCoreSuite.class**

**mvn install -DrunSuite=TestEdgeCasesSuite.class**

- observe the tests results from console log.

## Built With
* [Maven](https://maven.apache.org/) - Dependency Management


## Authors
Ivan Stepantsov
