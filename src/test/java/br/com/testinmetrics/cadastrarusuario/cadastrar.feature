Feature: Fazer o cadastro de um novo ACCOUNTS -> SUPPLIER

Scenario Outline: Realizar um cadastro de um novo ACCOUNTS -> SUPPLIER

 	Given que faco login no sistema com o email "<email>" e senha "<senha>"
 	 When sistema carrega a tela inicial
      And clico no menu 'ACCOUNTS' e no sub menu 'SUPPLIERS'
      And sistema carrega a tela de SUPPLIERS MANAGEMENT
      And clico no botao ADD
      And preencho os campos First Name
      And Preencho o campo Last name 
      And Preencho o campo email
      And Preencho o campo password
      And Preencho o campo country
      And clico no botao submit
      Then conta cadastro efetuado com sucesso
 

 	Examples:
 	|email                | senha     |
 	|admin@phptravels.com | demoadmin |
 	
 	
 	
 	
 	