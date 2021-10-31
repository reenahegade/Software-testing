package sel_basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo_monzilla {

	public static void main(String[] args) {

		
		 System.setProperty("webdriver.gecko.driver", " D:\\eclipse\\eclipse\\geckodriver.exe");
		 WebDriver w=new FirefoxDriver();
		 
		 //Open Website
		 w.get("http://demo.guru99.com/test/newtours/index.php ");
		 
		 w.findElement(By.name("userName")).sendKeys("test");

	}

}
