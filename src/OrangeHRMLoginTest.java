		
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginTest {
    public static void main(String[] args) {

       
    	  System.setProperty("webdriver.chrome.driver", "C:\\Selanium_Google Drive\\chromedriver.exe"); // Setting the system and it's path.

  
          WebDriver driver = new ChromeDriver();  // Launch Chrome.

          try {
                 driver.get("https://opensource-demo.orangehrmlive.com/");   // Launch demo website on chrome.
    
               Thread.sleep(2000);  // Wait for 2 seconds for the page to load
               
 
            // Locate login elements and Perform login.
               
                    driver.findElement(By.name("username")).sendKeys("Admin");
          
            		driver.findElement(By.name("password")).sendKeys("admin123");;
       
            		driver.findElement(By.cssSelector("button[type='submit']")).click();

            

            Thread.sleep(3000);    // Wait for login to complete
            

            // Verify login success
            
            if (driver.findElements(By.className("oxd-userdropdown-name")).size() > 0) {
            	
                System.out.println("Login successful..!!");
                System.out.println("Test = Pass");
                
            } else {
            	
                System.out.println("Login failed. See Console For Any Error.");
                System.out.println("Test = Fail");
            }
            

            // Logout
            
            driver.findElement(By.className("oxd-userdropdown-name")).click();
            
            Thread.sleep(1000);
            
           // driver.findElement(By.xpath("//a[text()='Logout']")).click();
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
