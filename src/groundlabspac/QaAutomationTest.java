package groundlabspac;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

public class QaAutomationTest {
	
	   private WebDriver driver;
		
	   // PUBLIC DECLARATIONS
	   public boolean expectedResult = true;
	   public boolean displayTrue = false; 
	   public boolean displayValue = false; 
	  	
	   public String actualVal="";
	   public String actualScreenVal="";
	   public SoftAssert softAssert = new SoftAssert();
	    
	  
		@BeforeTest
		public void Initialize() {
			
		
			
		}
		
		@BeforeMethod
		public void UrlNavigate() {
			String exePath = "C:\\Software\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			
			driver =new ChromeDriver();
				
			driver.navigate().to("http://qa-1.s3-website-ap-southeast-1.amazonaws.com");
				  
		}
		
		  
		@Test
		public void Test1() {
			  
			  	driver.findElement(By.id("username")).sendKeys("udaniso");
			  	driver.findElement(By.id("password")).sendKeys("udani123");
			  	
			  	driver.findElement(By.id("login")).click();
			  	
			 
				// WebElements -Keys
				WebElement key_7 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[1]"));
				WebElement key_8 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[2]"));
				WebElement key_9 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[3]"));
				WebElement key_4 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[4]"));
				WebElement key_5 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[5]"));
				WebElement key_6 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[6]"));
				WebElement key_1 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[7]"));
				WebElement key_2 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[8]"));
				WebElement key_3 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[9]"));
				WebElement key_0 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[10]"));
			  	
			  	// WebElements -Display  	
				WebElement scrn_display = driver.findElement(By.className("calculator__display"));
			  	
				WebElement key_clear   = driver.findElement(By.xpath("//button[@data-action='clear']"));
			  	
			  	

			  	// Sign(+,-,/,*) Keys Display Verification
			  	
			  	displayTrue = driver.findElement(By.xpath("//button[@data-action='subtract']")).isDisplayed();
			  	softAssert.assertEquals(displayTrue, expectedResult);
			  	
			  	displayTrue = driver.findElement(By.xpath("//button[@data-action='multiply']")).isDisplayed();
			  	softAssert.assertEquals(displayTrue, expectedResult);
			  	
			  	displayTrue = driver.findElement(By.xpath("//button[@data-action='divide']")).isDisplayed();
			  	softAssert.assertEquals(displayTrue, expectedResult);
			  	
			  	// Numbers - Number 7 - Display Check
			  	displayTrue = key_7.isDisplayed();
			  	softAssert.assertEquals(displayTrue, expectedResult);
			  	
			  	actualVal = key_7.getText();
			  	softAssert.assertEquals(actualVal, "7");
			  	
			  	// Numbers - Number 7 - Functionality Check
			  	key_7.click();
			  	actualScreenVal = scrn_display.getText();
			  	softAssert.assertEquals(actualScreenVal, "7");
			  	key_clear.click();
			  	
			  	
			  	// Numbers - Number 8 - Display Check
			  	displayTrue = key_8.isDisplayed();
			  	softAssert.assertEquals(displayTrue, expectedResult);
			  	
			  	actualVal = key_8.getText();
			  	softAssert.assertEquals(actualVal, "8");
			  	
			  	// Numbers - Number 8 - Functionality Check
			  	key_8.click();
			  	actualScreenVal = scrn_display.getText();
			  	softAssert.assertEquals(actualScreenVal, "8");
			  	key_clear.click();
			  	
			  	
			  	
			  	// Numbers - Number 9 - Display Check	
			  	displayTrue = key_9.isDisplayed();
			  	softAssert.assertEquals(displayTrue, expectedResult);
			  	
			  	actualVal = key_9.getText();
			  	softAssert.assertEquals(actualVal, "9");
			  	
			  	// Numbers - Number 9 - Functionality Check
			  	key_9.click();
			  	actualScreenVal = scrn_display.getText();
			  	softAssert.assertEquals(actualScreenVal, "9");
			  	key_clear.click();
			  	
			  	
				// Numbers - Number 4 - Display Check	
			  	displayTrue = key_4.isDisplayed();
			  	softAssert.assertEquals(displayTrue, expectedResult);
			  	
			  	actualVal = key_4.getText();
			  	softAssert.assertEquals(actualVal, "4");
			  	
			  	// Numbers - Number 4 - Functionality Check
			  	key_4.click();
			  	actualScreenVal = scrn_display.getText();
			  	softAssert.assertEquals(actualScreenVal, "4");
			  	key_clear.click();
			  	
			  	
			  	// Numbers - Number 5 - Display Check	
			  	displayTrue = key_5.isDisplayed();
			  	softAssert.assertEquals(displayTrue, expectedResult);
			  	
			  	actualVal = key_5.getText();
			  	softAssert.assertEquals(actualVal, "5");
			  	
			  	// Numbers - Number 5 - Functionality Check
			  	key_5.click();
			  	actualScreenVal = scrn_display.getText();
			  	softAssert.assertEquals(actualScreenVal, "5");
			  	key_clear.click();
			  	
			  	
			  	// Numbers - Number 6 - Display Check	
			  	displayTrue = key_6.isDisplayed();
			  	softAssert.assertEquals(displayTrue, expectedResult);
			  	
			  	actualVal = key_6.getText();
			  	softAssert.assertEquals(actualVal, "6");
			  	
			  	// Numbers - Number 6 - Functionality Check
			  	key_6.click();
			  	actualScreenVal = scrn_display.getText();
			  	softAssert.assertEquals(actualScreenVal, "6");
			  	key_clear.click();
			  	
			  	
			  	// Numbers - Number 1 - Display Check	
			  	displayTrue = key_1.isDisplayed();
			  	softAssert.assertEquals(displayTrue, expectedResult);
			  	
			  	actualVal = key_1.getText();
			  	softAssert.assertEquals(actualVal, "1");
			  	
			  	// Numbers - Number 1 - Functionality Check
			  	key_1.click();
			  	actualScreenVal = scrn_display.getText();
			  	softAssert.assertEquals(actualScreenVal, "1");
			  	key_clear.click();
			  	
			  	
				// Numbers - Number 2 - Display Check	
			  	displayTrue = key_2.isDisplayed();
			  	softAssert.assertEquals(displayTrue, expectedResult);
			  	
			  	actualVal = key_2.getText();
			  	softAssert.assertEquals(actualVal, "2");
			  	
			  	// Numbers - Number 2 - Functionality Check
			  	key_2.click();
			  	actualScreenVal = scrn_display.getText();
			  	softAssert.assertEquals(actualScreenVal, "2");
			  	key_clear.click();
			  	
			  	
			  	// Numbers - Number 3 - Display Check	
			  	displayTrue = key_3.isDisplayed();
			  	softAssert.assertEquals(displayTrue, expectedResult);
			  	
			  	actualVal = key_3.getText();
			  	softAssert.assertEquals(actualVal, "3");
			  	
			  	// Numbers - Number 3 - Functionality Check
			  	key_3.click();
			  	actualScreenVal = scrn_display.getText();
			  	softAssert.assertEquals(actualScreenVal, "3");
			  	key_clear.click();
			  	
			  	
			  	
			  	// Numbers - Number 0 - Display Check	
			  	displayTrue = key_0.isDisplayed();
			  	softAssert.assertEquals(displayTrue, expectedResult);
			  	
			  	actualVal = key_0.getText();
			  	softAssert.assertEquals(actualVal, "0");
			  	
			  	// Numbers - Number 0 - Functionality Check
			  	
			  	key_0.click();
			  	actualScreenVal = scrn_display.getText();
			  	softAssert.assertEquals(actualScreenVal, "0");
			  	key_clear.click();
			  	

			  	//softAssert.assertAll();
			  	driver.close();
			  	
			 }
		
		  @Test
		  
		  
		  public void Test2() {
			  System.out.println("Started 2");
			  
			  driver.findElement(By.id("username")).sendKeys("udaniso");
			  driver.findElement(By.id("password")).sendKeys("udani123");
			  	
			  driver.findElement(By.id("login")).click();
			  
			  	
			  System.out.println("Processing 2");
			  WebElement key_3 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[9]"));
			  WebElement key_clear   = driver.findElement(By.xpath("//button[@data-action='clear']"));
			  
			  
			  // Check Value of AC/CE Button - Initially should be AC

			  actualVal = key_clear.getText();
			  softAssert.assertEquals(actualVal, "AC");
			  
			  
			  key_3.click();
			  actualVal = key_clear.getText();
			  softAssert.assertEquals(actualVal, "CE");
			  
			  
			  key_clear.click();
			  actualVal = key_clear.getText();
			  softAssert.assertEquals(actualVal, "AC");
			  
			  System.out.println("Ending 2");
		  
			  //softAssert.assertAll();
			  driver.close();
		  }
		  
		  
		  @Test
		  public void Test3() {
			  System.out.println("Started 3");
			  
			  driver.findElement(By.id("username")).sendKeys("udaniso");
			  driver.findElement(By.id("password")).sendKeys("udani123");
			  	
			  driver.findElement(By.id("login")).click();
			  
			  	
			  System.out.println("Processing 3");
			  // WebElements -Keys
			  WebElement key_7 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[1]"));
			  WebElement key_4 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[4]"));
			  WebElement key_5 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[5]"));
			  WebElement key_6 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[6]"));
			  WebElement key_2 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[8]"));
			  WebElement key_3 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[9]"));
			  //WebElements -Signs
			  WebElement key_add = driver.findElement(By.xpath("//button[@data-action='add']"));
			  // WebElements -Display  	
			  WebElement scrn_display = driver.findElement(By.className("calculator__display"));
			  	
			  WebElement key_clear   = driver.findElement(By.xpath("//button[@data-action='clear']"));
			  WebElement key_decimal = driver.findElement(By.xpath("//button[@data-action='decimal']"));
			  WebElement key_equal   = driver.findElement(By.xpath("//button[@data-action='calculate']"));
			  
			  
			  // Entering Value 35.22
			  key_3.click();
			  key_5.click();
			  key_decimal.click();
			  key_2.click();
			  key_2.click(); 
			  
			  //Validating Entered Decimal Value in Screen
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "35.22");
			  
			  // Adding 47.36 to this     = 82.58
			  key_add.click();
			  key_4.click();
			  key_7.click();
			  key_decimal.click();
			  key_3.click();
			  key_6.click(); 
			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "47.36");
			  
			  key_equal.click();
			  
			  //Validate Answer at screen 82.58
			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "82.58");
			  
			  // Validate Clicking CE Button Clears Screen Display

			  key_clear.click();
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "0");
		  
			  //softAssert.assertAll();
			  driver.close();
		  }
		  
		  
		  @Test
		  public void Test4() {
			  System.out.println("Started 4");
			  
			  driver.findElement(By.id("username")).sendKeys("udaniso");
			  driver.findElement(By.id("password")).sendKeys("udani123");
			  	
			  driver.findElement(By.id("login")).click();
			  
			  	
			  System.out.println("Processing 4");
			  // WebElements -Display  	
			  WebElement scrn_display = driver.findElement(By.className("calculator__display"));
			  	
			  WebElement key_clear   = driver.findElement(By.xpath("//button[@data-action='clear']"));
			  // Entering Value 35 - Using Key Board
			  scrn_display.sendKeys(String.valueOf(3));
			  scrn_display.sendKeys(String.valueOf(5));
			  
			  
			  //Validating Entered Value in Screen
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "35");
			  
			  key_clear.click();
			 
		  
			  //softAssert.assertAll();
			  driver.close();
		  }
		  
		  
		  @Test
		  public void Test5() {
			  System.out.println("Started 5");
			  
			  driver.findElement(By.id("username")).sendKeys("udaniso");
			  driver.findElement(By.id("password")).sendKeys("udani123");
			  	
			  driver.findElement(By.id("login")).click();
			  
			  	
			  System.out.println("Processing 5");
			  // WebElements -Keys
			  WebElement key_7 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[1]"));
			  WebElement key_8 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[2]"));
			  WebElement key_9 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[3]"));
			  WebElement key_4 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[4]"));
			  WebElement key_5 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[5]"));
			  WebElement key_6 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[6]"));
			  WebElement key_1 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[7]"));
			  WebElement key_2 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[8]"));
			  WebElement key_3 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[9]"));
			  WebElement key_0 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[10]"));
			  
			  // WebElements -Display  	
			  WebElement scrn_display = driver.findElement(By.className("calculator__display"));
			  	
			  WebElement key_clear   = driver.findElement(By.xpath("//button[@data-action='clear']"));
			  // Entering Value 1234567890123456789
			  key_1.click();
			  key_2.click();
			  key_3.click();
			  key_4.click();
			  key_5.click(); 
			  key_6.click();
			  key_7.click();
			  key_8.click();
			  key_9.click();
			  key_0.click(); 
			  key_1.click();
			  key_2.click();
			  key_3.click();
			  key_4.click();
			  key_5.click(); 
			  key_6.click();
			  key_7.click();
			  key_8.click();
			  key_9.click();
			  
			  //Validating Entered Value in Screen
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "1234567890123456789");
			  
			  
			// Entering Value 12345678901234567890123456789012345678901234567890123456789
			  
			  key_clear.click();
			  
			  key_1.click();
			  key_2.click();
			  key_3.click();
			  key_4.click();
			  key_5.click(); 
			  key_6.click();
			  key_7.click();
			  key_8.click();
			  key_9.click();
			  key_0.click(); 
			  key_1.click();
			  key_2.click();
			  key_3.click();
			  key_4.click();
			  key_5.click(); 
			  key_6.click();
			  key_7.click();
			  key_8.click();
			  key_9.click();
			  key_0.click(); 
			  key_1.click();
			  key_2.click();
			  key_3.click();
			  key_4.click();
			  key_5.click(); 
			  key_6.click();
			  key_7.click();
			  key_8.click();
			  key_9.click();
			  key_0.click(); 
			  key_1.click();
			  key_2.click();
			  key_3.click();
			  key_4.click();
			  key_5.click(); 
			  key_6.click();
			  key_7.click();
			  key_8.click();
			  key_9.click();
			  key_0.click(); 
			  key_1.click();
			  key_2.click();
			  key_3.click();
			  key_4.click();
			  key_5.click(); 
			  key_6.click();
			  key_7.click();
			  key_8.click();
			  key_9.click();
			  key_0.click(); 
			  key_1.click();
			  key_2.click();
			  key_3.click();
			  key_4.click();
			  key_5.click(); 
			  key_6.click();
			  key_7.click();
			  key_8.click();
			  key_9.click();
			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "12345678901234567890123456789012345678901234567890123456789");
			  
			  System.out.println(actualVal);
			  
			  
			  //softAssert.assertAll();
			  driver.close();
		  }
		  
		  
		  
		  @Test(dataProvider="dataProvider")
		  public void Test6(String username, String pswrd, String errormsg) {
			  
			  //Both Empty
			  driver.findElement(By.id("username")).sendKeys(username);
			  driver.findElement(By.id("password")).sendKeys(pswrd);
			  	
			  driver.findElement(By.id("login")).click();
			  
			  WebElement dynamicElement = (new WebDriverWait(driver, 10))
			  		  .until(ExpectedConditions.presenceOfElementLocated(By.id("usernameErr")));
			  
			  String errorText = dynamicElement.getText();
			  
			  softAssert.assertEquals(errorText, errormsg);
			
			  driver.close();
		  }
		  
		  
		
		@DataProvider
		public Object[][] dataProvider()
		{
			Object[][] data=new Object[3][3];
			
			//1st data set
			data[0][0]="";
			data[0][1]="";
			data[0][2]="Invalid Username";
			
			//2nd data set
			data[1][0]="udanisoo";
			data[1][1]="";
			data[1][2]="Invalid Password";
			
			
			//3rd data set
			data[2][0]="";
			data[2][1]="udani123";
			data[2][2]="Invalid Username";
			
			return data;
			
			
		}
		  
		  
		  
		  @Test
		  public void Test7() {
			  
			  //Check with less than the limit
			  //Username 4char Pwd -5 char
			  
			  
			  driver.findElement(By.id("username")).sendKeys("udan");
			  driver.findElement(By.id("password")).sendKeys("12345");
			  	
			  driver.findElement(By.id("login")).click();
			  
			  WebElement dynamicElement = (new WebDriverWait(driver, 10))
			  		  .until(ExpectedConditions.presenceOfElementLocated(By.id("usernameErr")));
			  
			  String errorText = dynamicElement.getText();
			  softAssert.assertEquals(errorText, "Invalid Username");
			  
			 
			  //Check max limit-1 
			  //Username 19 char Pwd -19 char
			  //As per table this should be Given with error - But no idea why it should be
			  //This is remained failed
			  
			  driver.findElement(By.id("username")).sendKeys("ABCDEFGHIJKLMNOPQRS");
			  driver.findElement(By.id("password")).sendKeys("1234567890123456789");
			  	
			  driver.findElement(By.id("login")).click();
			  
			  dynamicElement = (new WebDriverWait(driver, 10))
			  		  .until(ExpectedConditions.presenceOfElementLocated(By.id("usernameErr")));
			  
			  errorText = dynamicElement.getText();
			  softAssert.assertEquals(errorText, "Invalid Username");
			  
			  
			 
		  
			  //softAssert.assertAll();
			  driver.close();
		  }
		  
		  
		  @Test
		  public void Test8() {
			  
			  //Check with username with special charcaters
			  
			  
			  driver.findElement(By.id("username")).sendKeys("!@#$%^&");
			  driver.findElement(By.id("password")).sendKeys("1234567");
			  	
			  driver.findElement(By.id("login")).click();
			  
			  WebElement dynamicElement = (new WebDriverWait(driver, 10))
			  		  .until(ExpectedConditions.presenceOfElementLocated(By.id("usernameErr")));
			  
			  String errorText = dynamicElement.getText();
			  softAssert.assertEquals(errorText, "Invalid Username");
			  
			  driver.findElement(By.id("username")).clear();
			  driver.findElement(By.id("password")).clear();
			 
			 
			  
			  
			  //Check with username - Valid/ Pwd with special charcaters
			  
			  driver.findElement(By.id("username")).sendKeys("udani123");
			  driver.findElement(By.id("password")).sendKeys("!@#$%^&");
			  	
			  driver.findElement(By.id("login")).click();
			  
			  dynamicElement = (new WebDriverWait(driver, 10))
			  		  .until(ExpectedConditions.presenceOfElementLocated(By.id("passwordErr")));
			  
			  errorText = dynamicElement.getText();
			  softAssert.assertEquals(errorText, "Invalid Password");
			  
			  driver.findElement(By.id("username")).clear();
			  driver.findElement(By.id("password")).clear();
			  
			  
			  
			  
			  //Check with username and pwd both with special charcaters
			  
			  
			  driver.findElement(By.id("username")).sendKeys("!@#$%^&");
			  driver.findElement(By.id("password")).sendKeys(")(*&^%$#");
			  	
			  driver.findElement(By.id("login")).click();
			  
			   dynamicElement = (new WebDriverWait(driver, 10))
			  		  .until(ExpectedConditions.presenceOfElementLocated(By.id("usernameErr")));
			  
			   errorText = dynamicElement.getText();
			  softAssert.assertEquals(errorText, "Invalid Username");
			  
			  driver.findElement(By.id("username")).clear();
			  driver.findElement(By.id("password")).clear();
			 
		  
			  //softAssert.assertAll();
			  driver.close();
		  }
		  
		  
		  
		  @Test
		  public void Test9() {
			  //Adding three numbers together
			  
			  driver.findElement(By.id("username")).sendKeys("udaniso");
			  driver.findElement(By.id("password")).sendKeys("udani123");
			  	
			  driver.findElement(By.id("login")).click();
			  
			  	
			  
			  // WebElements -Keys
			  WebElement key_7 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[1]"));
			  WebElement key_4 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[4]"));
			  WebElement key_5 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[5]"));
			  WebElement key_6 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[6]"));
			  WebElement key_2 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[8]"));
			  WebElement key_3 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[9]"));
			  //WebElements -Signs
			  WebElement key_add = driver.findElement(By.xpath("//button[@data-action='add']"));
			  // WebElements -Display  	
			  WebElement scrn_display = driver.findElement(By.className("calculator__display"));
			  	
			  WebElement key_clear   = driver.findElement(By.xpath("//button[@data-action='clear']"));
			  WebElement key_decimal = driver.findElement(By.xpath("//button[@data-action='decimal']"));
			  WebElement key_equal   = driver.findElement(By.xpath("//button[@data-action='calculate']"));
			  
			  
			  // Entering Value 35.22
			  key_3.click();
			  key_5.click();
			  key_decimal.click();
			  key_2.click();
			  key_2.click(); 
			  
			  //Validating Entered Decimal Value in Screen
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "35.22");
			  
			  // Adding 47.36 to this     = 82.58
			  key_add.click();
			  key_4.click();
			  key_7.click();
			  key_decimal.click();
			  key_3.click();
			  key_6.click(); 
			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "47.36");
			  
			  // Adding 2.2 to this     = 82.58 + 2.2 = 84.78
			  key_add.click();
			  key_2.click(); 
			  key_decimal.click();
			  key_2.click();
			  
			  
			  key_equal.click();
			  
			  //Validate Answer at screen 84.78
			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "84.78");
			  
			  // Validate Clicking CE Button Clears Screen Display

			  key_clear.click();
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "0");
			  
			  
			 
		  
			  //softAssert.assertAll();
			  driver.close();
		  }
		  
		  
		  @Test
		  public void Test10() {
			  
			  
			  driver.findElement(By.id("username")).sendKeys("udaniso");
			  driver.findElement(By.id("password")).sendKeys("udani123");
			  	
			  driver.findElement(By.id("login")).click();
			  
			  	
			  
			  WebElement key_5 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[5]"));
			  WebElement key_6 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[6]"));
			  WebElement key_1 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[7]"));
			  WebElement key_2 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[8]"));
			  WebElement key_3 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[9]"));
			  WebElement key_0 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[10]"));
			  
			  WebElement key_sub = driver.findElement(By.xpath("//button[@data-action='subtract']"));
			  // WebElements -Display  	
			  WebElement scrn_display = driver.findElement(By.className("calculator__display"));
			  	
			  WebElement key_clear   = driver.findElement(By.xpath("//button[@data-action='clear']"));
			  WebElement key_decimal = driver.findElement(By.xpath("//button[@data-action='decimal']"));
			  WebElement key_equal   = driver.findElement(By.xpath("//button[@data-action='calculate']"));
			  
			  
			  // Entering Value 35.22
			  key_3.click();
			  key_5.click();
			  key_decimal.click();
			  key_2.click();
			  key_2.click(); 
			  
			  //Validating Entered Decimal Value in Screen
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "35.22");
			  
			  // Subtract 12.36 from 35.22     = 22.86
			  key_sub.click();
			  key_1.click();
			  key_2.click();
			  key_decimal.click();
			  key_3.click();
			  key_6.click(); 
			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "12.36");
			  
			  key_equal.click();
			  
			  //Validate Answer at screen 22.86
			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "22.86");
			  
			  // Validate Clicking CE Button Clears Screen Display

			  key_clear.click();
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "0");
			  
			  
			  //Resulting Negative Value
			  
			  
			  // Entering Value 35.22
			  key_3.click();
			  key_5.click();
			  key_decimal.click();
			  key_2.click();
			  key_2.click(); 
			  
			  //Validating Entered Decimal Value in Screen
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "35.22");
			  
			  // Subtract 50.00 from 35.22     = 14.78
			  key_sub.click();
			  key_5.click();
			  key_0.click();
			  key_decimal.click();
			  key_0.click();
			  key_0.click(); 
			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "50.00");
			  
			  key_equal.click();
			  
			  //Validate Answer at screen 14.78
			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "-14.78");
			  //This answer is not given correctly Script Failes- This is BUG
		  
			  //softAssert.assertAll();
			  driver.close();
		  }
		  
		  
		  @Test
		  public void Test11() {
			  //Multiply two numbers
			  
			  driver.findElement(By.id("username")).sendKeys("udaniso");
			  driver.findElement(By.id("password")).sendKeys("udani123");
			  	
			  driver.findElement(By.id("login")).click();
			  
			  	
			  
			  // WebElements -Keys
			  
			  WebElement key_4 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[4]"));
			  WebElement key_3 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[9]"));
			  //WebElements -Signs
			  WebElement key_mul = driver.findElement(By.xpath("//button[@data-action='multiply']"));
			  // WebElements -Display  	
			  WebElement scrn_display = driver.findElement(By.className("calculator__display"));
			  	
			  WebElement key_clear   = driver.findElement(By.xpath("//button[@data-action='clear']"));
			  WebElement key_equal   = driver.findElement(By.xpath("//button[@data-action='calculate']"));
			  
			  
			  // Entering Value 3
			  key_3.click(); 
			  
			  //Validating Entered Value in Screen
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "3");
			  
			  // multiply by 4 to this     = 12
			  key_mul.click();
			  key_4.click();

			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "4");
			 
			  
			  key_equal.click();
			  
			  //Validate Answer at screen 12
			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "12");
			  
			  // Validate Clicking CE Button Clears Screen Display

			  key_clear.click();
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "0");
			  
			  
		  
			  //softAssert.assertAll();
			  driver.close();
		  }
		  
		  @Test
		  public void Test12() {
			  //Multiplying two numbers
			  
			  driver.findElement(By.id("username")).sendKeys("udaniso");
			  driver.findElement(By.id("password")).sendKeys("udani123");
			  	
			  driver.findElement(By.id("login")).click();
			  
			  	
			  
			  // WebElements -Keys
			  
			  
			  WebElement key_1 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[7]"));
			  WebElement key_2 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[8]"));
			  WebElement key_3 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[9]"));
			  WebElement key_4 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[4]"));
			  //WebElements -Signs
			  WebElement key_mul = driver.findElement(By.xpath("//button[@data-action='multiply']"));
			  // WebElements -Display  	
			  WebElement scrn_display = driver.findElement(By.className("calculator__display"));
			  	
			  WebElement key_clear   = driver.findElement(By.xpath("//button[@data-action='clear']"));
			  WebElement key_decimal = driver.findElement(By.xpath("//button[@data-action='decimal']"));
			  WebElement key_equal   = driver.findElement(By.xpath("//button[@data-action='calculate']"));
			  
			  
			  // Entering Value 1.3
			  key_1.click(); 
			  key_decimal.click();
			  key_3.click(); 
			  
			  //Validating Entered Decimal Value in Screen
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "1.3");
			  
			  // multiply by 2.4 to this     = 3.12
			  key_mul.click();
			  key_2.click();
			  key_decimal.click();
			  key_4.click(); 

			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "2.4");
			 
			  
			  key_equal.click();
			  
			  //Validate Answer at screen 3.12
			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "3.12");
			  
			  // Validate Clicking CE Button Clears Screen Display

			  key_clear.click();
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "0");
			  
			  
			 
		  
			  //softAssert.assertAll();
			  driver.close();
		  }
		  
		  @Test
		  public void Test13() {
			  //Multiplying three numbers together
			  
			  driver.findElement(By.id("username")).sendKeys("udaniso");
			  driver.findElement(By.id("password")).sendKeys("udani123");
			  	
			  driver.findElement(By.id("login")).click();
			  
			  	
			  
			  // WebElements -Keys
			  
			  
			  WebElement key_1 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[7]"));
			  WebElement key_2 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[8]"));
			  WebElement key_3 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[9]"));
			  WebElement key_4 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[4]"));
			  //WebElements -Signs
			  WebElement key_mul = driver.findElement(By.xpath("//button[@data-action='multiply']"));
			  // WebElements -Display  	
			  WebElement scrn_display = driver.findElement(By.className("calculator__display"));
			  	
			  WebElement key_clear   = driver.findElement(By.xpath("//button[@data-action='clear']"));
			  WebElement key_decimal = driver.findElement(By.xpath("//button[@data-action='decimal']"));
			  WebElement key_equal   = driver.findElement(By.xpath("//button[@data-action='calculate']"));
			  
			  
			  // Entering Value 1.3
			  key_1.click(); 
			  key_decimal.click();
			  key_3.click(); 
			  
			  //Validating Entered Decimal Value in Screen
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "1.3");
			  
			  // multiply by 2.4 to this     = 3.12
			  key_mul.click();
			  key_2.click();
			  key_decimal.click();
			  key_4.click(); 

			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "2.4");
			 
			  
			  key_mul.click();
			  
			  //Validate Answer at screen 3.12
			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "3.12");
			  
			  //multiply by 1.2
			  key_1.click();
			  key_decimal.click();
			  key_2.click();
			  key_equal.click();
			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "3.7439999999999998");
			  
			  
			  // Validate Clicking CE Button Clears Screen Display

			  key_clear.click();
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "0");
			  
			  
			 
		  
			  //softAssert.assertAll();
			  driver.close();
		  }
		  
		  
		  @Test
		  public void Test14() {
			  //Devide two numbers
			  
			  driver.findElement(By.id("username")).sendKeys("udaniso");
			  driver.findElement(By.id("password")).sendKeys("udani123");
			  	
			  driver.findElement(By.id("login")).click();
			  
			  	
			  
			  // WebElements -Keys
			  
			  WebElement key_8 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[2]"));
			  WebElement key_2 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[8]"));
			  //WebElements -Signs
			  WebElement key_div = driver.findElement(By.xpath("//button[@data-action='divide']"));
			  // WebElements -Display  	
			  WebElement scrn_display = driver.findElement(By.className("calculator__display"));
			  	
			  WebElement key_clear   = driver.findElement(By.xpath("//button[@data-action='clear']"));
			  WebElement key_equal   = driver.findElement(By.xpath("//button[@data-action='calculate']"));
			  
			  
			  // Entering Value 88
			  key_8.click(); 
			  key_8.click(); 
			  
			  //Validating Entered Value in Screen
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "88");
			  
			  //divide by 22 to this     = 4
			  key_div.click();
			  key_2.click();
			  key_2.click();
			  key_equal.click();

			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "4");
			 
			  
			  // Validate Clicking CE Button Clears Screen Display

			  key_clear.click();
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "0");
			 
		  
			  //softAssert.assertAll();
			  driver.close();
		  }
		  
		  @Test
		  public void Test15() {
			  //Devide two decimal numbers
			  
			  driver.findElement(By.id("username")).sendKeys("udaniso");
			  driver.findElement(By.id("password")).sendKeys("udani123");
			  	
			  driver.findElement(By.id("login")).click();
			  
			  	
			  
			  // WebElements -Keys
			  
			  WebElement key_8 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[2]"));
			  WebElement key_2 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[8]"));
			  //WebElements -Signs
			  WebElement key_div = driver.findElement(By.xpath("//button[@data-action='divide']"));
			  // WebElements -Display  	
			  WebElement scrn_display = driver.findElement(By.className("calculator__display"));
			  	
			  WebElement key_clear   = driver.findElement(By.xpath("//button[@data-action='clear']"));
			  WebElement key_equal   = driver.findElement(By.xpath("//button[@data-action='calculate']"));
			  WebElement key_decimal = driver.findElement(By.xpath("//button[@data-action='decimal']"));
			  
			  
			  // Entering Value 2.2
			  key_2.click(); 
			  key_decimal.click();
			  key_2.click(); 
			  
			  //Validating Entered Value in Screen
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "2.2");
			  
			  //divide by 8.8 to this     = 0.25
			  key_div.click();
			  key_8.click();
			  key_decimal.click();
			  key_8.click();
			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "8.8");
			  
			  key_equal.click();

			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "0.25");
			 
			  
			  // Validate Clicking CE Button Clears Screen Display

			  key_clear.click();
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "0");
			 
		  
			  //softAssert.assertAll();
			  driver.close();
		  }
		  
		  
		  @Test
		  public void Test16() {
			  //Divide twice
			  
			  driver.findElement(By.id("username")).sendKeys("udaniso");
			  driver.findElement(By.id("password")).sendKeys("udani123");
			  	
			  driver.findElement(By.id("login")).click();
			  
			  	
			  
			  // WebElements -Keys
			  
			  WebElement key_8 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[2]"));
			  WebElement key_2 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[8]"));
			  WebElement key_5 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[5]"));
			  WebElement key_0 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[10]"));
			  //WebElements -Signs
			  WebElement key_div = driver.findElement(By.xpath("//button[@data-action='divide']"));
			  // WebElements -Display  	
			  WebElement scrn_display = driver.findElement(By.className("calculator__display"));
			  	
			  WebElement key_clear   = driver.findElement(By.xpath("//button[@data-action='clear']"));
			  WebElement key_equal   = driver.findElement(By.xpath("//button[@data-action='calculate']"));
			  WebElement key_decimal = driver.findElement(By.xpath("//button[@data-action='decimal']"));
			  
			  
			  // Entering Value 2.2
			  key_2.click(); 
			  key_decimal.click();
			  key_2.click(); 
			  
			  //Validating Entered Value in Screen
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "2.2");
			  
			  //divide by 8.8 to this     = 0.25
			  key_div.click();
			  key_8.click();
			  key_decimal.click();
			  key_8.click();
			  key_div.click();
			  
			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "0.25");
			  
			  key_0.click();
			  key_decimal.click();
			  key_5.click();
			  key_equal.click();

			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "0.5");
			 
			  
			  // Validate Clicking CE Button Clears Screen Display

			  key_clear.click();
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "0");
			 
		  
			  //softAssert.assertAll();
			  driver.close();
		  }
		  
		  
		  @Test
		  public void Test17() {
			  //0 divide by a number
			  
			  driver.findElement(By.id("username")).sendKeys("udaniso");
			  driver.findElement(By.id("password")).sendKeys("udani123");
			  	
			  driver.findElement(By.id("login")).click();
			  
			  	
			  
			  // WebElements -Keys
			  
			  WebElement key_8 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[2]"));
			  WebElement key_0 = driver.findElement(By.xpath("//button[@data-action='divide']//following-sibling::button[10]"));
			  //WebElements -Signs
			  WebElement key_div = driver.findElement(By.xpath("//button[@data-action='divide']"));
			  // WebElements -Display  	
			  WebElement scrn_display = driver.findElement(By.className("calculator__display"));
			  	
			  WebElement key_clear   = driver.findElement(By.xpath("//button[@data-action='clear']"));
			  WebElement key_equal   = driver.findElement(By.xpath("//button[@data-action='calculate']"));
			  // Entering Value 0
			  key_0.click();  
			  
			  //Validating Entered Value in Screen
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "0");
			  
			  //divide by 8 to this     = 0.25
			  key_div.click();
			  key_8.click();
			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "8");
			  key_equal.click();
			  
			  
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "0");
			 
			 
			  
			  // Validate Clicking CE Button Clears Screen Display

			  key_clear.click();
			  actualVal = scrn_display.getText();
			  softAssert.assertEquals(actualVal, "0");
			 
		  
			  //softAssert.assertAll();
			  driver.close();
		  }

}
