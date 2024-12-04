# Gerenciador de Pessoas e Salários

Este projeto foi desenvolvido em Java e consiste em um programa que permite cadastrar pessoas e realizar operações relacionadas aos seus salários. Ele utiliza uma interface gráfica baseada em `JOptionPane` para interação com o usuário.

## Funcionalidades Principais:
1. **Cadastrar pessoas**: O programa solicita o número de pessoas a serem cadastradas e coleta dados como nome e salário.
2. **Encontrar a pessoa com maior salário**: Exibe os dados da pessoa com o salário mais alto.
3. **Encontrar a pessoa com menor salário**: Exibe os dados da pessoa com o menor salário.
4. **Buscar pessoa por ID**: Permite encontrar uma pessoa cadastrada utilizando seu identificador único (ID).

## Estrutura do Projeto:
- **Classe `Pessoas`**:
  - Representa uma pessoa com os atributos `id`, `nome` e `salário`.
  - Possui métodos `get` e `set` para manipulação dos dados.
  - Sobrescreve os métodos `equals`, `hashCode` e `toString` para personalização e comparação de objetos.

- **Classe `Principal`**:
  - Contém a lógica principal do programa.
  - Inclui funcionalidades para manipular um vetor de objetos do tipo `Pessoas`, identificar maior/menor salário e buscar pessoas por ID.

## Como Executar:
1. Certifique-se de ter o JDK instalado.
2. Compile os arquivos `Pessoas.java` e `Principal.java`.
3. Execute a classe `Principal` e siga as instruções exibidas na interface gráfica.

Este programa é uma introdução à manipulação de objetos e uso de interfaces gráficas em Java, focando em práticas de organização de código e manipulação de arrays.
