package myproject_login.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://login.skype.com/login")
public class LoginPage extends PageObject {

	@FindBy(id = "signIn")
	public WebElementFacade submitbtn;

	@FindBy(xpath = "//*[@id='container']/div/div/div[1]/div[1]/span")
	public WebElementFacade ErrMsg1;

	@FindBy(id = "username")
	public WebElementFacade emailID;

	@FindBy(id = "password")
	public WebElementFacade passID;

	public String getMsg() {
		ErrMsg1.waitUntilPresent();
		return ErrMsg1.getText();
	}

}
