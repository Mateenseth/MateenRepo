package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_using_visibletext {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
	//click on gmail link
	driver.findElement(By.xpath("//a[.='Gmail']")).click();
	
}
}
