# BackBaseTest
Automated framework for sample computer database

## Getting Started
Current framework contains list of test cases which split between core CRUD functionality 
and edge scenarios tests (like mandatory fields verification).

### Prerequisites
chromedriver;
java 8; 
Maven;
Junit;

### Installing
- Download project from GIT repo.
- Install all the necessary prerequisites. 
- Change CHROME_DRIVER_PATH variable at GlobalDefinitions.class to location of Chromedriver on your local machine;

## Running the tests 
- Open any command or GIT Bash;
- Navigate to the project catalog classpath on commandline, eg. c:\Maven\BackBaseTest;
- At this moment there two tests suites available to execution: 
TestCoreSuite.class - contains Critical functionality related to CRUD operations;
TestEdgeCasesSuite.class - contains all the Test Cases with medium priority, such as fields validation test cases;
- To Run the necessary test suite please use the next Maven commands below: 
**mvn install -DrunSuite=TestCoreSuite.class
mvn install -DrunSuite=TestEdgeCasesSuite.class**
- observe the tests results from console log.

## Built With
* [Maven](https://maven.apache.org/) - Dependency Management


## Authors
Ivan Stepantsov
