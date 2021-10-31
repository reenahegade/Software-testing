package sel_basic_program;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radio_Dropdown_Button {

	public static void main(String[] args) {
     
		System.setProperty("webdriver.crome.driver", " D:\\eclipse\\eclipse\\chromedriver.exe");
		 WebDriver w=new ChromeDriver();
		 
		 //Open Website
		 w.get("https://demo.guru99.com/test/newtours/reservation.php");
		 
		 //radio BUtton
		 w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		 
		 /*PASSENGER DROPDOWN can be selected by 3 ways as:
		    1.byindex
		    2.byvalue
		    3.byvisibletext
		    */
		 w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")).click();
		 Select s =new Select(w.findElement(By.name("passCount")));
	     s.selectByIndex(2);
	     
	     Select s1=new Select(w.findElement(By.name("fromPort")));
	     s1.selectByValue("Paris");
	     
	     Select s2=new Select(w.findElement(By.name("fromMonth")));
         s2.selectByVisibleText("March");
         
         w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")).click();
         
         
         //Continue button
         
         w.findElement(By.name("findFlights")).click();
         w.close();
}}