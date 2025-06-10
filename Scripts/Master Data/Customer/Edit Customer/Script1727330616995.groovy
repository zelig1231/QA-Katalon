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

WebUI.click(findTestObject('Object Repository/Master_Data/Customer/input_checkbox'))

WebUI.click(findTestObject('Object Repository/Master_Data/Customer/button_Edit'))

WebUI.setText(findTestObject('Object Repository/Master_Data/Customer/input_Type_TYPE (1)'), 'tipe enam')

WebUI.setText(findTestObject('Object Repository/Master_Data/Customer/input_Address_ADDRESS (1)'), 'ujung jalan')

WebUI.setText(findTestObject('Object Repository/Master_Data/Customer/input_Phone_PHONE (1)'), '62812345678')

WebUI.setText(findTestObject('Object Repository/Master_Data/Customer/input_Npwp Account_NPWP_ACCOUNT (1)'), 
    '1234567')

WebUI.setText(findTestObject('Object Repository/Master_Data/Customer/input_Npwp Address_NPWP_ADDRESS (1)'), 
    'jalanan')

WebUI.setText(findTestObject('Object Repository/Master_Data/Customer/input_Description_DESCRIPTION (1)'), 
    'sebuah deschripshon')

WebUI.setText(findTestObject('Object Repository/Master_Data/Customer/input_Contact Person Number_CONTACT_PERSON_NUMBER (1)'), 
    '543210123')

WebUI.setText(findTestObject('Object Repository/Master_Data/Customer/input_Contact Person Email_CONTACT_PERSON_EMAIL (1)'), 
    'orang543@gmail.com')

WebUI.click(findTestObject('Object Repository/Master_Data/Customer/div_Chart of Account Payable_css-19bb58m (1)'))

WebUI.click(findTestObject('Object Repository/Master_Data/Customer/div_11040001 - Barang Dagangan'))

WebUI.click(findTestObject('Object Repository/Master_Data/Customer/div_Chart of Account Receivable_css-19bb58m (1)'))

WebUI.click(findTestObject('Object Repository/Master_Data/Customer/div_11040001 - Barang Dagangan_1'))

WebUI.click(findTestObject('Object Repository/Master_Data/Customer/div_Vendor_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Master_Data/Customer/div_Customer - As a Customer'))

WebUI.click(findTestObject('Object Repository/Master_Data/Customer/button_Simpan Perubahan'))

WebUI.delay(4) // detik

WebUI.click(findTestObject('Object Repository/Master_Data/Customer/button_OK (1)'))

