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

WebUI.click(findTestObject('Object Repository/Master_Data/Customer/p_Customer'))

WebUI.click(findTestObject('Object Repository/Master_Data/Customer/button_Add New'))

WebUI.setText(findTestObject('Object Repository/Master_Data/Customer/input_Type_TYPE'), 'tipe lima')

WebUI.setText(findTestObject('Object Repository/Master_Data/Customer/input_Address_ADDRESS'), 'tengah jalan')

WebUI.setText(findTestObject('Object Repository/Master_Data/Customer/input_Phone_PHONE'), '62812345')

WebUI.setText(findTestObject('Object Repository/Master_Data/Customer/input_Npwp Account_NPWP_ACCOUNT'), '12345')

WebUI.setText(findTestObject('Object Repository/Master_Data/Customer/input_Npwp Address_NPWP_ADDRESS'), 'jalan jalan')

WebUI.setText(findTestObject('Object Repository/Master_Data/Customer/input_Description_DESCRIPTION'), 'sebuah deskripsi')

WebUI.setText(findTestObject('Object Repository/Master_Data/Customer/input_Contact Person Number_CONTACT_PERSON_NUMBER'), 
    '54321')

WebUI.setText(findTestObject('Object Repository/Master_Data/Customer/input_Contact Person Email_CONTACT_PERSON_EMAIL'), 
    'orang123@gmail.com')

WebUI.click(findTestObject('Object Repository/Master_Data/Customer/div_Chart of Account Payable_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Master_Data/Customer/div_1105000 - Pajak Dibayar Dimuka'))

WebUI.click(findTestObject('Object Repository/Master_Data/Customer/div_Chart of Account Receivable_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Master_Data/Customer/div_1105000 - Pajak Dibayar Dimuka_1'))

WebUI.setText(findTestObject('Object Repository/Master_Data/Customer/input__NAME'), 'Teknik Tani')

WebUI.setText(findTestObject('Object Repository/Master_Data/Customer/input_Contact Person_CONTACT_PERSON'), 
    'Rangor')

WebUI.click(findTestObject('Object Repository/Master_Data/Customer/div_Entity Type_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Master_Data/Customer/div_Vendor - As a Vendor'))

WebUI.setText(findTestObject('Object Repository/Master_Data/Customer/input_Contact Person Title_TITLE_PERSON'), 
    'petani')

WebUI.click(findTestObject('Object Repository/Master_Data/Customer/button_Save'))

WebUI.delay(4) // detik

WebUI.click(findTestObject('Object Repository/Master_Data/Customer/button_OK'))

