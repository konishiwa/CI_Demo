package newPackage;

//import java.util.regex.Pattern;
//import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.apache.commons.io.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.jetty.html.List;
//import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.*;
//import java.io.File;
//import javax.swing.JOptionPane;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class InternetExplorerTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  
  //Set path of IEDriverServer.exe.
 // Note : IEDriverServer.exe should be In D: drive.
 //System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
  public static void main(String[] args) {
	  //File file = new File("C:\\IEDriver");
	  //JOptionPane.showMessageDialog(null, file.getAbsolutePath());
	  //System.setProperty("webdriver.ie.driver", "C:\\IEDriver");
  }
	  
  @Before
  public void setUp() throws Exception {
	//System.setProperty("webdriver.ie.driver", "C:\\IEDriver\\IEDriverServer.exe");
	//WebDriver driver = new InternetExplorerDriver();
    //baseUrl = "http://adactin.com/";
    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testMyFirstWebDriver() throws Exception {
	
	//gets the IE web driver, the second String parameter should be the PATH to the driver
	System.setProperty("webdriver.ie.driver", "C:\\IEDriver\\IEDriverServer.exe");
	//opens IE using the driver
	WebDriver driver = new InternetExplorerDriver();
	//maximizes window
	driver.manage().window().maximize();
	//optional: creating a base URL to add onto
	baseUrl = "http://adactin.com/";
	//gets a URL and loads it in the browser
    driver.get(baseUrl + "/HotelAppBuild2//");
    int filecounter = 0;
    //gets the screenshot of the website
    File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File dest= new File("c:\\eclipse\\screenshot" + filecounter + ".png");
    FileUtils.copyFile(scr, dest);
    filecounter +=1;
    //Thread.sleep(3000);
    //find the question with the id username, and clear the box. 
    //driver.findElement(By.id("username")).clear();
    //send in the key and type it into the username question.
    String username = "hkonishi";
    String password = "M3curydr1nker";
    driver.findElement(By.id("username")).sendKeys(username);
  //find the question with the id password, and clear the box. 
    //driver.findElement(By.id("password")).clear();
    //send in the key and type it into the password question. 
    driver.findElement(By.id("password")).sendKeys(password);
    //find the question with the id login, and click the button
    driver.findElement(By.id("login")).click();
    try {
    	//new Select(driver.findElement(By.id("location"))).selectByVisibleText("Sydney");
    	///By locator = By.id("location");
    	//driver.findElement(By.id("location"));
    	//System.out.println("Was able to get the location pointer");
    	///WebElement dropdown = driver.findElement(locator);
    	//System.out.println("Was able to get the location find element");
    	//Select select = new Select(dropdown);
    	//System.out.println("Was able to find the location question");
    	//droplist.selectByVisibleText("Sydney");
    	//WebElement select = driver.findElement(By.name("location"));
        //WebElement[] options = new WebElement [select.findElements(By.name("location")))];
        /*for(WebElement option : options){
            if(option.getText().equals("Sydney")) {
                option.click();
                break;
            }
        }*/
    	//new Select(driver.findElement(By.id("location"))).selectByVisibleText("Sydney");
    	WebElement test;
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	test = driver.findElement(By.id("location"));
    	if(test.getText().equals("Sydney")== false)
        {
          test.click();
          new Select(driver.findElement(By.id("location"))).selectByVisibleText("Sydney");
        //gets the screenshot of the website
          /*WebDriver locationDriver = new Augmenter().augment(driver);
          screenshot = ((TakesScreenshot)augmentedDriver).
                              getScreenshotAs(OutputType.FILE);
          FileUtils.copyFile(screenshot, new File("c:\\eclipse\\screenshot" + filecounter + ".png"));*/
          scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          dest= new File("c:\\eclipse\\screenshot" + filecounter + ".png");
          FileUtils.copyFile(scr, dest);
          filecounter+=1;
          //Thread.sleep(3000);
        }
    }
    catch (NoSuchElementException e) {
    	System.out.println("uncaught exception for location!");
    	//UNCAUGHT ERROR!
    }
    try {
    	WebElement test;
    	test = driver.findElement(By.id("room_nos"));
    	if(test.getText().equals("2 - Two")== false)
        {
          test.click();
          new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText("2 - Two");
        //gets the screenshot of the website
          scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          dest= new File("c:\\eclipse\\screenshot" + filecounter + ".png");
          FileUtils.copyFile(scr, dest);
          filecounter+=1;
        }
    }
    catch (NoSuchElementException e) {
    	System.out.println("uncaught exception for room amount!");
    	//UNCAUGHT ERROR!
    } 
    try {
    	WebElement test;
    	test = driver.findElement(By.id("adult_room"));
    	if(test.getText().equals("2 - Two")== false)
        {
          test.click();
          new Select(driver.findElement(By.id("adult_room"))).selectByVisibleText("2 - Two");
        //gets the screenshot of the website
          scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          dest= new File("c:\\eclipse\\screenshot" + filecounter + ".png");
          FileUtils.copyFile(scr, dest);
          filecounter+=1;
        }
    }
    catch (NoSuchElementException e) {
    	System.out.println("uncaught exception adult room!");
    	//UNCAUGHT ERROR!
    } 
    driver.findElement(By.id("Submit")).click();
    driver.findElement(By.id("radiobutton_2")).click();
    driver.findElement(By.id("continue")).click();
    //driver.findElement(By.id("first_name")).clear();
    driver.findElement(By.id("first_name")).sendKeys("Haruka");
    //driver.findElement(By.id("last_name")).clear();
    driver.findElement(By.id("last_name")).sendKeys("Konishi");
    //driver.findElement(By.id("address")).clear();
    //driver.findElement(By.id("address")).sendKeys("1000 University Dr.");
    //driver.findElement(By.id("address")).clear();
    driver.findElement(By.id("address")).sendKeys("1000 University Dr.\nFairfax, VA");
   // driver.findElement(By.id("cc_num")).clear();
    driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");
    
    try {
    	WebElement test;
    	test = driver.findElement(By.id("cc_type"));
    	if(test.getText().equals("American Express")== false)
        {
          test.click();
          new Select(driver.findElement(By.id("cc_type"))).selectByVisibleText("American Express");
        //gets the screenshot of the website
          scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          dest= new File("c:\\eclipse\\screenshot" + filecounter + ".png");
          FileUtils.copyFile(scr, dest);
          filecounter+=1;
        }
    }
    catch (NoSuchElementException e) {
    	System.out.println("uncaught exception cc type!");
    	//UNCAUGHT ERROR!
    } 

    try {
    	WebElement test;
    	test = driver.findElement(By.id("cc_exp_month"));
    	if(test.getText().equals("June")== false)
        {
          test.click();
          new Select(driver.findElement(By.id("cc_exp_month"))).selectByVisibleText("June");
        }
    }
    catch (NoSuchElementException e) {
    	System.out.println("uncaught exception for cc month!");
    	//UNCAUGHT ERROR!
    } 
    
    try {
    	WebElement test;
    	test = driver.findElement(By.id("cc_exp_year"));
    	if(test.getText().equals("June")== false)
        {
          test.click();
          new Select(driver.findElement(By.id("cc_exp_year"))).selectByVisibleText("2022");
        }
    }
    catch (NoSuchElementException e) {
    	System.out.println("uncaught exception for cc_exp_year!");
    	//UNCAUGHT ERROR!
    } 
    	
    driver.findElement(By.id("cc_cvv")).clear();
    driver.findElement(By.id("cc_cvv")).sendKeys("123");
    driver.findElement(By.id("book_now")).click();
  //gets the screenshot of the website
    scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    dest= new File("c:\\eclipse\\screenshot" + filecounter + ".png");
    FileUtils.copyFile(scr, dest);
    filecounter+=1;
    driver.findElement(By.linkText("Logout")).click();
    driver.findElement(By.linkText("Click here to login again")).click();
    //driver.findElement(By.id("username")).clear();
    //driver.findElement(By.id("username")).sendKeys("hkonishi");
    //driver.findElement(By.id("password")).clear();
    //driver.findElement(By.id("password")).sendKeys("M3curydr1nker");
  }

  @After
  public void tearDown() throws Exception {
	  try {
		  driver.quit();
	  }
	  catch (NullPointerException e) {
		  System.out.println("The program has ended");
	  }
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }


  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
  
}
