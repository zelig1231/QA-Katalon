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

WebUI.click(findTestObject('Object Repository/Master_Data/Currency/p_Currency'))

WebUI.click(findTestObject('Object Repository/Master_Data/Currency/input_checkbox'))

WebUI.click(findTestObject('Object Repository/Master_Data/Currency/button_Edit'))

WebUI.setText(findTestObject('Object Repository/Master_Data/Currency/input_Name_NAME'), 'Zezez')

WebUI.setText(findTestObject('Object Repository/Master_Data/Currency/input_Saturday Holiday_SATURDAY_HOLIDAY'), 
    'y')

WebUI.setText(findTestObject('Object Repository/Master_Data/Currency/input_Sunday Holiday_SUNDAY_HOLIDAY'), 
    'y')

WebUI.setText(findTestObject('Object Repository/Master_Data/Currency/input_Description_DESCRIPTION'), 'Zezez')

WebUI.click(findTestObject('Object Repository/Master_Data/Currency/button_Simpan Perubahan'))

WebUI.delay(4) // detik


WebUI.click(findTestObject('Object Repository/Master_Data/Currency/button_OK'))

