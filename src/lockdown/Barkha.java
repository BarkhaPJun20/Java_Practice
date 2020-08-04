package lockdown;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Barkha {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL 1801\\Desktop\\Selenium\\chromedriver.exe");

 WebDriver driver= new ChromeDriver();
 driver.get("http://www.leafground.com/");
 
 driver.manage().window().maximize();
 //driver.findElement(By.xpath("//a[@href='pages/Button.html']")).click();
 
// String col = driver.findElement (By.xpath("//*[@id='color']")).getCssValue("background-color");
// System.out.println(col);

// WebElement size= driver.findElement(By.id("size"));
// Dimension s1=size.getSize();
// System.out.println(s1);
 
 driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a")).click();
 driver.findElement(By.xpath("//input[@type='text' and @value='Append ']")).sendKeys("megha");
 

 
 
 
 
 
 
 
 
 

		 
		 
		 
		 
		 

		 
		
		
		 

	}

	private static void Appendable(String string) {
		// TODO Auto-generated method stub
		
	}
 
}
