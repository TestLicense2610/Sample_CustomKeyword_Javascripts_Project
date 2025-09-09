import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class customKeywords_JavaScripts {
	@Keyword
	def setTextJavaScripts(def objectID, def value) {
		WebElement element = WebUiCommonHelper.findWebElement(findTestObject(objectID),30)

		String javascript = "arguments[0].value = arguments[1];"

		WebUI.executeJavaScript(javascript, Arrays.asList(element, value))
	}

	@Keyword
	def selectOptionByValue(def objectID, def value) {
		WebElement dropdown = WebUiCommonHelper.findWebElement(findTestObject(objectID), 30)

		String jsScript = """
        var dropdown = arguments[0];
        var value = arguments[1];
        
        for (var i = 0; i < dropdown.options.length; i++) {
            if (dropdown.options[i].value === value) {
                dropdown.selectedIndex = i;
                
                var event = new Event('change');
                dropdown.dispatchEvent(event);
                return;
            }
        }
    """
		WebUI.executeJavaScript(jsScript, Arrays.asList(dropdown, value))
	}

	@Keyword
	def selectOptionByLabel(def objectID, def label) {
		WebElement dropdown = WebUiCommonHelper.findWebElement(findTestObject(objectID), 30)

		String jsScript = """
        var dropdown = arguments[0];
        var label = arguments[1];
        
        for (var i = 0; i < dropdown.options.length; i++) {
            if (dropdown.options[i].text === label) {
                dropdown.selectedIndex = i;
                
                var event = new Event('change');
                dropdown.dispatchEvent(event);
                return;
            }
        }
    """
		WebUI.executeJavaScript(jsScript, Arrays.asList(dropdown, label))
	}
}
