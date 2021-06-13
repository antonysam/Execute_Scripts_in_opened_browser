package chrome_debug;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {
 
	public static void main(String[] args) throws InterruptedException {
		
		// Provide the Chrome driver location
		
		System.setProperty("webdriver.chrome.driver", "G:\\Users\\samdany\\chromedriver.exe");
		
		// Setting up the  Chrome browser to connect -> browser opened in debugger mode
	    ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("debuggerAddress", "localhost:9988");
	    
	    // Passing the ChromeOptions object in ChromeDriver constructor
	    
	    WebDriver d = new ChromeDriver(options);
	    
	    // Clicking i=on the Search bar 
	   
	    d.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).click();

	    // Typing the text into the search bar
	    
	    d.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys("Oppo Phones");
  }

}
