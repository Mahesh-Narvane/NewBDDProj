package StepDefinationFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginSDF {
	
	//WebDriver driver;
    

	@Given("launch the browser")
	public void launch_the_browser() {
	
		//driver= new ChromeDriver();
		System.out.println(" browser launched");
	}

	@Then("enter the url")
	public void enter_the_url() {
	  
		//driver.get("http://localhost:8888/");
		System.out.println(" url launched");
	}

	
	@Then("validate home page us displayed or not")
	public void validate_home_page_us_displayed_or_not() {
		
	//	Assert.assertEquals(false, false);
		System.out.println(" homepage get loaded");
	   
	}

	@Then("enter the un")
	public void enter_the_un() {
	    
		//driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		System.out.println("un get entered");
	}

	@Then("enter the pwd")
	public void enter_the_pwd() {
	 
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		System.out.println("pwd get entered");
	 
	}

	@Then("click on login button")
	public void click_on_login_button() {
	   
		//driver.findElement(By.id("submitButton")).click();
		System.out.println("login btn get clicked");
	}

	@Then("validate home page is displayed or not")
	public void validate_home_page_is_displayed_or_not() {
	    
		//Assert.assertEquals(false, false);
		System.out.println("home page get displayed");
	}

	@Then("enter the username {string}")
	public void enter_the_username(String string) {
	 
		//driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(string);
		System.out.println("username get enterned");
	}

	@Then("enter the password {string}")
	public void enter_the_password(String string) {
	   
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys(string);
		System.out.println("password get entered");
		
	}
	
	
}