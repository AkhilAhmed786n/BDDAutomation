package stepDef_CreateOrg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrg {
	WebDriver driver;
	
	@Given("Launch Browser")
	public void launch_browser() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	    
	}

	@Given("open the  URL {string}")
	public void open_the_url(String string) {
		
		driver.get("http://localhost:8888");
	    
	}

	@When("login page is displayed")
	public void login_page_is_displayed() {
		
		
		Assert.assertEquals(driver.getTitle(), "vtiger CRM 5 - Commercial Open Source CRM");
		
	   
	}

	@Then("enter UserName {string}")
	public void enter_user_name(String string) {
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
	    
	}

	@Then("enter Password {string}")
	public void enter_password(String string) {
		driver.findElement(By.name("user_password")).sendKeys("admin");
	    
	}

	@Then("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("submitButton")).click();
	}

	@Then("verify the homepage title")
	public void verify_the_homepage_title() {
		
		Assert.assertEquals(driver.getTitle(),"Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM");
	    
	}

	@Then("click on organisation link")
	public void click_on_organisation_link() {
		driver.findElement(By.xpath("//a[text()='Organizations']//ancestor::td[@class='tabUnSelected']")).click();
	    
	}

	@Then("just wait")
	public void just_wait() throws Throwable {
		
		Thread.sleep(3000);
	    
	}

	@Then("click on CreateOrg img")
	public void click_on_create_org_img() {
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	    
	}

	@Then("enter OrgName {string}")
	public void enter_org_name(String orgName) {
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgName);
			
	    
	}

	@Then("enter PhnNum {string}")
	public void enter_phn_num(String phoneNumber) {
		
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phoneNumber);	
	    
	}

//	@Then("save the organisation")
//	public void save_the_organisation() {
//		
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//	   
//	}

	@Then("logout from the application")
	public void logout_from_the_application() {
		
		Actions ac=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		ac.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	    
	}

}
