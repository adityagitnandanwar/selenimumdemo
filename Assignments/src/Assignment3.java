import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//Aditya//Desktop//Selenium//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/a[2]")).click();

		WebDriverWait d = new WebDriverWait(driver, 10);

		d.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='results']")));
		
		System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());
		
		
	}

}
