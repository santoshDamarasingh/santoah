package com.hrms.testScript;


import com.hrms.lib.General;

public class TC003{
	public static void main(String[] args) throws Exception {
		General g = new General();
		g.openApplication();
		g.login();
		g.addNewemp();
		//g.editEmp();
        g.logout();
		g.closeApplication();
		
	}
	
	
	

}
