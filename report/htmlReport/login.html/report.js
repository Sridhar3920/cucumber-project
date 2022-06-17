$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/DataTable.feature");
formatter.feature({
  "name": "To check Facebook Login page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To open the Facebook in chromeBrowser",
  "keyword": "Given "
});
formatter.match({
  "location": "DataTable.to_open_the_Facebook_in_chromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check the valid input datas",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@ValidData"
    }
  ]
});
formatter.step({
  "name": "Enter the valid username and valid password",
  "rows": [
    {
      "cells": [
        "sridhar3920@gmail.com",
        "sriDHarss"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "DataTable.enter_the_valid_username_and_valid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click a login button",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTable.click_a_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to check successfully login or not",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTable.to_check_successfully_login_or_not()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//strong[(@id\u003d\u0027u_0_c_8E\u0027)]\"}\n  (Session info: chrome\u003d102.0.5005.63)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-2640OBL\u0027, ip: \u0027192.168.207.158\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_321\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 102.0.5005.63, chrome: {chromedriverVersion: 102.0.5005.61 (0e59bcc00cc4..., userDataDir: C:\\Users\\sridh\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:56373}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 2c6546601b1772142d68e0a504e1d617\n*** Element info: {Using\u003dxpath, value\u003d//strong[(@id\u003d\u0027u_0_c_8E\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.getText(Unknown Source)\r\n\tat org.baseClass.HelpClass.printGetText(HelpClass.java:103)\r\n\tat org.stepDefinition.DataTable.to_check_successfully_login_or_not(DataTable.java:36)\r\n\tat ✽.to check successfully login or not(file:src/test/resources/FeatureFile/DataTable.feature:12)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To open the Facebook in chromeBrowser",
  "keyword": "Given "
});
formatter.match({
  "location": "DataTable.to_open_the_Facebook_in_chromeBrowser()"
});
