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

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/p_Purchase'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseOrder/p_Purchase Order'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseOrder/button_Add New'))

WebUI.setText(findTestObject('Object Repository/Purchase/PurchaseOrder/input_PO Number_formPoNumber'), '12345')

WebUI.selectOptionByValue(findTestObject('Object Repository/Purchase/PurchaseOrder/select_Select Document ReferencePurchase Re_5a0a62'), 
    'purchaseRequest', true)

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseOrder/div_Purhcase Request_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseOrder/div_PR202400026'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseOrder/div_Vendor_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseOrder/div_Tukang Cuci AC'))

WebUI.setText(findTestObject('Object Repository/Purchase/PurchaseOrder/input_Approved By_formApprovedBy'), 'apruved by ptap')

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseOrder/input_checkbox'))

WebUI.setText(findTestObject('Object Repository/Purchase/PurchaseOrder/textarea_Terms  Conditions_form-control'), 
    't&c')

WebUI.setText(findTestObject('Object Repository/Purchase/PurchaseOrder/textarea_deskripxi'), 'deskripxi')

WebUI.selectOptionByValue(findTestObject('Object Repository/Purchase/PurchaseOrder/select_Select VATIncludeExclude'), 
    'include', true)

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseOrder/svg_Select Tax Type_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseOrder/div_PPN 10'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseOrder/button_Save'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseOrder/button_Yes, submit it'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseOrder/button_OK'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseOrder/button_Back'))
