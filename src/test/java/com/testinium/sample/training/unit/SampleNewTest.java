package com.testinium.sample.training.unit;

import org.junit.After;
import org.junit.Assert;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;


public class SampleNewTest extends BaseTest{

    @Test
    public void webTest1(){
        driver.findElement(By.xpath("//*[@data-cy='header-search-input']")).sendKeys("Samsung");
        driver.findElement(By.xpath("//*[@data-cy='search-find-button']")).click();
    }

    @Test
    public void webTest2(){
        //Assert.assertEquals("GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi", driver.getTitle());
        //Assert.assertTrue(driver.getTitle().contains("GittiGidiyor"));
        assertTrue(driver.getTitle().contains("GittiGidiyor"));

        assertThat(driver.getTitle(), is(containsString("GittiGidiyor")));
        assertThat(driver.getTitle(), equalToIgnoringCase("gittiGidiyor - türkiye'nin Öncü Alışveriş Sitesi"));



    }



}
