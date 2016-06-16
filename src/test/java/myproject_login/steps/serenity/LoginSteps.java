package myproject_login.steps.serenity;

import myproject_login.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

	LoginPage onLoginPage;

	@Step
	public void open_Skype_Login() {
		onLoginPage.open();
	}

	public void click_Login_Button() {

		onLoginPage.clickOn(onLoginPage.submitbtn);

	}

	public String getErrMsg() {
		String ErrMsg = onLoginPage.getMsg();
		return ErrMsg;
	}

	public void input_Email(String email) {
		onLoginPage.typeInto(onLoginPage.emailID, email);

	}

	public void input_pass(String pass) {
		onLoginPage.typeInto(onLoginPage.passID, pass);
		
	}

}
