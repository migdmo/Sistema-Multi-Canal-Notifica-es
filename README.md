# Sistema de Notificações Multicanal

> Exercício de Orientação a Objetos em Java — Classes Abstratas e Polimorfismo

![Java](https://img.shields.io/badge/Java-8%2B-blue) ![OOP](https://img.shields.io/badge/Paradigma-OOP-purple) ![Educacional](https://img.shields.io/badge/Tipo-Educacional-green)

---

## Sobre o projeto

Este projeto é um exercício prático de **Orientação a Objetos** em Java, com foco nos conceitos de **classes abstratas**, **herança** e **polimorfismo**. O sistema simula o envio de notificações por três canais diferentes — E-mail, SMS e WhatsApp — onde cada canal compartilha uma estrutura comum, mas implementa sua própria lógica de envio.

---

## Conceitos abordados

- Classe abstrata com método abstrato e método concreto
- Herança e especialização de classes filhas
- Polimorfismo via referência do tipo da classe pai
- Uso de `ArrayList` com tipos genéricos
- Iteração com `for-each` e despacho dinâmico de métodos

---

## Estrutura do projeto
```
src/
├── CanalNotificacao.java         ← classe abstrata base
├── Email.java                    ← especialização com assunto
├── SMS.java                      ← especialização com número de telefone
├── WhatsApp.java                 ← especialização com status de leitura
└── GerenciadorNotificacoes.java  ← classe de teste (main)
```

---

## Diagrama de classes
```
         ┌──────────────────────────┐
         │    CanalNotificacao      │  <<abstract>>
         │──────────────────────────│
         │ # destinatario: String   │
         │ # mensagem: String       │
         │──────────────────────────│
         │ + exibirDados(): void    │
         │ + enviar(): void         │  <<abstract>>
         └────────────┬─────────────┘
                      │
        ┌─────────────┼──────────────┐
        ▼             ▼              ▼
  ┌───────────────┐ ┌───────────────┐ ┌───────────────┐
  │     Email     │ │      SMS      │ │   WhatsApp    │
  │───────────────│ │───────────────│ │───────────────│
  │ - assunto     │ │ - numero      │ │ - status      │
  │               │ │   Telefone    │ │   Leitura     │
  │───────────────│ │───────────────│ │───────────────│
  │ + enviar()    │ │ + enviar()    │ │ + enviar()    │
  └───────────────┘ └───────────────┘ └───────────────┘
```

---
## Como executar

### Pré-requisitos

- Java JDK 8 ou superior instalado
- Terminal ou IDE de sua preferência (IntelliJ, Eclipse, VS Code)

### Via terminal
```bash
# Compile todos os arquivos
javac src/*.java -d out/

# Execute a classe principal
java -cp out/ GerenciadorNotificacoes
```

---

## Saída esperada
```
Enviando E-mail para joao@email.com com o assunto Reunião: Confirme sua presença.
Enviando SMS para o número 11999998888: Seu código é 4521.
Enviando Zap para maria@zap... Mensagem: Oi, tudo bem?
```

---

## Ponto de atenção — polimorfismo em ação

O trecho abaixo é o coração do exercício. Mesmo que a lista seja do tipo `CanalNotificacao`, cada chamada a `enviar()` executa a implementação correta da classe filha:
```java
List<CanalNotificacao> canais = new ArrayList<>();

canais.add(new Email("joao@email.com", "Confirme sua presença.", "Reunião"));
canais.add(new SMS("Seu código é 4521.", 11999998888));
canais.add(new WhatsApp("maria@zap", "Oi, tudo bem?", "não lido"));

for (CanalNotificacao canal : canais) {
    canal.enviar(); // despacho dinâmico — Java decide em tempo de execução
}
```

---

*Projeto educacional · Orientação a Objetos em Java*
