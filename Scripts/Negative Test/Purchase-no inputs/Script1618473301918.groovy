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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.midtrans.com/')

WebUI.click(findTestObject('Page_Sample Store/Homepage/a_BUY NOW'))

//WebUI.setText(findTestObject('Page_Sample Store/MenuSamping/harga_input'), '10000')
WebUI.setText(findTestObject('Page_Sample Store/MenuSamping/name_input'), '')

WebUI.setText(findTestObject('Page_Sample Store/MenuSamping/email_input'), '')

WebUI.setText(findTestObject('Page_Sample Store/MenuSamping/phone_input'), '')

WebUI.setText(findTestObject('Page_Sample Store/MenuSamping/city_input'), '')

WebUI.setText(findTestObject('Page_Sample Store/MenuSamping/alamat_input'), '')

WebUI.setText(findTestObject('Page_Sample Store/MenuSamping/postal_input'), ' ')

WebUI.click(findTestObject('Page_Sample Store/MenuSamping/button_checkout'))

WebUI.verifyElementText(findTestObject('Page_Sample Store/Homepage/div_Sorry, something went wrong.Please retry your purchase'), 
    'Sorry, something went wrong.')

WebUI.closeBrowser()

