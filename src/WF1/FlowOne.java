package WF1;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FlowOne {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aditya\\Desktop\\Selenium\\Chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
		
	if(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).getAttribute("class").contains("Select-label1"))
	{
		System.out.print("roundtrip");
	}
	else
	 {
		System.out.print("flase");
	 }
	driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[contains(@value,'IXM')][1]")).click();
	driver.findElement(By.xpath("(//a[@value='BHO'])[2]")).click();
	
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	
	System.out.print(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
	
	driver.findElement(By.id("divpaxinfo")).click();
    
   int i;
	
	for(i=0;i<3;i++)
	{
		driver.findElement(By.id("hrefIncAdt")).click();
		
	}
	
	driver.findElement(By.id("btnclosepaxoption")).click();
	
	
	 Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	 
	 
	s.selectByIndex(2);
	
	driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	
	
	}

}
