import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import javax.xml.xpath.XPath;

public class WheaterStepDefinitions {
WebDriver webDriver;
    @Given("Open Google Chrome Browser")
    public void openGoogleChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
        webDriver = new ChromeDriver();
        System.out.println("Open browser");
    }

    @And("I select Hourly Forecast Maps")
    public void iSelectHourlyForecastMaps() {
        webDriver.get("https://climatereanalyzer.org");
        System.out.println("Go to website");
    }

    @When("I choose the variable selection menu")
    public void iChooseTheVariableSelectionMenu() {
        webDriver.findElement(By.linkText("Hourly Forecast Maps")).click();
        System.out.println("I choose parameters");
    }

    @And("I select Temperature")
    public void iSelectTemperature() {
        System.out.println("I select temperature");
        Select param_pulldown = new Select(webDriver.findElement(By.id("param_pulldown")));
        param_pulldown.selectByVisibleText("2m Temperature");
        param_pulldown.selectByIndex(0);

    }


    @And("I click on the arrow pointing to the right")
    public void iClickOnTheArrowPointingToTheRight() {
        System.out.println("I run maps");
        webDriver.findElement(By.xpath("//div[@id='wrapper']/div[2]/fieldset/span[3]/img")).click();

    }

    @Then("I see the picture changing")
    public void iSeeThePictureChanging() {
        System.out.println("I see effect");
    }



}
