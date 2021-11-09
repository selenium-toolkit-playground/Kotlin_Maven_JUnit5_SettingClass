package com.seleniumToolkit.selenium.pageObject

import com.seleniumToolkit.selenium.pageObject.template.AbstractSeleniumToolkitPageObject
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

//PO generated by SeleniumToolkit-Extension
class Showcase : AbstractSeleniumToolkitPageObject() {
    val URL = "/showcase/"

    //Field declarations
    @FindBy(xpath = "//*[@aria-controls='tab-Configuration']")
    var tabConfiguration: WebElement? = null

    @FindBy(xpath = "//*[@aria-controls='tab-CreateTestMethod']")
    var tabCreateTestMethod: WebElement? = null

    @FindBy(xpath = "//*[@aria-controls='tab-TestData']")
    var tabTestData: WebElement? = null

    @FindBy(xpath = "//*[@aria-controls='tab-GetWebdriver']")
    var tabGetWebdriver: WebElement? = null

    @FindBy(xpath = "//*[@aria-controls='tab-TakeScreenshots']")
    var tabTakeScreenshots: WebElement? = null

    @FindBy(xpath = "//*[@aria-controls='tab-AddExtraReportSteps']")
    var tabAddExtraReportSteps: WebElement? = null

    @FindBy(xpath = "//*[@aria-controls='tab-GenerateReport']")
    var tabGenerateReport: WebElement? = null

    @FindBy(xpath = "//*[@aria-controls='tab-NeoloadBridge']")
    var tabNeoloadBridge: WebElement? = null

    //HelperMethods
    fun clickTabConfiguration() {
        click(tabConfiguration!!)
    }

    fun clickTabCreateTestMethod() {
        click(tabCreateTestMethod!!)
    }

    fun clickTabTestData() {
        click(tabTestData!!)
    }

    fun clickTabGetWebdriver() {
        click(tabGetWebdriver!!)
    }

    fun clickTabTakeScreenshots() {
        click(tabTakeScreenshots!!)
    }

    fun clickTabAddExtraReportSteps() {
        click(tabAddExtraReportSteps!!)
    }

    fun clickTabGenerateReport() {
        click(tabGenerateReport!!)
    }

    fun clickTabNeoloadBridge() {
        click(tabNeoloadBridge!!)
    }
}