package Homework09;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StartAndCloseDriver {
    protected static WebDriver driver;
    protected static String testURL = "https://www.techlistic.com/p/selenium-practice-form.html?m=1";

    @BeforeClass
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\digger\\IdeaProjects\\JQALearn\\src\\main\\resources\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(testURL);
    }

    @AfterClass
    public static void closeBrowser() {
        if (driver != null)
        {
            driver.quit();
        }
    }
}