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

WebUI.setText(findTestObject('Page_Sample Store/MenuSamping/harga_input'), '10000')

WebUI.setText(findTestObject('Page_Sample Store/MenuSamping/name_input'), 'arie')

WebUI.setText(findTestObject('Page_Sample Store/MenuSamping/email_input'), 'ariehutajulu20@gmail.com')

WebUI.setText(findTestObject('Page_Sample Store/MenuSamping/phone_input'), '081282382282')

WebUI.setText(findTestObject('Page_Sample Store/MenuSamping/city_input'), 'Jakarta')

WebUI.setText(findTestObject('Page_Sample Store/MenuSamping/alamat_input'), 'Jalan karet no 100')

WebUI.setText(findTestObject('Page_Sample Store/MenuSamping/postal_input'), '12092')

WebUI.click(findTestObject('Page_Sample Store/MenuSamping/button_checkout'))

WebUI.click(findTestObject('Page_Sample Store/PopUp_Pembayaran/a_shipping details'))

WebUI.click(findTestObject('Page_Sample Store/PopUp_Pembayaran/a_Continue'))

WebUI.click(findTestObject('Page_Sample Store/PopUp_Pembayaran/Pilihan Pembayaran/a_Alfamart'))

WebUI.click(findTestObject('Page_Sample Store/PopUp_Pembayaran/a_Pay Now'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Sample Store/div_SEE INSTRUCTIONS_alfamartttt'))

WebUI.delay(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Page_Sample Store/a_Complete Payment at Indomaret'))

WebUI.verifyElementText(findTestObject('Page_Sample Store/Homepage/div_Weve booked your payment.Please continue as instructed'), 
    'We\'ve booked your payment.')

WebUI.closeBrowser()

