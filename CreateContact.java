package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement webUser = driver.findElement(By.id("username"));
		webUser.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Puhazhenthi");
		driver.findElement(By.id("lastNameField")).sendKeys("Karunanithi");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Puhal");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Nithi");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Civil");
		driver.findElement(By.id("createContactForm_description")).sendKeys("I am Civil Engineer");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("puhal007@gmail.com");
		driver.findElement(By.id("createContactForm_generalAddress1")).sendKeys("5/4 NG patty");
		driver.findElement(By.id("createContactForm_generalAddress2")).sendKeys("Oddanchatram");
		driver.findElement(By.id("createContactForm_generalCity")).sendKeys("Dindugal");
		//dropdown1
		WebElement Drop1=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropdown1 =new Select(Drop1);
		dropdown1.selectByVisibleText("North Carolina");
		driver.findElement(By.id("createContactForm_generalCity")).sendKeys("tamilnadu");
		driver.findElement(By.id("createContactForm_generalPostalCode")).sendKeys("624619");
		driver.findElement(By.id("createContactForm_importantNote")).sendKeys("Should Create Contact");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.id("reassignToForm_newPartyId")).sendKeys("Puhal Nithi");
driver.findElement(By.name("submitButton")).click();

	}

}
