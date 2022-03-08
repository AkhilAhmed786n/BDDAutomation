package hooksPackage;

import io.cucumber.java.en.*;

public class SampleStepDef {
	@Given("connect to database")
	public void connect_to_database() {
	    System.out.println("connect to db");
	}

	@When("launch browser")
	public void launch_browser() {
		System.out.println("launch browser");
	}

	@Then("login to application")
	public void login_to_application() {
		System.out.println("login to application");
	}

	@Then("logout to application")
	public void logout_to_application() {
		System.out.println("logout to application");
	}

	@Then("disconnect to database")
	public void disconnect_to_database() {
		System.out.println("disconnect to database");
	}
	
	

}
