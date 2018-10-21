package br.com.testeApi;
import static io.restassured.RestAssured.given;

import org.junit.Test;

import io.restassured.http.ContentType;


public class ApiPost {

	
	@Test
	public void gravaUsuario() {
	    given().
	    	contentType(ContentType.JSON).
	    	body("{\"ID\" : \"11\"}").
	    	body("{\"Password\" : \"1234\"}").
	        body("{\"UserName\" : \"Danilo\"}").
	     when().
	        post("http://fakerestapi.azurewebsites.net/api/Users").
	     then().
	        statusCode(200);
	        
	}
	
	
}
