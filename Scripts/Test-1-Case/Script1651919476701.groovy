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

WebUI.navigateToUrl('https://nk-gke-test.gcp.workmap.ai/#/forms/5/rvcxhup3cxa1kdufw9kf9v1cm6lsgec7')

WebUI.setText(findTestObject('Object Repository/Page_Workmap/input_Name_ant-input'), 'Test N1')

WebUI.click(findTestObject('Object Repository/Page_Workmap/input_Name_ant-input'))

WebUI.setText(findTestObject('Object Repository/Page_Workmap/input_Name_ant-input'), '')

WebUI.click(findTestObject('Object Repository/Page_Workmap/svg'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/div_18'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/input_Birth Date_ant-calendar-picker-input _da2e37'))

WebUI.setText(findTestObject('Object Repository/Page_Workmap/input_Birth Date_ant-calendar-picker-input _da2e37'), '18-05-2002')

WebUI.click(findTestObject('Object Repository/Page_Workmap/span_Select'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_Production'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/span_Select'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_Yes'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/span_Add New'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/span_Select'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_Site3'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/svg_1'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/td_12'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/a_select time'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_21'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_30'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/a_Ok'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Done'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Submit'))

