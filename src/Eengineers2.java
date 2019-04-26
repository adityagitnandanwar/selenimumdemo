import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Eengineers2

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//Aditya//Desktop//Selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rbc.ru");

		driver.findElement(By.className("topline__search__menu__link")).click();

		driver.findElement(By.cssSelector("input.topline__search__input.js-search-input")).sendKeys("рррр");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[contains(@class,'topline__search__button')]")).click();

		WebElement text = driver.findElement(By.xpath("//div[@class='g-nofound']"));

		System.out.println(text.getText());

		Assert.assertTrue(true, "По вашему запросу ничего не найдено, вы можете изменить указанные параметры");

	}

}
