package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DmoOpenCart {

    WebDriver driver;

    @Test
    public void login() {
        driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        String act_title= driver.getTitle();
        if(act_title.equals("Your Store"))
            System.out.println("title test passwed");
        else
            System.out.println("test failed");
    }

    @Test
    public void locatars(){
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://automationpanda.com/");
        driver1.manage().window().maximize();
        //driver1.findElement(By.name("search")).sendKeys("proteins");
     driver1.findElement(By.linkText("TEACHING")).click();
     driver1.findElement(By.id("subscribe-field")).sendKeys("shivam12@gmail.com");
     driver1.findElement(By.className("wp-block-button__link")).click();
     // driver1.switchTo().alert().accept();

     // driver1.findElement(By.linkText("Organic Foods")).click();
     // driver1.findElement(By.linkText("add to cart")).click();

    }
}
