package LearnSelenium;


import org.testng.AssertJUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import dev.failsafe.Policy;


public class TestClass {
	public static void main(String[] args)
	{
		// Set the Chromedriver exe path - Optional now
		// System.setProperty("webdriver.chrome.driver","C:\\Vinay\\Learning\\Selenium\\chromedriver.exe");
		
		// Use ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		var title = driver.getTitle();
		System.out.println(title);
		AssertJUnit.assertEquals("Title must be matched.",title,"Google");
		driver.close();
	}
}
