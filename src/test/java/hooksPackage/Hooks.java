package hooksPackage;

import io.cucumber.java.*;

public class Hooks {
	
	@Before(order=1)
	public void launchBrowser()
	{
		System.out.println("Launch browser before scenario");
		
	}
	
	@Before(order=0)
	public void DBconnection()
	{
		System.out.println("Db Connect before scenario");
	}
	
	@Before (order=2)
	public void Login()
	{
		System.out.println("login before scenario");
	}
	
	@After(order=2)
	public void logout()
	{
	System.out.println("Logout after scenario");	
	}
	
	@After(order=1)
	public void closebrowser()
	{
	System.out.println("Closing the browser after scenario");	
	}
	
	@After(order=0)
	public void disconnectDB()
	{
	System.out.println("Disconnect database after scenario");	
	}

}
