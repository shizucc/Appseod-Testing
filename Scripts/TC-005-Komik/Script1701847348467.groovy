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

Mobile.startApplication('D:\\Appsoed_Pro\\debug\\Appsoed_debug.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (1)'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.ScrollView'), 0)

Mobile.tap(findTestObject('Object Repository/Komik/Tombol Komik'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Komik/List Komik'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Komik/Salah satu komik'), 0)

Mobile.tap(findTestObject('Object Repository/Komik/Tombol Salah satu komik'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Komik/Gambar Dalam Komik'), 0)

Mobile.swipe(0, 1800, 0, 0)

Mobile.closeApplication()

