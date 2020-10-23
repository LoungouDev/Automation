Automation
=================

Automation : Automation Testing Using Java

selenium-cucumber is a behavior driven development (BDD) approach to write automation test script to test Web.
It enables you to write and execute automated acceptance/unit tests.
It is cross-platform, open source and free.
Automate your test cases with minimal coding.

Documentation
-------------


Download a Framework
--------------

Framework Architecture
--------------
	
* **src/test/java/features** - all the cucumber features files (files .feature ext) goes here.
* **src/test/java/stepDefinition** - you can define step defintion under this package for your feature steps.
* **src/java/java/core** - Contain all base classes for mobile and desktop
* **src/java/java/pageObjects** - Contains page foctory (design pattern page object model)

Writing a test
--------------

The cucumber features goes in the `features` library and should have the ".feature" extension.


Predefined steps
-----------------
By using predefined steps you can automate your test cases more quickly, more efficiently and without much coding.


Running test
--------------

Go to your project directory from terminal and hit following commands
* `mvn test (defualt will run on local firefox browser)`
* `mvn test "-Dbrowser=chrome" (to use any other browser)`
* `mvn test -Dcucumber.options="classpath:features/mobile/my_first.feature"` to run specific feature for appium mobile (Android for the moment IOS is coming soon).
* `mvn test -Dcucumber.options="classpath:features/web/my_first.feature"` to run specific feature for appium mobile (
* `mvn test -Dcucumber.options="–-plugin html:target/result-html"` to generate a HTML report.
* `mvn test -Dcucumber.options="–-plugin json:target/result-json"` to generate a JSON report.

Running test On remote browser/platform
---------------------------------------

To run test on saucelab, browserstack or any other remote browser you need to create browser config file under src/main/java/browserConfig

To run on saucelab create config file with name preceding with saucelab
- saucelab_windows_chrome.properties
- saucelab_mac_firefox.properties

* `mvn test "-Dconfig=saucelab_mac_firefox"`

To run on browserstack create config file with name preceding with browserstack
- browserstack_windows_chrome.properties
- browserstack_mac_firefox.properties

* `mvn test "-Dconfig=browserstack_mac_firefox"`

Maven/Gradle Dependency
-----------------------

See pom.xml

License
-------

(The MIT License)

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the 'Software'), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED 'AS IS', WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
