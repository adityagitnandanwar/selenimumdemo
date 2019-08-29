Test Framework Components: Java 1.8 + Maven + TestNg

Steps to execute tests:
1. Download zip, unpack, 
2. In command prompt open project location and run command "mvn clean test"
3. After the test execution is finished, run command "mvn allure:serve" - The report will be opened in your local browser

NOTE:
1. You need Java 1.8
2. Google chrome current version 76(make sure you have latest 76) should be used with the corresponding latest chrome driver version 76(already available in the project directory)
3. Selenium tests has been implemented with PageObject design pattern
4. The test called "flowone" is implemented such that it fails if there are no records found in the table
5. The file saving can fail if user's internet connection is slow. In that case, "Thread.sleep(2000)" value could be increased inside the saveFile() method in the class UserHomePage.
