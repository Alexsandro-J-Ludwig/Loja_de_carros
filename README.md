# Sistema de Gerenciamento de Estoque de Carros

Um sistema simples de gerenciamento de estoque de carros para venda, desenvolvido em Java com interação via console. Este projeto permite ao usuário cadastrar carros, gerenciar o estoque e simular a compra ou troca de veículos.

---

## Funcionalidades Principais

* **Cadastro de Carros:** Adiciona novos carros ao estoque, com um limite de até 6 carros inicialmente.
* **Listagem de Carros:** Exibe todos os carros disponíveis no estoque.
* **Seleção de Compra:** Permite ao usuário escolher um carro para "comprar".
* **Opção de Troca:** Oferece a possibilidade de dar um carro usado como parte do pagamento ao comprar um novo.
* **Remoção de Carros:** Remove carros do estoque (seja por compra direta ou por remoção).
* **Interação por Console:** Todo o controle e visualização são feitos através de comandos no terminal.

---

## Estrutura de Pastas e Arquivos

O projeto segue uma estrutura de pastas simples e convencional para projetos Java.

.
├── src/
│   ├── Main.java
│   └── Entidades/
│       ├── Carros.java
│       └── Condicao.java
└── README.md


* `src/`: Contém os arquivos de código-fonte Java.
    * `Main.java`: A classe principal do aplicativo, onde a lógica de interação com o usuário é executada.
    * `Entidades/`: Pacote que agrupa as classes de domínio do projeto.
        * `Carros.java`: Classe responsável por gerenciar a lista de carros no estoque (adicionar, remover, listar, substituir).
        * `Condicao.java`: Enumeração utilizada para padronizar e validar as respostas de "sim" ou "não" do usuário.

---

## Conceitos de Programação Praticados

Este projeto demonstra a aplicação de diversos conceitos fundamentais da programação orientada a objetos (POO) em Java:

* **Enumerações (Enums):** Utilizadas na classe `Condicao` para criar um conjunto fixo de constantes (SIM/NAO), garantindo a validação de entrada do usuário de forma robusta e legível.
* **Listas (`ArrayList`):** A classe `Carros` utiliza um `ArrayList` para armazenar e manipular dinamicamente a coleção de carros no estoque, permitindo adicionar, remover e acessar elementos de forma eficiente.
* **Laços de Repetição (`while`, `for`, `do-while`):** Empregados para controlar o fluxo do programa, como o loop principal de interação com o usuário (`while(true)`, `do-while`), a iteração sobre a lista de carros (`for`), e a validação de entrada.
* **Programação Orientada a Objetos (POO):** O projeto é estruturado com **classes** (`Main`, `Carros`, `Condicao`) e **objetos**, encapsulando comportamentos e dados relacionados. Por exemplo, a classe `Carros` gerencia suas próprias operações de estoque, separando responsabilidades.
* **Entrada e Saída (I/O):** Utiliza a classe `Scanner` para receber entradas do usuário via console e `System.out.println` para exibir informações.

---

## Instruções de Compilação e Execução

Para compilar e executar este projeto, você precisará ter o Java Development Kit (JDK) instalado em sua máquina.

1.  **Clone o Repositório:**
    ```bash
    git clone [https://github.com/Alexsandro-J-Ludwig/Loja_de_carros.git](https://github.com/Alexsandro-J-Ludwig/Loja_de_carros.git)
    cd Loja_de_carros
    ```

2.  **Compile os Arquivos Java:**
    Abra um terminal na raiz do projeto (onde está o `src` e o `README.md`) e execute o seguinte comando:
    ```bash
    javac src/Main.java src/Entidades/Carros.java src/Entidades/Condicao.java
    ```

3.  **Execute o Programa:**
    Após a compilação, você pode executar o programa com o seguinte comando:
    ```bash
    java -cp src Main
    ```

---

## Requisitos do Sistema

* **Java Development Kit (JDK):** Versão 8 ou superior.

---

## Exemplo Básico de Uso com Diálogo via Console

Ao executar o programa, você verá um diálogo interativo no console, similar a este:

Digite o nome do carro:
Fusca
Fusca adicionado com sucesso
Digite o nome do carro:
Civic
Civic adicionado com sucesso
Digite o nome do carro:
Corolla
Corolla adicionado com sucesso
Digite o nome do carro:
Onix
Onix adicionado com sucesso
Digite o nome do carro:
HB20
HB20 adicionado com sucesso
Digite o nome do carro:
Renegade
Renegade adicionado com sucesso
Deseja continuar? (S/N)
N
Fusca
Civic
Corolla
Onix
HB20
Renegade
Escolha um carro:
Civic
Se possui um carro, deseja dar como troca? (S/N)
S
Informe seu carro:
Celta
Civic substituido por Celta com sucesso!
Deseja comprar outro? (S/N):
S
Celta
Corolla
Onix
HB20
Renegade
Escolha um carro:
Renegade
Se possui um carro, deseja dar como troca? (S/N)
N
Renegade removido com sucesso
Deseja comprar outro? (S/N):
N
Obrigado pro comprar conosco


---

## Autor e Licença

**Autor:** Alexsandro Jackson

**Licença:** Este projeto está sob a licença MIT License. Consulte o arquivo `LICENSE` para mais detalhes.

---
