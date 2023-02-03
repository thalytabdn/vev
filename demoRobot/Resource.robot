*** Settings ***
Library     SeleniumLibrary

*** Variables ***
${BROWSER}              Chrome
${URL}                  https://ava.computacao.ufcg.edu.br/moodle/login/index.php
${HEADER_LOGIN}         css=div.page-header-headings
${CONTENT_APOS_LOGIN}   css=h5#instance-10-header.card-title.d-inline
${CAMPO_USERNAME}       username
${CAMPO_DISCIPLINA}     dom=document.getElementsByClassName("card-img")[2]
${CAMPO_PASSWORD}       password
${BOTAO_ACESSAR}        loginbtn
${HEADER_DISCIPLINA}    Curso: Verificação e Validação


*** Keywords ***
Acessar ava
    Open Browser                     ${URL}  ${BROWSER}
    Title Should Be                  Ambiente Virtual de Aprendizagem @ComputaçãoUFCG: Acesso ao site

Realizar login
    Input Text                       ${CAMPO_USERNAME}    username
    Input Text                       ${CAMPO_PASSWORD}    123456
    Click Element                    ${BOTAO_ACESSAR}
    Wait Until Element Is Visible    ${CONTENT_APOS_LOGIN}

Acessar disciplina verificação e validação
    Wait Until Page Contains Element    ${CAMPO_DISCIPLINA}  
    Click Element                       ${CAMPO_DISCIPLINA}
    Title Should Be                     ${HEADER_DISCIPLINA}

Fechar navegador
    Close Browser

