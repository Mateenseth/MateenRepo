package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MOnthDD {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	//click on create new acct btn
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	//select DD and store in ref var
	Thread.sleep(5000);
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	//create object of selectclass
	Select s=new Select(month);
	s.selectByVisibleText("Mar");
	
}
}
