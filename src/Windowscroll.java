import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowscroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NareshPirates\\eclipse-workspace\\Downloaded Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
			
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		
		List<WebElement> rows = driver.findElements(By.xpath("//fieldset/table/tbody/tr"));
		System.out.println(rows.size());
		List<WebElement> columns = driver.findElements(By.tagName("tbody"));
		System.out.println(columns.size());
		String row= driver.findElement(By.xpath("//fieldset/table/tbody/tr[4]")).getText();
		System.out.println(row);
		
		
		
	}

}
