package br.com.testinmetrics.cadastrarusuario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	
	private Business page;

	public Steps() {
		page = new Business();
	}
	
	
	@Given("^que faco login no sistema com o email \"([^\"]*)\" e senha \"([^\"]*)\"$")
	public void acessarSistema(String email, String senha) throws Throwable {
		page.acessarSistema(email, senha);
	}
	
	@When("^sistema carrega a tela inicial$")
	public void aguardaCarregamentoPaginaInicial() throws Throwable {
		page.aguardaCarregamentoPaginaInicial();
	}
	
	@When("^clico no menu 'ACCOUNTS' e no sub menu 'SUPPLIERS'$")
	public void acessarTelaSuppliers() throws Throwable {
		page.acessarTelaDeCadastro();
	}
	
	@When("^sistema carrega a tela de SUPPLIERS MANAGEMENT$")
	public void aguardaCarregamentoTelaCadastro() throws Throwable {
		System.out.println("Ok");
	}
	
	@When("^clico no botao ADD$")
	public void clico_no_botao_ADD() throws Throwable {
	    page.clicarBotaoADD();
	}

	@When("^preencho os campos First Name$")
	public void preencho_os_campos_First_Name() throws Throwable {
	    page.firstName();
	}

	@When("^Preencho o campo Last name$")
	public void preencho_o_campo_Last_name() throws Throwable {
		page.lastName();
	}

	@When("^Preencho o campo email$")
	public void preencho_o_campo_email() throws Throwable {
	    page.email();
	}

	@When("^Preencho o campo password$")
	public void preencho_o_campo_assword() throws Throwable {
	    page.password();
	}

	@When("^Preencho o campo country$")
	public void preencho_o_campo_country() throws Throwable {
	    page.country();
	}

	@When("^clico no botao submit$")
	public void clico_no_botao_submit() throws Throwable {
	    page.submit();
	}

	@Then("^conta cadastro efetuado com sucesso$")
	public void conta_cadastro_efetuado_com_sucesso() throws Throwable {
	    page.msgCadastro();
	}
	
		
}
