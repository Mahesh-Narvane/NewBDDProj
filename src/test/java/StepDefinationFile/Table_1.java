//package StepDefinationFile;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.*;
//
//public class Table_1 
//{
//	WebDriver driver;
//	
//	@Given("launch the browser")
//	public void launch_the_browser() {
//	
//		driver= new ChromeDriver();
//	}
//
//	@Then("enter the url")
//	public void enter_the_url() {
//	   driver.get("http://localhost:8888/index.php?action=Login&module=Users"); //user_password
//	}
//
//	@Then("enter the un and pass")
//	public void enter_the_un_and_pass(DataTable usn, DataTable pwd ) {
//		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).clear();
//		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(usn);
//		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).clear();
//		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(pwd);
//	  
//	}
//
//	@Then("click on login btn")
//	public void click_on_login_btn() {
//	   
//		driver.findElement(By.id("submitButton")).click();
//	}
//
//}
