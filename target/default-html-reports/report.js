$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/completeTransaction.feature");
formatter.feature({
  "name": "complete transaction",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: Unable to create a new remote session. Please check the server log for more details. Original error: An unknown server-side error occurred while processing the command. Original error: Error executing adbExec. Original error: \u0027Command \u0027/Users/elyarabdullah/Library/Android/sdk/platform-tools/adb -P 5037 -s emulator-5554 shell \u0027settings delete global hidden_api_policy_pre_p_apps;settings delete global hidden_api_policy_p_apps;settings delete global hidden_api_policy\u0027\u0027 exited with code 1\u0027; Command output: adb: device offline\n\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027elyars-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:848:64dd:1c30:d2a7%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u00271.8.0_301\u0027\nDriver info: driver.version: AndroidDriver\nremote stacktrace: UnknownError: An unknown server-side error occurred while processing the command. Original error: Error executing adbExec. Original error: \u0027Command \u0027/Users/elyarabdullah/Library/Android/sdk/platform-tools/adb -P 5037 -s emulator-5554 shell \u0027settings delete global hidden_api_policy_pre_p_apps;settings delete global hidden_api_policy_p_apps;settings delete global hidden_api_policy\u0027\u0027 exited with code 1\u0027; Command output: adb: device offline\n\n    at getResponseForW3CError (/opt/homebrew/lib/node_modules/appium/node_modules/appium-base-driver/lib/protocol/errors.js:804:9)\n    at asyncHandler (/opt/homebrew/lib/node_modules/appium/node_modules/appium-base-driver/lib/protocol/protocol.js:380:37)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027elyars-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:848:64dd:1c30:d2a7%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u00271.8.0_301\u0027\nDriver info: driver.version: AndroidDriver\n\tat io.appium.java_client.remote.AppiumCommandExecutor$1.createSession(AppiumCommandExecutor.java:216)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.createSession(AppiumCommandExecutor.java:225)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:250)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:41)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\n\tat io.appium.java_client.AppiumDriver.startSession(AppiumDriver.java:363)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\n\tat io.appium.java_client.DefaultGenericMobileDriver.\u003cinit\u003e(DefaultGenericMobileDriver.java:37)\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:89)\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:99)\n\tat io.appium.java_client.android.AndroidDriver.\u003cinit\u003e(AndroidDriver.java:97)\n\tat cucumberTemplate.utilities.DriverUtil.setup(DriverUtil.java:38)\n\tat cucumberTemplate.stepdefinitions.Hooks.setup(Hooks.java:23)\nCaused by: java.lang.reflect.InvocationTargetException\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat io.appium.java_client.remote.AppiumCommandExecutor$1.createSession(AppiumCommandExecutor.java:193)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.createSession(AppiumCommandExecutor.java:225)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:250)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:41)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\n\tat io.appium.java_client.AppiumDriver.startSession(AppiumDriver.java:363)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\n\tat io.appium.java_client.DefaultGenericMobileDriver.\u003cinit\u003e(DefaultGenericMobileDriver.java:37)\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:89)\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:99)\n\tat io.appium.java_client.android.AndroidDriver.\u003cinit\u003e(AndroidDriver.java:97)\n\tat cucumberTemplate.utilities.DriverUtil.setup(DriverUtil.java:38)\n\tat cucumberTemplate.stepdefinitions.Hooks.setup(Hooks.java:23)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:27)\n\tat io.cucumber.java.JavaHookDefinition.execute(JavaHookDefinition.java:61)\n\tat io.cucumber.core.runner.CoreHookDefinition.execute(CoreHookDefinition.java:31)\n\tat io.cucumber.core.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:20)\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:47)\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:115)\n\tat org.testng.junit.JUnit4TestRunner.start(JUnit4TestRunner.java:74)\n\tat org.testng.junit.JUnit4TestRunner.run(JUnit4TestRunner.java:65)\n\tat org.testng.TestRunner$1.run(TestRunner.java:652)\n\tat java.util.ArrayList.forEach(ArrayList.java:1259)\n\tat org.testng.TestRunner.runJUnitWorkers(TestRunner.java:843)\n\tat org.testng.TestRunner.privateRunJUnit(TestRunner.java:681)\n\tat org.testng.TestRunner.run(TestRunner.java:585)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:384)\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:286)\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1187)\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1109)\n\tat org.testng.TestNG.runSuites(TestNG.java:1039)\n\tat org.testng.TestNG.run(TestNG.java:1007)\n\tat org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)\n\tat org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)\n\tat org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:99)\n\tat org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)\n\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)\nCaused by: org.openqa.selenium.WebDriverException: An unknown server-side error occurred while processing the command. Original error: Error executing adbExec. Original error: \u0027Command \u0027/Users/elyarabdullah/Library/Android/sdk/platform-tools/adb -P 5037 -s emulator-5554 shell \u0027settings delete global hidden_api_policy_pre_p_apps;settings delete global hidden_api_policy_p_apps;settings delete global hidden_api_policy\u0027\u0027 exited with code 1\u0027; Command output: adb: device offline\n\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027elyars-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:848:64dd:1c30:d2a7%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u00271.8.0_301\u0027\nDriver info: driver.version: AndroidDriver\nremote stacktrace: UnknownError: An unknown server-side error occurred while processing the command. Original error: Error executing adbExec. Original error: \u0027Command \u0027/Users/elyarabdullah/Library/Android/sdk/platform-tools/adb -P 5037 -s emulator-5554 shell \u0027settings delete global hidden_api_policy_pre_p_apps;settings delete global hidden_api_policy_p_apps;settings delete global hidden_api_policy\u0027\u0027 exited with code 1\u0027; Command output: adb: device offline\n\n    at getResponseForW3CError (/opt/homebrew/lib/node_modules/appium/node_modules/appium-base-driver/lib/protocol/errors.js:804:9)\n    at asyncHandler (/opt/homebrew/lib/node_modules/appium/node_modules/appium-base-driver/lib/protocol/protocol.js:380:37)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:499)\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:486)\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\n\t... 79 more\n",
  "status": "failed"
});
formatter.step({
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.user_is_on_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters \"elyar\"",
  "keyword": "When "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.user_enters(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user hides keyboard",
  "keyword": "And "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.user_hides_keyboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects gender female",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.user_selects_gender_female()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks  country dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.user_clicks_country_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user scrolls until user sees the country \"Germany\"",
  "keyword": "And "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.user_scrolls_until_user_sees_the_country(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks the country \"Germany\"",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.user_clicks_the_country(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks letsshop button",
  "keyword": "When "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.user_clicks_letsshop_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is on the product list page",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.user_is_on_the_product_list_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects the top 2 products",
  "keyword": "And "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.user_selects_the_top_products(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks Cart Icon button",
  "keyword": "When "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.user_clicks_Cart_Icon_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is on the \"Cart\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.user_is_on_the_page(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should see the selected products",
  "keyword": "And "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.user_should_see_the_selected_products()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user checks if the total price of the selected products is correct",
  "keyword": "And "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.user_checks_if_the_total_price_of_the_selected_products_is_correct()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks  sendMeEmail checkbox button",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.user_clicks_sendMeEmail_checkbox_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user longpress text \"Please read our terms of conditions\"",
  "keyword": "When "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.user_longpress_text(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should see the conditions message",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.user_should_see_the_conditions_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks close button",
  "keyword": "And "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.user_clicks_close_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks the link button that directs to product website",
  "keyword": "When "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.user_clicks_the_link_button_that_directs_to_product_website()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "googles security window pops up",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.googles_security_window_pops_up()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user agrees with the google security alert",
  "keyword": "And "
});
formatter.match({
  "location": "cucumberTemplate.stepdefinitions.CompeleteTransactionStepDefs.user_agrees_with_the_google_security_alert()"
});
formatter.result({
  "status": "skipped"
});
});