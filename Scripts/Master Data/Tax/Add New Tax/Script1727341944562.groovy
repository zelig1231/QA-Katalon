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


WebUI.click(findTestObject('Object Repository/Master_Data/Holiday/p_Master Data'))

WebUI.click(findTestObject('Object Repository/Master_Data/Tax/p_Tax'))

WebUI.click(findTestObject('Object Repository/Master_Data/Tax/button_Add New'))

WebUI.setText(findTestObject('Object Repository/Master_Data/Tax/input__NAME'), 'Pajak baru')

WebUI.setText(findTestObject('Object Repository/Master_Data/Tax/input_Description_DESCRIPTION'), 'deskripsi pajak')

WebUI.setText(findTestObject('Object Repository/Master_Data/Tax/input_Rate_RATE'), '2')

WebUI.click(findTestObject('Object Repository/Master_Data/Tax/div_Tax Account_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Master_Data/Tax/div_1105000 - Pajak Dibayar Dimuka'))

WebUI.setText(findTestObject('Object Repository/Master_Data/Tax/input_Tax Account Name_TAX_ACCOUNT_NAME'), 
    'Pajak 2%')

WebUI.click(findTestObject('Object Repository/Master_Data/Tax/div_Tax Type_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Master_Data/Tax/div_PPh - Tax PPh'))

WebUI.click(findTestObject('Object Repository/Master_Data/Tax/button_Save'))

WebUI.delay(4) // detik

WebUI.click(findTestObject('Object Repository/Master_Data/Tax/button_OK'))

