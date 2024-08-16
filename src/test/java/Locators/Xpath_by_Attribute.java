package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Attribute {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	//xpath for un 
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("visual_user");
	//xpath for Password
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	//Click on login Btn
	driver.findElement(By.xpath("//input[@id='login-button']")).click();	
}
}
