# author: Felipe Almeida da Silva
# date: 04-05-2020
Feature: Generate a profile
  Record the generated profile information

  @4devsWeb @generate4Devs
  Scenario: Record the generated profile information
    Given what a milestone for not generating scores
    When click the button 'GERAR PESSOA'
    Then I collect all the necessary data