# Exercício Interfaces e Lambda em Java
Este repositório contém a solução do exercício proposto na aula **"Exercícios: Interfaces e Lambda em Java"** do **Bootcamp Back-End Java Santander** pela **plataforma DIO (Digital Innovation One)**.

## 📚 Descrição do exercício

O desafio consistia em criar um sistema para **enviar mensagens de marketing** por diferentes canais de comunicação. Todos os serviços deveriam ter a **mesma interface de envio**, e a aplicação deveria conseguir enviar **a mesma mensagem para diferentes canais**, como:

- SMS  
- E-mail  
- Redes Sociais  
- WhatsApp

A proposta tinha como objetivo o uso dos conceitos de:
- **Interfaces**
- **Polimorfismo**
- **Programação orientada a objetos (POO)**
- **Interface funcional**
- **Expressões Lambda**

## 🧠 O que foi aplicado

- Criação de uma **interface `ServicoMensagem`**
- Implementações concretas para cada tipo de serviço (versão tradicional)
- Uso de **expressões lambda** para simplificar implementações (versão moderna)
- Demonstração prática de **flexibilidade e reutilização de código**

## ✅ Estrutura do projeto

src/
├── ServicoMensagem.java        # Interface funcional
├── SMS.java                    # Implementação tradicional (opcional)
├── Email.java
├── RedesSociais.java
├── WhatsApp.java
└── EnviadorMensagens.java      # Classe principal com o método main
Também foi apresentada uma segunda versão com uso direto de lambda expressions, sem necessidade de classes separadas.

🚀 Como executar
Clone o repositório:

git clone https://github.com/seu-usuario/envio-mensagens-java.git
Compile os arquivos:

javac EnviadorMensagens.java
Execute:

java EnviadorMensagens

📸 Exemplo de saída

Enviando SMS: Promoção imperdível para você!
Enviando E-mail: Promoção imperdível para você!
Publicando em Redes Sociais: Promoção imperdível para você!
Enviando WhatsApp: Promoção imperdível para você!

📌 Autor
Exercício realizado como parte do Bootcamp Back-End Java Santander na DIO.
