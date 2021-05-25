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

WebUI.navigateToUrl('demo.midtrans.com')

WebUI.click(findTestObject('Page_Sample Store/Homepage/button_signup'))

WebUI.setText(findTestObject('Page_Registration/input_name'), 'arie')

WebUI.setText(findTestObject('Page_Registration/input_full_name'), 'Arie Ebeth Hutajulu')

WebUI.setText(findTestObject('Page_Registration/input_email'), 'ariehutajulu@gmail.com')

WebUI.setText(findTestObject('Page_Registration/input_Nomor telepon bisnis_userphone'), '812364571628')

WebUI.setEncryptedText(findTestObject('Page_Registration/input_password'), 'GGbbmOViWehYofQccAM8mw==')

WebUI.setEncryptedText(findTestObject('Page_Registration/input_password_confirmation'), 'GGbbmOViWehYofQccAM8mw==')

WebUI.click(findTestObject('Page_Registration/button_register'))

