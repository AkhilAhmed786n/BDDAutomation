package stepDefMobTv;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchForMobTV {
	WebDriver driver;
	
	@Given("open the browser")
	public void open_the_browser() {
		System.out.println("opening browser");
//	    WebDriverManager.chromedriver().setup();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@When("open url")
	public void open_url() {
		System.out.println("opening url");
//	    driver.get("https://www.amazon.in/");
		
	}

	@Then("search for Samsung Mobile")
	public void search_for_samsung_mobile() {
		System.out.println("searching for samsung mobiles");
//	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("SamsungMobiles");
		
	}

	@Then("close browser")
	public void close_browser() {
		System.out.println("closing browser");
//	    driver.close();
		
	}

	@Then("search for Redmi TV")
	public void search_for_redmi_tv() {
		System.out.println("searching for redmi TV");
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Redmi TV");
//		driver.findElement(By.xpath("")).click();
		
	   
	}
	
	@Then("search for Oppo Phn")
	public void search_for_oppo_phn() {
		System.out.println("searching for OppoPhn");
	}

}
