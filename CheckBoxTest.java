package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
WebDriverManager.chromedriver().setup();                                               
ChromeDriver driver=new ChromeDriver();	                                               
driver.get("http://leafground.com/pages/checkbox.html");                            
driver.manage().window().maximize();                                                
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);                     
driver.findElement(By.xpath("//div[@class='example']//input[1]")).click();          
WebElement Box1=driver.findElementByXPath("(//div[@class='example'])[2]//input");   
if (Box1.isSelected()) {                                                            
System.out.println("box1 is checked");                                             
}                                                                                   
else {                                                                              
System.out.println("box1 is not checked");                                         
}                                                                                      
driver.findElementByXPath("(//div[@class='example'])[3]//div[2]/input").click();    
driver.findElementByXPath("(//div[@class='example'])[4]/div[1]/input").click();    
driver.findElementByXPath("(//div[@class='example'])[4]/div[2]/input").click();  
driver.findElementByXPath("(//div[@class='example'])[4]/div[3]/input").click(); 
driver.findElementByXPath("(//div[@class='example'])[4]/div[4]/input").click(); 
driver.findElementByXPath("(//div[@class='example'])[4]/div[5]/input").click(); 
        
}                                                                                      
        
        
	}


