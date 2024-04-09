<h1 align="center">
    🚀 Padrões de Projeto em uma API REST
</h1>

Repositório com as implementações básicas de alguns dos Padrões de Projeto mais utilizados no Spring Framework, sendo eles:
* **Singleton:** Permite a criação de uma única instância de uma classe e fornecer um modo para recupera-la.
* **Strategy:** Usado para simplificar a variação de algoritmos para a reslução de um mesmo problema.
* **Facade:** Prover uma interface que reduza a complexidade nas integrações com subsistemas.

No Spring Framework esses padrões são alcançados através:
  - **Singleton:** @Bean e @Autowired.
  - **Strategy:** @Service e @Repository
  - **Facade:** Esta API REST foi construída com o mesmo objetivo desse padrão, abstrair a complexidade das seguintes
      integrações: **Spring Data JPA** e **ViaCEP (Feign)**.
