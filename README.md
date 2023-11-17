# CarRent
Projeto desenvolvido por mim, Emily Matias, em seleção de vaga júnior na IBM, entre 14 a 16 de novembro de 2023. Utilizei conhecimentos adquiridos no Bootcamp Java + Node.js + Angular e documentações respectivas.

## Informações
Sobre o banco de dados, no pacote `resources` há `db_data`, que contém o `.sql` com a query necessária para criar as tabelas e populá-las.

### Documentação
- Documentação da API na porta utilizada: http://localhost:8080/v3/api-docs
- Swagger UI na porta utilizada: http://localhost:8080/swagger-ui/index.html

## Completo
- Back-end: Métodos HTTP `GET`, `POST`, `PUT` e `DELETE`
- Métodos de busca de todos os veículos, e veículos disponíveis
- Aluguel de veículo atualizando lista
- Documentação com Swagger UI

## Incompleto:
- Existe o `UserEntity` (seria para logar um usuário), mas `UserController` e `UserService` ainda precisam de implementação

## Ainda a implementar:
- Input mask no cadastro de veículo
- Página de login e de painel de usuário
- Testes unitários (back-end e front-end)
- Timestamp de criação de veículo e timestamp de cadastro de usuário

## Ambiente de desenvolvimento

- Fedora Linux 38 (Workstation Edition) 64-bit
- GNOME 44.6
- zsh 5.9

### IDEs

- IntelliJ IDEA 2023.2.5 (Community Edition)
- Microsoft Visual Studio Code 1.84.2

### Tecnologias utilizadas

- Java 17
- Apache Maven 3
- Spring Boot 3.1.5
- Spring Doc 2.2.0
- MySQL Community Server - GPL 8.0.35
- MySQL Workbench Community 8.0.34
- Angular CLI: 17.0.0
- Node: 18.18.2
- HTML5
- CSS3
- Google Chrome 119.0.6045.159