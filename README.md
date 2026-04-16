# Sistema Bancário em Java: Polimorfismo e Abstração

Este projeto simula um sistema de gestão de contas bancárias, focado na aplicação prática de pilares da Programação Orientada a Objetos (POO).

## 💡 Conceitos Demonstrados

- **Classes Abstratas**: A classe `Conta` serve como um modelo (template), garantindo que todos os tipos de conta possuam métodos essenciais, mas impedindo a criação de uma conta "genérica".
- **Polimorfismo de Sobrescrita (@Override)**: O método `sacar` é implementado de forma distinta em `ContaCorrente` (que possui taxa de operação) e `ContaPoupanca`.
- **Encapsulamento**: Uso rigoroso de modificadores de acesso `private` para atributos e métodos `public` (Getters/Setters) para controle de estado.
- **Manipulação de Listas Genéricas**: Uso de `ArrayList<Conta>` para processar diferentes tipos de objetos através de uma única referência comum.

## 🛠️ Como Compilar e Executar

Certifique-se de ter o JDK instalado. Como os ficheiros estão na raiz do projeto, compile e execute diretamente:

```bash
# Compilar todos os ficheiros .java
javac *.java

# Executar a classe principal
java MainContas
