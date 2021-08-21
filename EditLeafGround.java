package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		WebElement one = driver.findElement(
				By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input"));
		one.sendKeys("TEXT");
		one.sendKeys(Keys.TAB);
WebElement two=driver.findElement(By.name("username"));
System.out.println(two.getAttribute("value"));
driver.findElementByXPath("(//input[@type='text'])[4]").click();
WebElement three=driver.findElementByXPath("(//input[@type='text'])[5]");
if (three.isEnabled()) {
	System.out.println("Edit field is Enabled");
}
else {
	System.out.println("Edit field is Not Enabled"); 
}

	}

}


