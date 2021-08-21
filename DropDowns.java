package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// dropdown1
		WebElement Drop1 = driver.findElement(By.id("dropdown1"));
		Select dropdown1 = new Select(Drop1);
		dropdown1.selectByVisibleText("Selenium");
		// dropdown2
		WebElement Drop2 = driver.findElement(By.name("dropdown2"));
		Select dropdown2 = new Select(Drop2);
		dropdown2.selectByVisibleText("Appium");
		// dropdown3
		WebElement Drop3= driver.findElement(By.id("dropdown3"));
		Select dropdown3= new Select(Drop3);
		dropdown3.selectByVisibleText("UFT/QTP");
		// dropdown4
		WebElement Drop4 = driver.findElement(By.className("dropdown"));
		Select dropdown4 = new Select(Drop4);
		dropdown4.selectByVisibleText("Loadrunner");
	}

}
