package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonLeafGround {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.id("home")).click();
	    driver.navigate().back();
	    WebElement box1=driver.findElement(By.id("position"));
		System.out.println("The Position is:"+ box1.getLocation());
		WebElement box2=driver.findElement(By.id("color"));
		System.out.println("The Color is :"+ box2.getCssValue("background-color"));
		WebElement box3=driver.findElement(By.id("size"));
		System.out.println("The Size is:"+ box3 .getSize());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
