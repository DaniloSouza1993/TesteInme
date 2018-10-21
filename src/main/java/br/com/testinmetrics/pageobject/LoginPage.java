package br.com.testinmetrics.pageobject;

import org.openqa.selenium.By;

public class LoginPage {
	
	private By txtEmail = By.name("email");
	private By txtSenha = By.name("password");
	private By btnLogin = By.xpath("/html/body/div/form[1]/button");
	private By menuAccounts = By.xpath("//*[@id=\"social-sidebar-menu\"]/li[5]/a");
	private By subMenuSuppliers = By.xpath("//*[@id=\"ACCOUNTS\"]/li[2]/a"); 
	
	public By getTxtEmail() {
		return txtEmail;
	}
	
	public By getTxtSenha() {
		return txtSenha;
	}
	
	public By getBtnLogin() {
		return btnLogin;
	}
	
	public By getMenuAccounts() {
		return menuAccounts;
	}
	
	public By getSubMenuSuppliers() {
		return subMenuSuppliers;
	}
	
}
