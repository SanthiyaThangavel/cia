package com.example.dayone.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CIA1_1 {
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
		
		ChromeOptions co=new ChromeOptions(); 
		co.addArguments("--remote-allow-origins=*");
		
	    WebDriver driver = new ChromeDriver(co);
			
	    driver.get("https://www.amazon.in/Living-Black-Metal-Photo-Frame/dp/B0BN8J16K1/ref=sr_1_4_sspa?crid=2AQGVNI3K8M90&keywords=photo+frame+gifts&qid=1683194348&sprefix=photoframe+gifts%2Caps%2C948&sr=8-4-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		
		driver.manage().window().maximize();
		
		System.out.print(driver.getTitle());

		String title = driver.getTitle();
	    String etitle =  "Pure Home and Living Black & Gold Metal Photo Frame : Amazon.in: Home & Kitchen";
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("8148372330",Keys.ENTER);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("TGSS@2611",Keys.ENTER);
	    System.out.println(title);
	    if(title.equals(etitle)) {
	    	System.out.println("Title is matched");
	    }
	    else {
	    	System.out.println("Title Mismatched");
	    }
	    driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	    Thread.sleep(5000); 
	    Boolean present = driver.findElement(By.xpath("//*[@id=\"sw-atc-details-single-container\"]")).isDisplayed();
	    System.out.println("Item added to cart:" + present);
	    driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@value=\"Delete\"]")).click();
	    Thread.sleep(2000);
	    String removeText = driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div[1]/div/h1")).getText();
	    String extext = "Your Amazon Cart is empty.";
	    if(removeText.equals(extext)) {
	    	System.out.println("Product is removed from the cart");
	    }
	    Thread.sleep(4000);

	    driver.get("https://www.amazon.in/Living-Black-Metal-Photo-Frame/dp/B0BN8J16K1/ref=sr_1_4_sspa?crid=2AQGVNI3K8M90&keywords=photo+frame+gifts&qid=1683194348&sprefix=photoframe+gifts%2Caps%2C948&sr=8-4-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	    Thread.sleep(2000);
	    driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"quantity_2\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@name=\"proceedToRetailCheckout\"] "));
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
	    Thread.sleep(1000);
	    System.out.print("Success");
	}
}
