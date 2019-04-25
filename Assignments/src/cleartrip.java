import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;

public class cleartrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Aditya\\Desktop\\Selenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver ();
		
		driver.get("https://www.cleartrip.com");
		
		Thread.sleep(5000);

		driver.findElement(By.id("DepartDate")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight ")).click();
		
		Select s=new Select(driver.findElement(By.id("Adults")));
		
		s.selectByIndex(4);
		
        Select c=new Select(driver.findElement(By.id("Childrens")));
		
		c.selectByIndex(2);
		
		Select i= new Select (driver.findElement(By.id("Infants")));
	
	    i.selectByIndex(1);
	    
	    
	    driver.findElement(By.linkText("More options: Class of travel, Airline preference")).click();
	    
	    
	    
	    Select CL= new Select(driver.findElement(By.id("Class")));
	    
	    CL.selectByValue("First");
	    
	    driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Spicejet");
	    
	    driver.findElement(By.id("SearchBtn")).click();
	    
	    System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	
	}

}
