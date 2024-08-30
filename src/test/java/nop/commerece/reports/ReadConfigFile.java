package nop.commerece.reports;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadConfigFile {
	WebDriver driver ;
	
	@Test
  public void test1() throws IOException {
		File file =  new File ("./configure.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties pr = new Properties();
		pr .load(fis);
		String Str = pr.getProperty("browser");
		System.out.println(Str);
		String  url = pr.getProperty("url");
		System.out.println(url);
		if (Str.equals("chrome"))
		{
			driver = new ChromeDriver ();
			}
		else if(Str.equals("firefox")) 
		{
			driver = new FirefoxDriver();
			
			}
		else 
		{
        System.out.println("driver is not found ");			
		}
		driver.get("https://www.amazon.com/");
	  
	}
}
