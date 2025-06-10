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

WebUI.click(findTestObject('Object Repository/Master_Data/Exchange/p_Exchange Rate'))

WebUI.click(findTestObject('Object Repository/Master_Data/Exchange/button_Add New'))

WebUI.setText(findTestObject('Object Repository/Master_Data/Exchange/input_Buy Rate_BUY_RATE'), '15000')

WebUI.setText(findTestObject('Object Repository/Master_Data/Exchange/input_Sell Rate_SELL_RATE'), '17000')

WebUI.setText(findTestObject('Object Repository/Master_Data/Exchange/input_Description_DESCRIPTION'), 'Harga USD naik')

WebUI.click(findTestObject('Object Repository/Master_Data/Exchange/div__css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Master_Data/Exchange/div_ZWL - Zimbabwean Dollar'))

WebUI.click(findTestObject('Object Repository/Master_Data/Exchange/input_Date_DATE'))

WebUI.click(findTestObject('Object Repository/Master_Data/Exchange/div_26'))

WebUI.click(findTestObject('Object Repository/Master_Data/Exchange/button_Save'))

WebUI.delay(4) // detik


WebUI.click(findTestObject('Object Repository/Master_Data/Exchange/button_OK'))

