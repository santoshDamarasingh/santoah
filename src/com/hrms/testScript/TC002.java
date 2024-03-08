package com.hrms.testScript;

import com.hrms.lib.General;

public class TC002 {
	public static void main(String[] args)throws Exception {
		General g = new General();
		g.openApplication();
		g.login();
		g.enter_frame();
		g.addNewemp();
	//	g.editBtn();
		g.exitframe();
		g.logout();
		g.closeApplication();
		
	}

}
