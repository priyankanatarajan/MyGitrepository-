import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NareshPirates\\eclipse-workspace\\Downloaded Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		driver.findElement(By.xpath("//div[4]/fieldset/label[2]/input")).click();
		driver.findElement(By.xpath("//div[4]/fieldset/label[2]/input")).isEnabled();
		String value = driver.findElement(By.xpath("//div[4]/fieldset/label[2]")).getText();
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select sel = new Select(dropdown);
		sel.selectByVisibleText(value);
		
		driver.findElement(By.xpath("//input[@id='name']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(value);
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		//driver.findElement(By.cssSelector("input[id='confirmbtn']")).click();
		String text=driver.switchTo().alert().getText();
		if(text.contains(value))
		{
			System.out.println("Success");
		}
			else
			{	
			System.out.println("Failure");	
		}
	}
		
	}


