import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eengineers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//Aditya//Desktop//Selenium//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
			
		driver.get("https://www.rbc.ru");
		
		driver.findElement(By.className("topline__search__menu__link")).click();
		
		driver.findElement(By.cssSelector("input.topline__search__input.js-search-input")).sendKeys("пня");
		
		driver.findElement(By.xpath("//input[contains(@class,'topline__search__button')]")).click();
		
		

	}

}
