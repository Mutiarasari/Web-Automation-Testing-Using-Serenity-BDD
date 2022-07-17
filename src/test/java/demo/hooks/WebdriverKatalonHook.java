package demo.hooks;

import demo.webdriver.WebdriverKatalon;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

public class WebdriverKatalonHook {
    @Before(value = "@Web1")
    public void initializeWebdriver() {
        WebdriverKatalon.initialize();
    }

    @After(value = "@Web1")
    public void quitWebdriver(Scenario scenario) {
        if (scenario.isFailed()) {

            try{
                final byte[] data = ((TakesScreenshot) WebdriverKatalon.webdriver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(data, "image/png", "Failed Screenshot");
            } catch (WebDriverException e) {
                e.printStackTrace();
            }

        }
        WebdriverKatalon.quit();
    }
}

