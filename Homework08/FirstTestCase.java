package Homework08;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FirstTestCase {
    public static void main(String[] args) throws InterruptedException {
        //Initialize WebDriver Object
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\digger\\IdeaProjects\\JQALearn\\src\\main\\resources\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        //Maximize window and open URL
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html?m=1");

        //Accept cookies (button)
        driver.findElement(By.id("ez-accept-necessary")).click();
        //driver.findElement(By.cssSelector("button#ez-accept-necessary")).click();
        //driver.findElement(By.xpath("//button[text()='Allow Necessary Cookies & Continue']")).click();
        //driver.findElement(By.xpath("//*[contains(text(),'Necessary Cookies')]")).click();

        //Enter First name (textbox)
        driver.findElement(By.name("firstname")).sendKeys("John");
        //driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("John");

        //Enter Last name (textbox)
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        //driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Smith");

        //Select Gender (radio button)
        driver.findElement(By.id("sex-0")).click();
        //driver.findElement(By.cssSelector("input[value='Male']")).click();
        //driver.findElement(By.xpath("//*[@type='radio'][@value='Male']")).click();

        //Select Years of Experience (radio button)
        driver.findElement(By.id("exp-2")).click();
        //driver.findElement(By.cssSelector("input#exp-2")).click();
        //driver.findElement(By.cssSelector("input[value='3']")).click();

        //Scroll down the webpage by 1000 pixels
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,1000)");

        //Enter Date
        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("10-06-24");
        Thread.sleep(2000);
        date.clear();
        date.sendKeys("28-11-24");

        //Select Profession (checkbox)
        driver.findElement(By.id("profession-1")).click();
        //driver.findElement(By.cssSelector("input[value='Automation Tester']")).click();

        //Select Automation tools you are familiar with (multiple checkboxes)
        List<WebElement> tools = driver.findElements(By.name("tool"));

        Actions act = new Actions(driver);
        act.click(tools.get(1)).click(tools.get(2)).build().perform();

        //Select Continent (select box)
        driver.findElement(By.xpath("//option[. = 'Europe']")).click();
        //driver.findElement(By.xpath("//*[@id='continents']/option[2]")).click();
        //driver.findElement(By.cssSelector("#continents > option:nth-child(2)")).click();

        System.out.println("Selected continent is: ");
        System.out.println(driver.findElement(By.xpath("//option[. = 'Europe']")).getText());

        //Select multiple commands from a multi-select box
        WebElement dropDown = driver.findElement(By.id("selenium_commands"));

        Select commands = new Select(dropDown);
        commands.selectByIndex(2);
        commands.selectByVisibleText("WebElement Commands");

        System.out.println("Selected commands are: ");
        List<WebElement> selectedCommands = commands.getAllSelectedOptions();
        for (WebElement selCom:selectedCommands) {
            System.out.println(selCom.getText());
        }

        //Upload image (button)
        driver.findElement(By.id("photo")).sendKeys("C:\\Users\\digger\\Downloads\\sampleFile.jpeg");
        //driver.findElement(By.name("photo")).sendKeys("C:\Users\digger\Downloads\sampleFile.jpeg");
        //driver.findElement(By.className("input-file")).sendKeys("C:\Users\digger\Downloads\sampleFile.jpeg");
        //driver.findElement(By.cssSelector("input.input-file")).sendKeys("C:\Users\digger\Downloads\sampleFile.jpeg");
        //driver.findElement(By.xpath("//*[@type='file']")).sendKeys("C:\Users\digger\Downloads\sampleFile.jpeg");

        //Click on Submit button
        driver.findElement(By.id("submit")).click();
        //driver.findElement(By.name("submit")).click();
        //driver.findElement(By.className("class='btn btn-info'")).click();
        //driver.findElement(By.cssSelector("button.btn.btn-info")).click();
        //driver.findElement(By.cssSelector("[class$='btn-info']")).click();
        //driver.findElement(By.xpath("//*[contains(@class,'btn-info')]")).click();
        //driver.findElement(By.xpath("//button[text()='Button']")).click();

        driver.close();
    }
}
