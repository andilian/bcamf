import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
 
'Launching and Navigating to URL\r\n'
WebUI.openBrowser('http://the-internet.herokuapp.com/iframe')
 
'Maximize the window\r\n'
WebUI.maximizeWindow()
 
'Switching to text area which is situated in Iframe'
WebUI.switchToFrame(findTestObject('Frames/textArea_Iframe'), 60)
WebUI.scrollToElement(findTestObject('Frames/TextArea'), 60)
 
'Fecthing the text from Text area and storing it in a variable'
Text = WebUI.getText(findTestObject('Frames/TextArea'))
 
'Verifying the Actual text with Expected text from Text Area.'
WebUI.verifyEqual(Text, 'Your content goes here.')