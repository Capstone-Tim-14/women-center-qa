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

Mobile.startApplication('D:\\QE Alterra\\Capstone\\Mobile\\Woman Center.apk', true)

Mobile.tap(findTestObject('Object Repository/Layanan AI/Klik Login'), 0)

Mobile.tap(findTestObject('Object Repository/Layanan AI/Klik form Email'), 0)

Mobile.setText(findTestObject('Object Repository/Layanan AI/Masukkan Email'), 'agung123@gmail.com', 0)

Mobile.tap(findTestObject('Object Repository/Layanan AI/Klik form Password'), 0)

Mobile.setText(findTestObject('Object Repository/Layanan AI/Masukkan Password'), 'agung123', 0)

Mobile.tap(findTestObject('Object Repository/Layanan AI/Klik Button Login'), 0)

Mobile.tap(findTestObject('Object Repository/Layanan AI/Pilih topik favorit'), 0)

Mobile.tap(findTestObject('Object Repository/Layanan AI/Klik Lanjutkan'), 0)

Mobile.tap(findTestObject('Object Repository/Layanan AI/Klik Masih bingung soal karir'), 0)

Mobile.tap(findTestObject('Object Repository/Layanan AI/Klik form enter your question'), 0)

Mobile.setText(findTestObject('Object Repository/Layanan AI/Masukkan pertanyaan'), 'Saran karir', 0)

Mobile.tap(findTestObject('Object Repository/Layanan AI/Klik gambar pesawat'), 0)

Mobile.tap(findTestObject('Object Repository/Layanan AI/Menunggu Respon AI'), 5)

Mobile.closeApplication()
