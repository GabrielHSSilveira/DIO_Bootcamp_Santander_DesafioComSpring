Projeto para o desafio proposto de padrões com String na tilha backend com Java, do bootcamp Santander 2024.

O projeto segue a seguinte estrutura de diretórios:

-src/main/java: Contém os pacotes e classes Java do projeto.
  -one.digitalinnovation.gof.controller: Controladores REST da API.
  -one.digitalinnovation.gof.servico.cliente: Classes relacionadas aos clientes.
  -one.digitalinnovation.gof.servico.cliente.infocliente: Classes relacionadas às informações do cliente, como o endereço.
  -one.digitalinnovation.gof.service: Interfaces e implementações dos serviços.
-src/main/resources: Contém arquivos de recursos, como arquivos de propriedades e de configuração.
-src/test/java: Contém testes unitários e de integração.

O projeto explora os seguintes padrões de projeto:

-Singleton
-Strategy/Repository
-Facade

Ele utiliza o Spring Framework, incluindo o Spring Data JPA e o Feign para integração com a API ViaCEP.
