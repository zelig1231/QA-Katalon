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

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/p_Purchase Request'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/button_Add New'))

WebUI.setText(findTestObject('Object Repository/Purchase/PurchaseRequest/input_Doc. Reference_formDocReff'), 'referensi dokumen')

WebUI.setText(findTestObject('Object Repository/Purchase/PurchaseRequest/input_Doc. Reference No_formDocReffNo'), 
    '1234')

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/svg_Select_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/div_Legal'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/svg_Select_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/div_Tukang Cuci AC'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/svg_Select_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/div_BIFAST Project New'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/button_New Item'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/input_checkbox'))

WebUI.setText(findTestObject('Object Repository/Purchase/PurchaseRequest/textarea_d'), 'deskripsi')

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/button_Submit'))

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/button_Yes, Submit It'))

WebUI.delay(4 //detik
    )

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/button_OK'))

WebUI.delay(2 //detik
)

WebUI.click(findTestObject('Object Repository/Purchase/PurchaseRequest/button_Go Back'))

