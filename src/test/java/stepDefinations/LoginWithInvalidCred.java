package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class LoginWithInvalidCred {
	WebDriver driver;
	
	@Then("Enter the Invalid Username")
	public void enter_the_invalid_username() {
		driver.findElement(By.name("user_name")).sendKeys("Akhil");
	    
	}

	@Then("Enter the Invvalid Password")
	public void enter_the_invvalid_password() {
		driver.findElement(By.name("user_password")).sendKeys("Manager");
	    
	}

}
