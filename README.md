# AluraFood - Arquitetura de Microsserviços

Projeto de um sistema de pedidos de comida, implementado com arquitetura de microsserviços com Java utilizando Spring, Eureka Server, Docker e RabbitMQ. 

- Projeto realizado durante a [Formação Java e Microsserviços com Spring e RabbitMQ](https://cursos.alura.com.br/formacao-java-microsservicos) , da plataforma [Alura](https://www.alura.com.br/)

## Projeto
O projeto utiliza a arquitetura de microservices, com os seguintes serviços:

* <b>server</b>: servidor de descoberta de serviços, para que os serviços possam se comunicar entre si
* <b>gateway</b>: serviço responsável por fazer o roteamento das requisições entre os serviços
* <b>pedidos</b>: serviço responsável por gerenciar os pedidos
* <b>pagamentos</b>: serviço responsável por gerenciar os pagamentos
* <b>avaliação</b>: serviço responsável por registrar a avaliação do pedido após a realização do pedido

## Requisições

A coleção alurafood na raíz do projeto contém as seguintes requisições:

* <b>pagamentos</b>: lista todos os pagamentos cadastrados.
* <b>pagamentos-por-id</b>: retorna um pagamento específico, com base em seu ID.
* <b>criar-pagamento</b>: cria um novo pagamento.
* <b>atualizar-pagamento</b>: atualiza um pagamento existente.
* <b>deletar-pagamento</b>: deleta um pagamento existente.
* <b>confirmar-pagamento</b>: confirma um pagamento existente.
* <b>pedidos</b>: lista todos os pedidos cadastrados.
* <b>pedidos-por-id</b>: retorna um pedido específico, com base em seu ID.
* <b>criar-pedido</b>: cria um novo pedido.
* <b>atualizar-status-pedido</b>: atualiza o status de um pedido existente.
* <b>porta-pedidos-ms</b>: retorna qual a porta de origem do serviço retornado da requisição.

## Principais Tecnologias Utilizadas
O projeto utiliza as seguintes tecnologias e frameworks:
* Java 21
* Spring Boot 3
* Spring Cloud
* Eureka
* Docker
* PostgreSQL
* RabbitMQ

## Gerenciando Mensagerias com RabbitMQ
para acessar o rabbitMQ é preciso instânciar a imagem no Docker com o seguinte comando:
```
# latest RabbitMQ 3.13
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.13-management
```
após instanciado, acessar a página <a>http://localhost:15672</a>

<hr>

### Contribuições
* Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas, propor melhorias ou enviar solicitações de pull.
<hr>

[![Linkedin Badge](https://img.shields.io/badge/-JeanCarlo-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/jeancarlotorre619b/)](https://www.linkedin.com/in/jeancarlotorre619b/)

⭐️ Star o projeto

🐛 Encontrar e relatar issues