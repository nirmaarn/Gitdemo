package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome_invoke_practice {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Chrome Driver exe\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");

	}

}
