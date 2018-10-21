package br.com.testinmetrics.cadastrarusuario;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.testinmetrics.pageobject.CadastroPage;
import br.com.testinmetrics.pageobject.LoginPage;
import br.com.testinmetrics.utils.Driver;

public class Business {

	private LoginPage login;
	private CadastroPage cadastro;
	private static WebDriverWait wait;

	public Business() {

		login = new LoginPage();
		cadastro = new CadastroPage();
		wait = new WebDriverWait(Driver.getDriver(), 10);
	}

	public void acessarSistema(String email, String senha) {
		// Aguardo o campo de texto de Email ficar visivel
		wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(login.getTxtEmail())));

		// Aqui insiro o Email'
		Driver.getDriver().findElement(login.getTxtEmail()).sendKeys(email);
		// Aqui insiro a senha
		Driver.getDriver().findElement(login.getTxtSenha()).sendKeys(senha);
		// Aqui clico em Logar
		Driver.getDriver().findElement(login.getBtnLogin()).click();
	}

	public void aguardaCarregamentoPaginaInicial() {
		// Aguardo o menu Accounts ficar visivel
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.getMenuAccounts()));
	}

	public void acessarTelaDeCadastro() {
		Driver.getDriver().findElement(login.getMenuAccounts()).click();
		wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(login.getSubMenuSuppliers())));
		Driver.getDriver().findElement(login.getSubMenuSuppliers()).click();
	}

	public void clicarBotaoADD() {
		Driver.getDriver().findElement(cadastro.getbtnAdd()).click();
	}

	public void firstName() {
		Driver.getDriver().findElement(cadastro.gettxtFirstName()).sendKeys("Danilo");
		//Driver.getDriver().findElement(cadastro.gettxtFirstName()).sendKeys(FirstName);
		
	}

	public void lastName() {
		Driver.getDriver().findElement(cadastro.gettxtLastName()).sendKeys("Souza");
		//Driver.getDriver().findElement(cadastro.gettxtLastName()).sendKeys(lastName);
		
	}

	public void email() {
		Driver.getDriver().findElement(cadastro.gettxtEmail()).sendKeys("danilo.teste@teste.com");
		//Driver.getDriver().findElement(cadastro.gettxtEmail()).sendKeys(emailCad);
	}

	public void password() {
		Driver.getDriver().findElement(cadastro.gettxtPassword()).sendKeys("123456");
		//Driver.getDriver().findElement(cadastro.gettxtPassword()).sendKeys(password);
	}

	public void country() {
		
		
		Driver.getDriver().findElement(By.cssSelector("#s2id_autogen1 > a > span.select2-chosen")).click();
		Driver.getDriver().findElement(By.className("select2-input")).sendKeys("Brazil");
	    Driver.getDriver().findElement(By.className("select2-input")).sendKeys(Keys.ARROW_DOWN);
		Driver.getDriver().findElement(By.className("select2-input")).sendKeys(Keys.ENTER);
		
		
	}

	public void submit() {

		Driver.getDriver().findElement(cadastro.getbtnSubmit()).click();

	}

	public void msgCadastro() {

		String texto = Driver.getDriver().findElement(cadastro.msgCadastro()).getText();
		assertEquals("CHANGES SAVED!", texto);
	}

}
