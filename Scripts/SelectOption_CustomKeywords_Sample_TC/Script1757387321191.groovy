import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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

WebUI.navigateToUrl('https://www.automationtesting.co.uk/dropdown.html')

WebUI.click(findTestObject('Object Repository/Page_Dropdown Menus/label_One'))

WebUI.click(findTestObject('Object Repository/Page_Dropdown Menus/label_Three'))

WebUI.click(findTestObject('Object Repository/Page_Dropdown Menus/label_Blue'))

WebUI.click(findTestObject('Object Repository/Page_Dropdown Menus/a_Animals'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Dropdown Menus/li_Animals'))

WebUI.click(findTestObject('Object Repository/Page_Dropdown Menus/a_Mouse'))

//DropdownList Custom Keyword//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dropdown Menus/select_cars'), 'jeep', true)
CustomKeywords.'customKeywords_JavaScripts.selectOptionByValue'('Object Repository/Page_Dropdown Menus/select_cars', 'jeep')

WebUI.delay(3)

//------------------------------//

//DropdownList Custom Keyword//
CustomKeywords.'customKeywords_JavaScripts.selectOptionByLabel'('Object Repository/Page_Dropdown Menus/select_cars', 'Volkswagen')
//----------------------------//
WebUI.delay(3)

WebUI.closeBrowser()

