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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dev-jogetdx-app.csf.co.id:8443/bcamf/login/app')

WebUI.setText(findTestObject('Object Repository/Page_Joget Workflow - Login/input_Username_j_username'), 'eka.kusuma')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Joget Workflow - Login/input_Password_j_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_Joget Workflow - Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Joget DXApp Center/span_NET RATE_userview-icon'))

WebUI.switchToWindowTitle('Approval PSDM > Inbox')

WebUI.click(findTestObject('Object Repository/Page_Approval PSDMInbox/a_Create Request'))

WebUI.click(findTestObject('Object Repository/Page_Approval PSDMCreate Request/input__assignmentComplete'))

WebUI.setText(findTestObject('Object Repository/Page_Approval PSDMCreate Request/input__sf_data_sub_employee_empl_code'), 
    '202100100')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

WebUI.check(findTestObject('Page_Approval PSDMCreate Request/i'))

WebUI.uploadFileWithDragAndDrop(findTestObject('Page_Approval PSDMCreate Request/div_Dropfiles'), 'C:\\Users\\m.andi\\Documents\\katalon\\filedrop.txt')

WebUI.click(findTestObject('Page_Approval PSDMCreate Request/a_Add Row'))

WebUI.uploadFileWithDragAndDrop(findTestObject('Page_Approval PSDMCreate Request/div_Dropfiles_Att'), 'C:\\Users\\m.andi\\Documents\\katalon\\filedrop.txt')

WebUI.click(findTestObject('Page_Approval PSDMCreate Request/input_Drop files here or click to upload_submit'))

WebUI.click(findTestObject('Page_Approval PSDMCreate Request/a_Add Row (1)'))

