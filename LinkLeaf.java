package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByLinkText("Go to Home Page").click();
		driver.navigate().back();
	String Text=driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
	System.out.println(Text);
		driver.findElementByLinkText("Verify am I broken?").click();
		String Title = driver.getTitle();
		if (Title.contains("Not Found")) {
			System.out.println("The Link is Broken");
		} else {
			System.out.println("The Link is not Broken");
		}
		driver.navigate().back();
		driver.findElementByLinkText("Go to Home Page").click();
		String Url=driver.getCurrentUrl();
		if (Url.equals(Url)) {
			System.out.println("Both are Same links");
		}
		else {
			System.out.println("Both are not Same Links");
		driver.navigate().back();
		}
	Dimension NumberOfLinks=driver.findElement(By.tagName("a")).getSize();
	System.out.println("Number of Links:"+NumberOfLinks);
		
		
	}

}
