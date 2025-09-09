import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.beans.Customizer

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.globalsqa.com/samplepagetest/')
//SetText Custom Keyword//
//WebUI.setText(findTestObject('Object Repository/Page_Sample Page Test - GlobalSQA/input_Name(required)'), 'Linh Nguyen')
CustomKeywords.'customKeywords_JavaScripts.setTextJavaScripts'('Object Repository/Page_Sample Page Test - GlobalSQA/input_Name(required)', 'Linh Nguyen')

//WebUI.setText(findTestObject('Object Repository/Page_Sample Page Test - GlobalSQA/input_Email(required)'), 'linh.nguyen@katalon.com')
CustomKeywords.'customKeywords_JavaScripts.setTextJavaScripts'('Object Repository/Page_Sample Page Test - GlobalSQA/input_Email(required)', 'linh.nguyen@katalon.com')

//---------------------------//

// DropdownList Custom Keyword
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Sample Page Test - GlobalSQA/select_Experience (In Years)(required)'), '3-5', true)
CustomKeywords.'customKeywords_JavaScripts.selectOptionByValue'('Object Repository/Page_Sample Page Test - GlobalSQA/select_Experience (In Years)(required)', '7-10')
WebUI.delay(3)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Sample Page Test - GlobalSQA/input_Automation Testing'))

WebUI.closeBrowser()

