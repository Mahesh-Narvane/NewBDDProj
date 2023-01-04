package StepDefinationFile;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

//public class Table_2
//{
//	
//	WebDriver driver;
//
//	@Given("launch the browser")
//	public void launch_the_browser() {
//	   
//		//driver = new ChromeDriver();
//		System.out.println("browser launched");
//	}
//
//	@Given("enter the url")
//	public void enter_the_url() {
//	    System.out.println("url entered");
//		
//	}
//
//	@When("enter the mailid un and pwd")
//	public void enter_the_mailid_un_and_pwd(DataTable dataTable) {
//	  
//		List<Map<String, String>> data = dataTable.asMaps();
//		String id = data.get(1).get("mailid");
//		String user = data.get(1).get("username");
//		String pass = data.get(1).get("pwd");
//		
//		System.out.println(id+" "+user+" "+pass);}
//}
//	
