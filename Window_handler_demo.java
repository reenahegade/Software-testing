package sel_basic_program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handler_demo {

	public static void main(String[] args) {
     
		//Launch web driver
		System.setProperty("webDriver.chrome.driver","D:\\eclipse\\eclipse\\chromedriver.exe");
		
		WebDriver w=new ChromeDriver();
		
		//open url
		w.get("https://demoqa.com/browser-windows");
		
		//click on tab
		w.findElement(By.id("tabButton")).click();
		
		//Window handler
		Set<String> win=w.getWindowHandles();
		
		Iterator<String> I=win.iterator();
		String p_window=I.next();
		String c_window=I.next();
		
		
		w.switchTo().window(c_window);
		w.switchTo().window(p_window);
		
	}

}
