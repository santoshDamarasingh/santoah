package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility_log4j.Log;



 public class General extends Global {
	
	 
	
	public void openApplication () throws Exception{
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("application is oppened");
		Log.info("Application is opened");
		Thread.sleep(3000);
		}

	public void login()throws Exception{
		driver.findElement(By.name(txt_username)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);
		System.out.println("login is completed");
	}
	
	public void logout()throws Exception{
		driver.findElement(By.linkText(btn_logout)).click();
		Thread.sleep(3000);
		System.out.println("logout completed ");
		
		
	}
	public void closeApplication()throws Exception {
		driver.close();
		Thread.sleep(3000);
		System.out.println("application is closed ");
		 
	}
	
	public void enter_frame()throws Exception {
		driver.switchTo().frame(frm_empInfo);
		Thread.sleep(3000);
		System.out.println("enter in frames");
		
		
	}
	
	public void addNewemp()throws Exception {
		driver.findElement(By.xpath(btn_add)).click();
		driver.findElement(By.name(txt_firstname)).sendKeys(efn);
		driver.findElement(By.name(txt_lastname)).sendKeys(eln);
		driver.findElement(By.xpath(btn_save)).click();
		driver.findElement(By.xpath(btn_back)).click();
		Thread.sleep(3000);
		System.out.println("new emp Added");
		
		Select st = new Select(driver.findElement(By.id("loc_code")));
		st.selectByVisibleText("Emp. ID");
		System.out.println();
		driver.findElement(By.xpath(search)).sendKeys("	3616");
		driver.findElement(By.xpath(search_btn)).click();
		driver.findElement(By.xpath(check_box)).click();
	    driver.findElement(By.xpath(btn_del)).click();
		
		}
	
	
    public void exitframe()throws Exception {
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		System.out.println("  exit from frames");
	}

 }
