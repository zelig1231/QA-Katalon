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
//
//// Open Browser
//WebUI.openBrowser('')
//
//// Direct to link address
//WebUI.navigateToUrl('http://10.8.135.114/login')
//
//// C
//WebUI.click(findTestObject('Object Repository/Login_Page/Login_Logout/input_Log in_form-control'))
//
//WebUI.setText(findTestObject('Object Repository/Login_Page/Login_Logout/input_Log in_form-control_1_2_3_4_5'), 'zelig')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Login_Page/Login_Logout/input_Log in_form-control_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
//    'iFGeFYmXIrUhQZHvW7P22w==')
//
//WebUI.click(findTestObject('Object Repository/Login_Page/Login_Logout/button_Log in'))
//
//WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/p_Purchase'))
//
//WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/p_Purchase Request'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/input_checkbox (2)'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/button_Edit'))

WebUI.setText(findTestObject('Object Repository/Purchase/PurchaseRequest/input_Doc. Reference_formDocReff (1)'), 'referensi dokumen edit')

WebUI.setText(findTestObject('Object Repository/Purchase/PurchaseRequest/input_Doc. Reference No_formDocReffNo (1)'), 
    '1234567')

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/div_Select_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/div_Sales'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/div_Select_css-19bb58m_1'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/div_Kreatif Digital Solution'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/div_Select_css-19bb58m_1_2'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/div_Project Strategis IT'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/button_Submit (1)'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/button_Yes, Submit It (1)'))

WebUI.delay(4 //detik
	)
	
WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/button_OK (2)'))

