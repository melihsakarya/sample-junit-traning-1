package com.testinium.sample.training.unit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver = null;

    @Before
    public void baslangic(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com");
    }

    @After
    public void bitis(){
        driver.quit();
    }

}
