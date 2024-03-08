package com.hrms.lib;

import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.By;



public class Global{
	 public WebDriver driver;
	 
	 public String url ="http://183.82.103.245/nareshit/login.php";
	 public String un = "nareshit";
	 public String pw ="nareshit";
	 public String efn = "santosh";
	 public String eln = "selenium";
	 //public String emp_id ="3448";
	 
	 		
	 
	 //////object element method
	 public String txt_username ="txtUserName";
	 public String txt_password ="txtPassword";
	 public String btn_login = "Submit";
	 public String btn_logout = "Logout";
	 public String frm_empInfo = "rightMenu";
	 public String btn_add = "//input[@value='Add']";
	 public String txt_firstname = "txtEmpFirstName";
	 public String txt_lastname ="txtEmpLastName";
	 public String btn_save="//input[@type='button'][@value='Save']";
	 public String btn_edit="//input[@id='btnEditPers']";
	 public String btn_back = "//input[@value='Back']";
	 public String search ="//input[@id='loc_name']";
	 public String search_btn ="//input[@value='Search'][@type='button']";
	 public String check_box = "//input[@id='allCheck']";
	 
	
	 public String btn_del ="//input[@type='button'][@value='Delete']";
	 
	 
	 
	 	}
