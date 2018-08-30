package com.sample.test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task2 {

	
		// TODO Auto-generated method stub
		
		public static WebDriver driver;
		@BeforeMethod
		
		public void configBM()
		{
			 driver=new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().window().maximize();
			driver.get("http://live.guru99.com/index.php/");
		}
		@Test
		public void VerifyTheCostOfTheProduct()
		{
			//click on mobile menu
			driver.findElement(By.xpath("//a[text()='Mobile']")).click();
			//capture thecost of sony Xperia
			String cost1=driver.findElement(By.xpath("//span[@id='product-price-1']/span")).getText();
			//click on sony Xperia
			driver.findElement(By.id("product-collection-image-1")).click();
			//read the cost of sony Xperia mob
			String cost2=driver.findElement(By.xpath("//span[@class='price']")).getText();
			//compare both the costs of the mob
			Assert.assertEquals(cost1, cost2);
		}
@AfterMethod
		
		public void configAM()
		{
	driver.close();
		}
		
		
		
		

	

}
