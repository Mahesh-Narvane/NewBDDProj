package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	
	@Before(order=10)
	public void beforehook() 
	{
		
		System.out.println("beforehok");
		
	}
	
	@After(order=100)
	public void afterhook() 
	{
		
		
		System.out.println("afterhook");
		
	}
	@Before(order=100)
	public void setuphook() 
	{
		
		System.out.println("setuphook");
		
	}
	
	@After(order=1000)
	public void closehook() 
	{
		
		System.out.println("closehook");
		
	}
	
	
	
	
	
}
