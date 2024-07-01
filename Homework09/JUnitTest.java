package Homework09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class JUnitTest extends StartAndCloseDriver {

    @Test
    public void verifyPracticeForm() throws InterruptedException {
        String expectedURL = testURL;
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals("URL does not match", expectedURL, actualURL);
        //Assert.assertTrue("URL does not match", expectedURL.equals(actualURL));
        Assert.assertNotSame(expectedURL, actualURL);

        //Accept cookies (button)
        WebElement acceptCookiesBtn = driver.findElement(By.id("ez-accept-necessary"));
        String expectedAcceptCookiesBtn = "Allow Necessary Cookies & Continue";
        String actualAcceptCookiesBtn = acceptCookiesBtn.getText();

        Assert.assertNotNull(acceptCookiesBtn);
        Assert.assertTrue(actualAcceptCookiesBtn + " button is not displayed", acceptCookiesBtn.isDisplayed());
        Assert.assertTrue(actualAcceptCookiesBtn + " button is not enabled", acceptCookiesBtn.isEnabled());
        Assert.assertEquals("Title of accept cookies button does not match", expectedAcceptCookiesBtn, actualAcceptCookiesBtn);

        acceptCookiesBtn.click();

        //Enter First name (text box)
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("John");
        String actualFirstName = firstName.getAttribute("value");

        Assert.assertNotNull(firstName);
        Assert.assertTrue(firstName.isEnabled());
        Assert.assertEquals("Expected and actual first name do not match", "John", actualFirstName);
        //Assert.assertTrue("Expected and actual first name do not match", actualFirstName.equalsIgnoreCase("john") );

        //Enter Last name (text box)
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Smith");
        String actualLastName = lastName.getAttribute("value");

        Assert.assertNotNull(actualLastName);
        Assert.assertTrue(lastName.isEnabled());
        Assert.assertNotEquals("Expected and actual last name match", "smith", actualLastName);
        //Assert.assertFalse("Expected and actual last name match", actualLastName.equals("smith"));

        //Select Gender (radio button)
        WebElement maleRadioBtn = driver.findElement(By.id("sex-0"));
        String actualRadioBtn = maleRadioBtn.getAttribute("value");

        Assert.assertTrue(actualRadioBtn + " radio button in not displayed", maleRadioBtn.isDisplayed());
        maleRadioBtn.click();
        Assert.assertTrue(actualRadioBtn + " radio button is not selected", maleRadioBtn.isSelected());
        Assert.assertEquals("Expected and actual gender do not match", "Male", actualRadioBtn);
        //Assert.assertFalse(actualRadioBtn.equalsIgnoreCase("female"));

        //Select Years of Experience (radio button)
        WebElement yearsOfExperience = driver.findElement(By.id("exp-2"));
        yearsOfExperience.click();

        Assert.assertTrue("\"Years Of Experience\" radio button is not selected", yearsOfExperience.isSelected());
        Assert.assertEquals("Expected and actual years of experience do not match", "3", yearsOfExperience.getAttribute("value"));

        //Scroll down the webpage by 1000 pixels
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,1000)");

        //Enter Date
        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("10-06-24");
        Thread.sleep(2000);
        date.clear();
        date.sendKeys("28-11-24");

        Assert.assertNotNull(date);
        Assert.assertTrue("\"Date\" text field is not displayed", date.isDisplayed());
        Assert.assertEquals("28-11-24", date.getAttribute("value"));

        //Select Profession (checkbox)
        WebElement autoTester = driver.findElement(By.id("profession-1"));

        Assert.assertTrue((autoTester.getAttribute("value")) + " option is not enabled", autoTester.isEnabled());
        autoTester.click();
        Assert.assertTrue((autoTester.getAttribute("value")) + " option is not selected", autoTester.isSelected());
        Assert.assertEquals("Expected and actual profession do not match", "Automation Tester", autoTester.getAttribute("value"));
        //Assert.assertFalse((autoTester.getAttribute("value")).contains("Manual"));

        //Select Automation tools you are familiar with (multiple checkboxes)
        List<WebElement> tools = driver.findElements(By.name("tool"));

        Actions act = new Actions(driver);
        act.click(tools.get(1)).click(tools.get(2)).build().perform();

        Assert.assertFalse("Tools list is empty ", tools.isEmpty());
        Assert.assertEquals("Selenium IDE", tools.get(1).getAttribute("value"));
        Assert.assertTrue(tools.get(1).getAttribute("value") + " is not selected", tools.get(1).isSelected());

        Assert.assertEquals("Selenium Webdriver", tools.get(2).getAttribute("value"));
        Assert.assertTrue(tools.get(2).getAttribute("value") + " is not selected", tools.get(2).isSelected());

        //Select Continent (select box)

        Select continents = new Select(driver.findElement(By.cssSelector("select#continents")));
        continents.selectByVisibleText("Europe");
        String selectedContinent = continents.getFirstSelectedOption().getText();

        Assert.assertFalse(continents.isMultiple());
        Assert.assertNotNull(selectedContinent);
        Assert.assertEquals("Expected and actual selected continent do not match","Europe", selectedContinent);
        //Assert.assertTrue("Expected and actual selected continent do not match",selectedContinent.equalsIgnoreCase("europe"));

        //Select multiple commands from a multi-select box
        WebElement dropDown = driver.findElement(By.id("selenium_commands"));

        Select commands = new Select(dropDown);
        commands.selectByIndex(2);
        commands.selectByVisibleText("WebElement Commands");

        List <WebElement> selectedCommands = commands.getAllSelectedOptions();

        Assert.assertTrue(commands.isMultiple());
        Assert.assertFalse("The list with selected commands is empty", selectedCommands.isEmpty());
        Assert.assertEquals("Expected and actual selected commands do not match", "Switch Commands", selectedCommands.get(0).getText());
        Assert.assertEquals("Expected and actual selected commands do not match", "WebElement Commands", selectedCommands.get(1).getText());

        //Upload image (button)
        WebElement photo = driver.findElement(By.id("photo"));
        photo.sendKeys("C:\\Users\\digger\\Downloads\\sampleFile.jpeg");

        Assert.assertTrue(photo.isDisplayed());
        Assert.assertTrue(photo.isEnabled());
        Assert.assertFalse(photo.isSelected());
        Assert.assertEquals("C:\\fakepath\\sampleFile.jpeg", photo.getAttribute("value"));
        //Assert.assertTrue("Expected and actual uploaded file do not match", (photo.getAttribute("value")).contains("sampleFile.jpeg"));

        //Click on Submit button
        WebElement submitBtn = driver.findElement(By.id("submit"));
        String actualSubmitBtn = submitBtn.getText();
        submitBtn.click();

        Assert.assertTrue( actualSubmitBtn + " is not displayed", submitBtn.isDisplayed());
        Assert.assertTrue(actualSubmitBtn + " is not enabled", submitBtn.isEnabled());
        Assert.assertTrue("Expected and actual submit button title do not match", actualSubmitBtn.equalsIgnoreCase("button"));
        //Assert.assertEquals("Expected and actual submit button title do not match", "Button", actualSubmitBtn);
    }
}