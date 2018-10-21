package br.com.testinmetrics.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Driver {

	public static WebDriver driver = null;
	
	private static final String HOME_PAG = "https://www.phptravels.net/admin";
	
	//Classe responsável por criar o Driver
	private static WebDriver setDriver() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\Chrome\\chromedriver.exe");
		return driver = new ChromeDriver();
	}
	
	public static WebDriver getDriver() {
		if(driver == null) {
			driver = setDriver();
		}
		
		return driver;
	}
	
	//Classe responsável por iniciar o Driver do Google Chrome e logar na página inicial
	public static void setUpWebDriver() {
		
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().get(HOME_PAG);
	}

	//Método para encerrar o Driver depois da execução
	public static void finaliza() {
			getDriver().quit();
			 
		}
	}