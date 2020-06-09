package com.MavenProjectdemo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		System.out.println("selenium is Automation Tool");

			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\Driver\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			d.get("https://accounts.google.com/signup ");
			d.findElement(By.cssSelector("#firstName")).click();
			d.findElement(By.cssSelector("#lastName")).click();
			d.findElement(By.cssSelector("#username")).click();
			String css ="input[type ='password']";
			d.findElement(By.cssSelector(css)).click();
			String CSS ="input[name ='ConfirmPasswd']";
			d.findElement(By.cssSelector(CSS)).click();
			
d.close();
System .out.println("Selenium");
d.quit();

	}

}
