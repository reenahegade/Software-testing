package sel_basic_program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_demo {

	public static void main(String[] args) {

		//Launch web driver
		System.setProperty("webDriver.chrome.driver","D:\\eclipse\\eclipse\\chromedriver.exe");
		
		WebDriver w=new ChromeDriver();
		
		//open url
		w.get("https://demoqa.com/alerts");
		
		w.findElement(By.id("alertButton")).click();
		Alert a=w.switchTo().alert();
		a.accept();
		System.out.println(a.getText());
		w.close();
	}

}
