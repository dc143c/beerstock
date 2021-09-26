# Beerstock
Beerstock API made on Java Developer Bootcamp's final course by Digital Innovation One..

O intuito deste projeto é o de fazer uma API de controle de estoque em Java, seguindo a aula do Bootcamp Java Developer da Digital Innovation One.
O a URL base da API é:
```
https://beer-management-api.herokuapp.com/api/v1/beers
```

Tendo as funcionalidades de POST, GET e DELETE, a API também possui um filtro de busca por nome, onde pode ser acessado pela URL, tendo o nome como parâmetro de rota:

```
https://beer-management-api.herokuapp.com/api/v1/beers/{NOMECERVEJA}
```

#Tecnologias
- Lombok
- H2
- Mapstructure
- SpringBoot Data JPA
- Swagger 2
