//package StepDefinationFile;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class Example 
//{
//
//	ChromeDriver driver;	
//
//	@Given("launch the browser")
//	public void launch_the_browser() {
//
//		driver = new ChromeDriver();
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}
//
//	@Then("enter the url")
//	public void enter_the_url() {
//
//		driver.get("https://www.makemytrip.com/");
//		driver.manage().window().maximize();
//	}
//
//	@Given("select start point {string}")
//	public void select_start_point(String start) throws InterruptedException {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
//		driver.findElement(By.id("fromCity")).sendKeys(start);
//
//	}
//
//	@When("select end point {string}")
//	public void select_end_point(String end) throws InterruptedException {
//
//		driver.findElement(By.id("toCity")).sendKeys(end);
//		Thread.sleep(3000);
//	}
//
////	@Then("select no of seat {int}")
////	public void select_no_of_seat(int a) {
////		driver.findElement(By.xpath("//span[.='Travellers & CLASS']")).click();
////		driver.findElement(By.xpath("//div[@class='travellers gbTravellers']//li[text()='"+a+"']")).click();
////	}
//
//	@Then("select no of seat {int}")
//	public void select_no_of_seat(int a) {
//		driver.findElement(By.xpath("//span[.='Travellers & CLASS']")).click();
//		driver.findElement(By.xpath("//div[@class='travellers gbTravellers']//li[text()='"+a+"']")).click();
//	driver.findElement(By.xpath("//button[.='APPLY']")).click();
//	}
//
//
//	//placeholder="To"
//}
