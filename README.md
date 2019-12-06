# Improve Selenium tests with JDI Light and Applitools
Imagine you have project with Selenium tests and you would like to improve your tests:</br>
1. Improve tests stability and add logs for common actions</br>
2. Add Visual testing</br>
3. Add good reports</br>
4. Reduce amount of code in 2-3 times and make it much more maintainable</br>
You can do all of this with minimal effort with jdi-light-eyes (see how it is easy in [commits](https://github.com/jdi-tutorials/selenium-to-jdi-applitools/commits/master)) </br>
![Tests](images/test.png)

## 1 Switch to jdi-light-eyes
You can switch your project [with few lines of code to jdi-light-eyes](https://github.com/jdi-tutorials/selenium-to-jdi-applitools/commit/63f3dfe991020d74c5a1121d4264bf7a30ed79be) and get more stability and good logs of all actions.</br>
![Tests](images/logs.png)
And add visual validations with applitools for each new page opened and each isDisplayed action in already developed tests, just [with 3 methods in before suite class] and adding simple properties files.</br>
![Tests](images/applitools.png)

## 2. Add allure report
[Add allure settings](https://github.com/jdi-tutorials/selenium-to-jdi-applitools/commit/b9336b27413e3d0113907c155a94badc5bca513e) and all actions will be shown in great Allure report that you can generate with allure:serve command.</br>
![Tests](images/allure.png)

## 3. Switch tests to Jdi Light
Now you can [improve your tests using jdi-light features](https://github.com/jdi-tutorials/selenium-to-jdi-applitools/commit/7314e0ad46e2e609ec5486b9e1319d854e39ea1f) and reduce code in 2-3 times. Make it clear to understand and easy to maintain.</br>
**SELENIUM (108 lines of code)**</br>
![Tests](images/contact-form-selenium-1.png)</br>
![Tests](images/contact-form-selenium-2.png)</br>
**JDI LIGHT (6 lines of code)**</br>
![Tests](images/contact-form-jdi-light.png)
