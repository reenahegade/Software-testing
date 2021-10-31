package sel_basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.crome.driver", " D:\\eclipse\\eclipse\\chromedriver.exe");
		 WebDriver w=new ChromeDriver();
		 
		 //Open Website
		 w.get("http://demo.guru99.com/test/newtours/index.php ");

		 
		 w.findElement(By.name("userName")).sendKeys("test");
		 
		 
		 w.findElement(By.name("password")).sendKeys("test");

		 w.findElement(By.name("submit")).click();
		 
		 w.findElement(By.linkText("SIGN-OFF")).click();
		 
		 w.navigate().to("https://www.edubridgeindia.com");
		 
        w.navigate().back();
	

	w.navigate().refresh();
	
	System.out.println(w.getTitle());
	System.out.println(w.getCurrentUrl());
	
	w.close();
	}
}