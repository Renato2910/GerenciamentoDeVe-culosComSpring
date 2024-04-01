
# Sistema de Gerenciamento de Veiculos com Spring

Este é um sistema de gerenciamento de veículos desenvolvido em Java utilizando Spring Framework.

## Funcionalidades

- Cadastro, edição, remoção e consulta de veículos.
- Suporte para diferentes tipos de veículos, como carros e motos.

## Tecnologias Utilizadas

- Java
- Spring Framework (Spring Boot, Spring MVC, Spring Data JPA)

## Estrutura do Projeto

O projeto segue uma arquitetura MVC (Model-View-Controller), onde:

- O pacote `model` contém as entidades de dados, como `Veiculo`, `Carro`, `Moto`, etc.
- O pacote `service` contém a lógica de negócios da aplicação, como `VeiculoService`, `CarroService`, `MotoService`, etc.
- O pacote `controller` contém os controladores responsáveis por receber as requisições HTTP e chamar os métodos apropriados dos serviços.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

