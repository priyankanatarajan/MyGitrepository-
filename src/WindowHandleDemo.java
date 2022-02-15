import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NareshPirates\\eclipse-workspace\\Downloaded Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		Set <String> windows=driver.getWindowHandles();
		Iterator <String> its = windows.iterator();
		String parentId= its.next();
		String childId1= its.next();
		driver.switchTo().window(childId1);
		
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(parentId);
        System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
		
       		
		
		
		
		
		
		
		
		
	}

}
