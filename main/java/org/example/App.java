package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://automationpanda.com/");
        driver1.manage().window().maximize();
        //driver1.findElement(By.name("search")).sendKeys("proteins");

        List<WebElement> header_link= driver1.findElements(By.className("menu-item"));
        System.out.println("total number of menu item are :- "+header_link.size());

        List<WebElement> image=driver1.findElements(By.tagName("img"));
        System.out.println("total  image on webpage are :- "+image.size());

    }
}
