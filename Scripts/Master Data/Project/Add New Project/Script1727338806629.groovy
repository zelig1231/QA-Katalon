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

WebUI.click(findTestObject('Object Repository/Master_Data/Project/p_Project'))

WebUI.click(findTestObject('Object Repository/Master_Data/Project/button_Add New'))

WebUI.click(findTestObject('Object Repository/Master_Data/Project/div_Project Manager_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Master_Data/Project/div_Arya Nur Prasetya - Karyawan'))

WebUI.setText(findTestObject('Object Repository/Master_Data/Project/input_Contract Duration_CONTRACT_DURATION'), 
    '1 years')

WebUI.setText(findTestObject('Object Repository/Master_Data/Project/input_Work Order Number_WORK_ORDER_NUMBER'), 
    '1234/BSPD')

WebUI.setText(findTestObject('Object Repository/Master_Data/Project/input_Description_DESCRIPTION'), 'Project BESPEED')

WebUI.click(findTestObject('Object Repository/Master_Data/Project/div_Customer_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Master_Data/Project/div_Tukang Cuci AC - Perusahaan'))

WebUI.setText(findTestObject('Object Repository/Master_Data/Project/input_Start Date_START_DATE'), '2024-01-01')

WebUI.setText(findTestObject('Object Repository/Master_Data/Project/input_Contract Date_CONTRACT_DATE'), '2024-01-01')

WebUI.setText(findTestObject('Object Repository/Master_Data/Project/input_End Date_END_DATE'), '2024-12-31')

WebUI.setText(findTestObject('Object Repository/Master_Data/Project/input_Contract Number_CONTRACT_NUMBER'), 
    'BSPD')

WebUI.setText(findTestObject('Object Repository/Master_Data/Project/input__NAME'), 'BECEPAT')

WebUI.click(findTestObject('Object Repository/Master_Data/Project/svg_Status Project_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Master_Data/Project/div_Open - Project status still Open'))

WebUI.click(findTestObject('Object Repository/Master_Data/Project/button_Save'))

WebUI.delay(4) // detik

WebUI.click(findTestObject('Object Repository/Master_Data/Project/button_OK'))

