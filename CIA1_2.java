package com.example.dayone.testing;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CIA1_2 {

	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.addArguments ("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup ();
		WebDriver driver=new ChromeDriver(co);
		driver.get ("https://www.amazon.in/");
		driver.manage().window().maximize() ;
		String currentTitle=driver.getTitle();
		System.out.println(currentTitle);
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(currentTitle.equals(expectedTitle)) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title not Matched");
		}
		WebElement txtBoxl=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		txtBoxl.sendKeys("keychain");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		String txt1=driver.findElement(By.xpath("//*[@id=\"CardInstanceYuuWTd8aD4YAoeWLpgg2kQ\"]/div[1]/div[2]/div[1]/div/div[2]/a/span/span[2]")).getText();
		System.out.println(txt1);
		String txt2=driver.findElement(By.xpath("//*[@id=\"CardInstanceYuuWTd8aD4YAoeWLpgg2kQ\"]/div[1]/div[2]/div[2]/div/div[2]/a/span/span[2]")).getText();
		System.out.println(txt2);
		String txt3=driver.findElement(By.xpath("//*[@id=\"CardInstanceYuuWTd8aD4YAoeWLpgg2kQ\"]/div[1]/div[2]/div[3]/div/div[2]/a/span/span[2]")).getText();
		System.out.println(txt3);
		//filter
		driver.findElement(By.xpath("//*[@id=\"p_36/7252032031\"]/span/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"p_n_pattern_browse-bin/1464446031\"]/span/a/span")).click();
	}
}
