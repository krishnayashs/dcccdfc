package java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class first{
public static void setup(){
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sbatt\\Desktop\\Krishna Yash\\icloud-selenium\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://www.amazon.com/ref=nav_logo");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
	driver.findElement(By.className("nav-input")).click();
	WebElement down = driver.findElement(By.id("sort"));
	Select dd = new Select(down);
	
	 dd.selectByIndex(0);
	 dd.selectByValue("featured-rank");
//	 dd.selectByVisibleText("Price: High to Low");
			
	
}
public static void main(String[] args) {
	setup();
}
}