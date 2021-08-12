package Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_example {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Chrome Driver exe\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        //launching the site
        
        //js,executeScript("alert('Welcome to Guru99'););
        
        
        //login to guru99
        driver.findElement(By.name("email")).sendKeys("arnold");
        driver.findElement(By.name("pass")).sendKeys("nirmal");
        
        //perform click on login button using javascriptexecutor
        WebElement button = driver.findElement(By.id("loginbutton"));
        js.executeScript("arguments[0].click();", button);
        Thread.sleep(5000);
        
	}

}
