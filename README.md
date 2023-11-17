# CarRent
Projeto full-stack de API REST em Java Spring Boot e front-end com Angular realizado por mim, Emily Matias, como parte da seleção de vaga de desenvolvedor(a) júnior full-stack na IBM, desenvolvido entre 14 a 16 de novembro de 2023. Utilizei conhecimentos adquiridos no Bootcamp de Java + Node.js + Angular e documentações respectivas como fonte.

## Informações
- Há dois diretórios principais, `carrent` e `frontcarrent`, como o nome sugere, indicando a stack de cada parte do projeto, sendo o back-end da API na primeira pasta (`carrent`).
- Sobre o banco de dados, no pacote `resources` há `db_data`, que contém o `.sql` com a query necessária para criar as tabelas e populá-las.
- Sobre `@CrossOrigin("*")` na camada de controle, compreendo que essa abordagem não é uma boa prática, e foi aplicada como um quickfix temporário. Estou ciente da importância de uma configuração mais segura e pretendo implementar uma solução mais robusta para gerenciar as origens cruzadas de forma adequada.

### Documentação
- Swagger UI na porta utilizada: http://localhost:8080/swagger-ui/index.html
- Documentação da API na porta utilizada: http://localhost:8080/v3/api-docs

## Completo
- Back-end: Métodos HTTP `GET`, `POST`, `PUT` e `DELETE`.
- Métodos de busca de todos os veículos, e veículos disponíveis.
- Aluguel de veículo atualizando lista.
- Documentação com Swagger UI.

## Incompleto:
- `UserController` e `UserService` ainda precisam de implementação, embora o `UserEntity` esteja definido a base do usuário.

## Ainda a implementar:
- Tratamento mais aprofundado dos dados recebidos no cadastro.
- Adição de input mask no cadastro de veículo.
- Desenvolvimento das páginas de login e do painel do usuário.
- Implementação de testes unitários para o back-end e front-end.
- Adição de timestamps de criação de veículo e cadastro de usuário.

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
- TypeScript 5.2.2
- Node: 18.18.2
- HTML5
- CSS3
- Google Chrome 119.0.6045.159
