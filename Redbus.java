package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("src")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.id("src")).click();
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.id("dest")).click();
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//td[@class='current day']/following-sibling::td[1]")).click();
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='icon icon-close c-fs']")).click();
		Thread.sleep(30000);
		String text=driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
		System.out.println("There are" + text+"are Found");
		driver.findElementByXPath("//label[@for='bt_SLEEPER'][1]").click();
		String text1 = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
		System.out.println("There are " + text1 + " are Found");
		driver.findElementByXPath("//label[@for='bt_AC' and @class='cbox-label']").click();
		String text2 = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
		System.out.println("There are " + text2 + " are Found");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
