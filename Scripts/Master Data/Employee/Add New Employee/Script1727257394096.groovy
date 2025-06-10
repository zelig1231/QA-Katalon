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

WebUI.click(findTestObject('Object Repository/Master_Data/Employee/p_Employee'))

WebUI.click(findTestObject('Object Repository/Master_Data/Employee/button_Add New'))

WebUI.setText(findTestObject('Object Repository/Master_Data/Employee/input_Address_ADDRESS'), 'Menara Batafia')

WebUI.setText(findTestObject('Object Repository/Master_Data/Employee/input_Phone_PHONE'), '82501965576')

WebUI.setText(findTestObject('Object Repository/Master_Data/Employee/input_Mobile Phone_MOBILE_PHONE'), '89672335576')

WebUI.setText(findTestObject('Object Repository/Master_Data/Employee/input_Email_EMAIL'), 'zelig.elden@ptap.com')

WebUI.setText(findTestObject('Object Repository/Master_Data/Employee/input_Description_DESCRIPTION'), 'anak magang')

WebUI.click(findTestObject('Object Repository/Master_Data/Employee/div_Title_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Master_Data/Employee/div_Technical Consultant - Technical Consultant'))

WebUI.setText(findTestObject('Object Repository/Master_Data/Employee/input__NAME'), 'Zelig Elden')

WebUI.setText(findTestObject('Object Repository/Master_Data/Employee/input_Employee Identification Number ( NIK _d0a946'), 
    '2501965576')

WebUI.click(findTestObject('Object Repository/Master_Data/Employee/button_Save'))

WebUI.delay(4) // detik

WebUI.click(findTestObject('Object Repository/Master_Data/Employee/button_OK'))

