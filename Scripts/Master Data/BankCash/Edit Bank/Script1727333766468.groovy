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


WebUI.click(findTestObject('Object Repository/Master_Data/BankCash/input_checkbox'))

WebUI.click(findTestObject('Object Repository/Master_Data/BankCash/button_Edit'))

WebUI.setText(findTestObject('Object Repository/Master_Data/BankCash/input_Bank Account_BANK_ACCOUNT'), '889723123')

WebUI.setText(findTestObject('Object Repository/Master_Data/BankCash/input_Description_DESCRIPTION'), 'dexkripxon')

WebUI.click(findTestObject('Object Repository/Master_Data/BankCash/div_ZWL_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Master_Data/BankCash/div_ZMW - Zambian Kwacha'))

WebUI.setText(findTestObject('Object Repository/Master_Data/BankCash/input_Bank Type_TYPE'), 'tipe tipe bank')

WebUI.setText(findTestObject('Object Repository/Master_Data/BankCash/input_Chart of Account Name_ACCOUNT_COA_NAME'), 
    'beruang')

WebUI.setText(findTestObject('Object Repository/Master_Data/BankCash/input_Bank Address_BANK_ADDRESS'), 'gedung BCA')

WebUI.setText(findTestObject('Object Repository/Master_Data/BankCash/input_Contact Person_CONTACT_PERSON'), 
    'Xie Beceha')

WebUI.click(findTestObject('Object Repository/Master_Data/BankCash/div_Chart of Account_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Master_Data/BankCash/div_11040001 - Barang Dagangan'))

WebUI.setText(findTestObject('Object Repository/Master_Data/BankCash/input_Bank Number Phone_BANK_NUMBER_PHONE'), 
    '54512343')

WebUI.setText(findTestObject('Object Repository/Master_Data/BankCash/input_Contact Person Number_CONTACT_PERSON_NUMBER'), 
    '6212332121')

WebUI.click(findTestObject('Object Repository/Master_Data/BankCash/button_Simpan Perubahan'))


WebUI.delay(4) // detik
	
	
WebUI.click(findTestObject('Object Repository/Master_Data/BankCash/button_OK'))

