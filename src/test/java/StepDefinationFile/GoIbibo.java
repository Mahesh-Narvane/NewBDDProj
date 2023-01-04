//package StepDefinationFile;
//
//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//import java.time.Duration;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import io.cucumber.java.en.*;
//
//public class GoIbibo
//{
//
//	ChromeDriver driver;
//
//	@Given("launch the browser")
//	public void launch_the_browser() {
//
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}
//
//	@Then("enter the url")
//	public void enter_the_url() {
//		driver.get("https://www.goibibo.com/");
//
//	}
//
//	@Given("select start point {string}")
//	public void select_start_point(String str) throws InterruptedException, AWTException {
//
//		//driver.findElement(By.xpath("//p[@class=\"sc-jlwm9r-1 dRQhOp\"]")).click();
//		driver.findElement(By.xpath("//span[.='From']")).click(); 
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(str);
//		Thread.sleep(3000);
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//
//
//	}
//
//	@When("select end point {string}")
//	public void select_end_point(String s) throws AWTException, InterruptedException {
//
//
//
//		WebElement elem = driver.findElement(By.xpath("//input[@type='text']"));
//		elem.sendKeys(s);
//		Thread.sleep(2000);
//
//		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//span[@class='autoCompleteTitle ']"));
//
//		for (int i = 0; i < list.size(); i++) 
//		{
//			String test=list.get(i).getText();	
//			System.out.println(test);
//			if(test.equalsIgnoreCase(s)) 
//			{
//				System.out.println(test);
//				list.get(i).click();
//				break;
//			}
//		}
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
//
//			
//			}
//		
////		WebElement to=driver.findElement(By.xpath("//span[.='Kolkata, India']"));
////		JavascriptExecutor	js= (JavascriptExecutor)driver;
////		js.executeScript("arguments[0].click();",to);
//		//	 Robot r = new Robot();
//		//	 r.keyRelease(0);
//
//	
//
//
//
//	@Then("select no of seat {int}")
//	public void select_no_of_seat(Integer int1) throws InterruptedException, AWTException {
//
//
//               driver.findElement(By.xpath("//p[.='1 Adult']")).click();
//		//	 Thread.sleep(2000);
//		//	 Robot r = new Robot();
//		//	 r.keyPress(KeyEvent.VK_ENTER);
//		//By.xpath("//p[.='1 Adult']"))
//
//	}
//
//
//
//
//}
