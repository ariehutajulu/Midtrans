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

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Sample Store/a_SIGN UP'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Page_Registration/a_EN'))

WebUI.verifyElementText(findTestObject('Page_Registration/h1_Registration'), 'Registration')

WebUI.setText(findTestObject('Page_Registration/input_name'), 'arie')

//WebUI.setText(findTestObject('Page_MAP  Registration/input_Business name_usermerchant_name'), 'arie')
WebUI.setText(findTestObject('Page_Registration/input_full_name'), 'arie ebeth hutajulu')

WebUI.setText(findTestObject('Page_Registration/input_email'), 'ariehutajulu@gmail.com')

WebUI.setText(findTestObject('Page_Registration/input_phone'), '81298122461')

WebUI.setEncryptedText(findTestObject('Page_Registration/input_password'), 'A9FEAejmvzM2x0qDaGTP8A==')

WebUI.setEncryptedText(findTestObject('Page_Registration/input_password_confirmation'), 'A9FEAejmvzM2x0qDaGTP8A==')

WebUI.click(findTestObject('Page_Registration/button_register'))

WebUI.closeBrowser()

