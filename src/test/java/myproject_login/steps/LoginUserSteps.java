package myproject_login.steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myproject_login.steps.serenity.LoginSteps;
import net.thucydides.core.annotations.Steps;

public class LoginUserSteps {

	@Steps
	LoginSteps loginsteps;

	@Given("^visit home page$")
	public void visit_home_page() throws Throwable {
		loginsteps.open_Skype_Login();
	}

	@When("^click login$")
	public void click_login() throws Throwable {
		loginsteps.click_Login_Button();
	}

	@Then("^display message \"([^\"]*)\"$")
	public void display_message(String Msg) throws Throwable {
		Assert.assertEquals(loginsteps.getErrMsg(), Msg);
	}

	@When("^input email \"([^\"]*)\"$")
	public void input_email(String email) throws Throwable {
		loginsteps.input_Email(email);
	}

	@When("^input password \"([^\"]*)\"$")
	public void input_password(String pass) throws Throwable {
		loginsteps.input_pass(pass);
	}
}
