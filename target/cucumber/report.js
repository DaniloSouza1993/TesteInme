$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cadastrar.feature");
formatter.feature({
  "line": 1,
  "name": "Fazer o cadastro de um novo ACCOUNTS -\u003e SUPPLIER",
  "description": "",
  "id": "fazer-o-cadastro-de-um-novo-accounts--\u003e-supplier",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Realizar um cadastro de um novo ACCOUNTS -\u003e SUPPLIER",
  "description": "",
  "id": "fazer-o-cadastro-de-um-novo-accounts--\u003e-supplier;realizar-um-cadastro-de-um-novo-accounts--\u003e-supplier",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "que faco login no sistema com o email \"\u003cemail\u003e\" e senha \"\u003csenha\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "sistema carrega a tela inicial",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "clico no menu \u0027ACCOUNTS\u0027 e no sub menu \u0027SUPPLIERS\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "sistema carrega a tela de SUPPLIERS MANAGEMENT",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "clico no botao ADD",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "preencho os campos First Name",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Preencho o campo Last name",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Preencho o campo email",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Preencho o campo password",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Preencho o campo country",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "clico no botao submit",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "conta cadastro efetuado com sucesso",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "fazer-o-cadastro-de-um-novo-accounts--\u003e-supplier;realizar-um-cadastro-de-um-novo-accounts--\u003e-supplier;",
  "rows": [
    {
      "cells": [
        "email",
        "senha"
      ],
      "line": 20,
      "id": "fazer-o-cadastro-de-um-novo-accounts--\u003e-supplier;realizar-um-cadastro-de-um-novo-accounts--\u003e-supplier;;1"
    },
    {
      "cells": [
        "admin@phptravels.com",
        "demoadmin"
      ],
      "line": 21,
      "id": "fazer-o-cadastro-de-um-novo-accounts--\u003e-supplier;realizar-um-cadastro-de-um-novo-accounts--\u003e-supplier;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "Realizar um cadastro de um novo ACCOUNTS -\u003e SUPPLIER",
  "description": "",
  "id": "fazer-o-cadastro-de-um-novo-accounts--\u003e-supplier;realizar-um-cadastro-de-um-novo-accounts--\u003e-supplier;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "que faco login no sistema com o email \"admin@phptravels.com\" e senha \"demoadmin\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "sistema carrega a tela inicial",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "clico no menu \u0027ACCOUNTS\u0027 e no sub menu \u0027SUPPLIERS\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "sistema carrega a tela de SUPPLIERS MANAGEMENT",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "clico no botao ADD",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "preencho os campos First Name",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Preencho o campo Last name",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Preencho o campo email",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Preencho o campo password",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Preencho o campo country",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "clico no botao submit",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "conta cadastro efetuado com sucesso",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "admin@phptravels.com",
      "offset": 39
    },
    {
      "val": "demoadmin",
      "offset": 70
    }
  ],
  "location": "_Steps.acessarSistema(String,String)"
});
formatter.result({
  "duration": 1274094723,
  "status": "passed"
});
formatter.match({
  "location": "_Steps.aguardaCarregamentoPaginaInicial()"
});
formatter.result({
  "duration": 5430069539,
  "status": "passed"
});
formatter.match({
  "location": "_Steps.acessarTelaSuppliers()"
});
formatter.result({
  "duration": 2055169606,
  "status": "passed"
});
formatter.match({
  "location": "_Steps.aguardaCarregamentoTelaCadastro()"
});
formatter.result({
  "duration": 145966,
  "status": "passed"
});
formatter.match({
  "location": "_Steps.clico_no_botao_ADD()"
});
formatter.result({
  "duration": 2717807562,
  "status": "passed"
});
formatter.match({
  "location": "_Steps.preencho_os_campos_First_Name()"
});
formatter.result({
  "duration": 172075026,
  "status": "passed"
});
formatter.match({
  "location": "_Steps.preencho_o_campo_Last_name()"
});
formatter.result({
  "duration": 139879168,
  "status": "passed"
});
formatter.match({
  "location": "_Steps.preencho_o_campo_email()"
});
formatter.result({
  "duration": 318626456,
  "status": "passed"
});
formatter.match({
  "location": "_Steps.preencho_o_campo_assword()"
});
formatter.result({
  "duration": 157458998,
  "status": "passed"
});
formatter.match({
  "location": "_Steps.preencho_o_campo_country()"
});
formatter.result({
  "duration": 901622622,
  "status": "passed"
});
formatter.match({
  "location": "_Steps.clico_no_botao_submit()"
});
formatter.result({
  "duration": 2375422789,
  "status": "passed"
});
formatter.match({
  "location": "_Steps.conta_cadastro_efetuado_com_sucesso()"
});
formatter.result({
  "duration": 163224672,
  "status": "passed"
});
});