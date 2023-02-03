*** Settings ***
Resource            Resource.robot

*** Test Cases ***

Validar login
    Acessar ava
    Realizar login

Validar acesso ao ava da disciplina
    Acessar disciplina verificação e validação
    Fechar navegador