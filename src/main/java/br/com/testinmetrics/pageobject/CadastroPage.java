package br.com.testinmetrics.pageobject;

import org.openqa.selenium.By;

public class CadastroPage {

	private By btnAdd = By.xpath("//*[@id=\"content\"]/div/form/button");
	
	private By txtFirstName = By.name("fname");
	private By txtLastName = By.name("lname");
	private By txtEmail = By.name("email");
	private By txtPassword = By.name("password");
	private By lCountry = By.cssSelector("#s2id_autogen1 > a > span.select2-chosen");  
	
	private By btnSubmit = By.cssSelector("#content > form > div > div.panel-footer > button");  
	private By msgCadastro = By.xpath("/html/body/div[3]/div/h4");      

	public By getbtnAdd() {
		return btnAdd;
	}

	public By gettxtFirstName() {
		return txtFirstName;
	}

	public By gettxtLastName() {
		return txtLastName;
	}

	public By gettxtEmail() {
		return txtEmail;
	}

	public By gettxtPassword() {
		return txtPassword;
	}

	public By getlCountry() {
		return lCountry;
	}
	
	

	public By getbtnSubmit() {
		return btnSubmit;
	}

	public By msgCadastro() {
		return msgCadastro;
	}

}
