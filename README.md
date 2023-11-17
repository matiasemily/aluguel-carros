# CarRent
Projeto desenvolvido por mim, Emily Matias, em seleção de vaga júnior na IBM, em novembro de 2023. Utilizei conhecimentos adquiridos no Bootcamp Java + Node.js + Angular e documentações respectivas.

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