package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;
	
	@Given("Launch browser")
	public void launch_browser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   
	}

	@When("open the URL")
	public void open_the_url() {
		driver.get("http://localhost:8888/");
	    
	}

	@Then("Enter the valid Username")
	public void enter_the_valid_username() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
	   
	}

	@Then("Enter the valid Password")
	public void enter_the_valid_password() {
		driver.findElement(By.name("user_password")).sendKeys("admin");
	    
	}

	@Then("Click on Login")
	public void click_on_login() {
		driver.findElement(By.id("submitButton")).click();
	  
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	    
	}
	
	@When("open the URL {string}")
	public void open_the_url(String url) {
		driver.get(url);
	}

	@Then("Enter the valid Username {string}")
	public void enter_the_valid_username(String un) {
		driver.findElement(By.name("user_name")).sendKeys(un);
	}

	@Then("Enter the valid Password {string}")
	public void enter_the_valid_password(String pwd) {
		driver.findElement(By.name("user_password")).sendKeys(pwd);
	}

}
