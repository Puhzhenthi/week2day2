package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageLeaf {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("(//img)[2]").click();
		driver.navigate().back();
		WebElement img=driver.findElementByXPath("//label[@for='position']/following-sibling::img");
		if (img.getAttribute("herf")==null) {
			System.out.println("The Image is BROKEN");
		}
		else {
			
		}		System.out.println("The Image is NOT BROKEN");
			}
	}


