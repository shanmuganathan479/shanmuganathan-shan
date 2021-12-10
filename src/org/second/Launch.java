package org.second;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch
{
public static void main(String[] args)
{
   System.setProperty("webdriver.gecko.driver","C:\\Users\\elcot\\eclipse-workspace\\facebook\\Driver\\geckodriver.exe" );
   
   WebDriver driver=new FirefoxDriver();
   
   driver.get("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_a71C26F1A10250DF1BB92EB40E");
   
  String url= driver.getCurrentUrl();
  System.out.println(url);
  
  String title=driver.getTitle();
  System.out.println(title);
	
	
	
	
	
	
	
	
	
	
}
}
