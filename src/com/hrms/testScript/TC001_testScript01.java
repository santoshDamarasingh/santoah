package com.hrms.testScript;

import org.apache.log4j.xml.DOMConfigurator;

import com.hrms.lib.General;

public class TC001_testScript01 {
	public static void main(String[] args) throws Exception {
		 DOMConfigurator.configure("log4j.xml");
		General g = new General();
		g.openApplication();
		g.login();
		g.logout();
		g.closeApplication();
		
		
		
		
		
	}

}
