package br.com.testinmetrics.cadastrarusuario;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import br.com.testinmetrics.utils.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/br/com/testinmetrics/cadastrarusuario",//caminho da feature
				strict = false, // Se tiver steps não mapeados a execução não deve falhar
				monochrome = true, // Visualização do resultado no console
				glue = {"br.com.testinmetrics.cadastrarusuario"}) //Ajuda o cucumber a localizar os passos definidos

public class Runner {

	@BeforeClass
	public static void iniciaDriver() throws Exception {
		Driver.setUpWebDriver();
	}
	
	@AfterClass
	public static void finalizaDriver() throws Throwable {
		Driver.finaliza();
	}
	
}
