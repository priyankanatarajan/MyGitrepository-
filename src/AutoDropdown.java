import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public final class AutoDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NareshPirates\\eclipse-workspace\\Downloaded Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
						
		Actions a =new Actions(driver);
		WebElement move = driver.findElement(By.id("autocomplete"));
		a.moveToElement(driver.findElement(By.id("autocomplete"))).click().keyDown(Keys.SHIFT).sendKeys("united").doubleClick().build().perform();
		
		a.moveToElement(move).sendKeys(Keys.DOWN).build().perform();
		a.moveToElement(move).sendKeys(Keys.DOWN).build().perform();
		a.moveToElement(move).sendKeys(Keys.DOWN).build().perform();
		a.moveToElement(move).sendKeys(Keys.DOWN).build().perform();
		a.moveToElement(move).sendKeys(Keys.DOWN).doubleClick().build().perform();
		
	}
}
