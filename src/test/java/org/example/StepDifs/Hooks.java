package org.example.StepDifs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import jdk.dynalink.beans.StaticClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;
import org.openqa.selenium.Proxy;


public class Hooks {

    public static WebDriver driver;

    @Before
    public void OpenBrowser(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");

    }
    @After
    public void CloseBrowser() throws InterruptedException {

        Thread.sleep(30000);
       //driver.quit();
    }
}
