import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NareshPirates\\eclipse-workspace\\Downloaded Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Nested Frames")).click();
		System.out.println(driver.findElement(By.tagName("frameset")).getSize());
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		String text = driver.findElement(By.id("content")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
		
		
		
		
		
	}

}
