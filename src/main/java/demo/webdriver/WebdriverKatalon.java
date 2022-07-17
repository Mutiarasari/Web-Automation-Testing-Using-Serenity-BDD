package demo.webdriver;

import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

public class WebdriverKatalon {

    public static WebDriver webdriver;

    public static void initialize()  {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--incognito", "--start-maximized");
        option.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        webdriver = new ChromeDriver(option);
        webdriver.manage().window().maximize();
        webdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webdriver.get("https://katalon-demo-cura.herokuapp.com/");
        webdriver.manage().deleteAllCookies();
    }

    public static void quit() {
        webdriver.quit();
    }
}
