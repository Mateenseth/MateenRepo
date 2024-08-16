package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	//maximize it  
	driver.manage().window().maximize();
	//Expected Title
	String expT="Google";
	//GetTiltle
	String actT = driver.getTitle();
	
	if(expT.equals(actT)) {
		System.out.println("User is navigated to HP,TC is passed");
	}
	else {
	System.out.println("TC is failed");
	
}
}
}
