package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
	//switch the control of selenium from main webapge to frame
	driver.switchTo().frame("iframeResult");
	//enter UN
	Thread.sleep(5000);
	driver.findElement(By.id("fname")).clear();
	driver.findElement(By.id("fname")).sendKeys("xyz");
	
}
}
