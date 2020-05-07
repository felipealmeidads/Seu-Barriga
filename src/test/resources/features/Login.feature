# date: 06/05/2020
# author: Felipe Almeida da Silva
Feature: Log in
  Log in success

  Background: Create a register with valid data
    Given that perform a valid registration
#    And I fill the fields with valid data
#    When I click on 'CADASTRAR'
#    Then I see the message "Usuário inserido com sucesso"

  @srbarrigaWeb @loginWeb
  Scenario: Log in with registered data
    Given I fill the fields with registered data
    When I click on 'Entrar'
    Then see the message "Bem vindo,"