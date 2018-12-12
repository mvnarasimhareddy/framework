package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\drivers\\mozilla\\geckodriver.exe");
		FirefoxDriver ff=new FirefoxDriver();
			ff.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			ff.get("file:///C:/Users/dell/Desktop/mnr.html");
	List<WebElement> rv1	=ff.findElements(By.name("cb"));
	for(int i=0;i<=rv1.size()-1;i++)
	{
		rv1.get(i).click();
	}
	
	}
}
