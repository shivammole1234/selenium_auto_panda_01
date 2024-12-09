package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Facebook {
    WebDriver driver;

    @Test
    public void login() {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("shivammole123@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Pass@123");
        driver.findElement(By.name("login")).click();
    }

    @Test
    public void Signup()
    {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("Shivam");
        driver.findElement(By.name("lastname")).sendKeys("Mole");
        driver.findElement(By.name("reg_email__")).sendKeys("shivammole123@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Pass@123");
        driver.findElement(By.id("day")).sendKeys("14");
        driver.findElement(By.id("month")).sendKeys("Feb");
        driver.findElement(By.id("year")).sendKeys("2001");
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.tagName("button")).click();
    
    }
    
}
