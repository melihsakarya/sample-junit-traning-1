package com.testinium.sample.training.unit;

import com.testinium.sample.training.Matematik;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class SampleTest {

    @Test
    public void sample(){
        Matematik mat = new Matematik();
        int sonuc = mat.topla(2, 2);
        Assert.assertEquals(4, sonuc);
    }

    @Test
    public void webTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com");
        driver.findElement(By.xpath("//*[@data-cy='header-search-input']")).sendKeys("Samsung");
        driver.findElement(By.xpath("//*[@data-cy='search-find-button']")).click();
        driver.quit();
    }
}


//Gittigidiyor.com a başarılı ve başarısız
// Login işlemi gerçekleştiren iki ayrı test yazın
