# FiapRide - Missão Orientação a Objetos

##Sobre o Projeto
Este projeto foi desenvolvido como parte de uma atividade acadêmica da FIAP, focada na aplicação de conceitos fundamentais de Orientação a Objetos em Java. O objetivo foi expandir o sistema `FiapRide`, modelando novas classes, garantindo a integridade dos dados e testando as regras de negócio.

## O que foi implementado
Para cumprir os requisitos da atividade, as seguintes etapas foram realizadas na classe `Gato`:

1. **Atualização do UML:** Inclusão do atributo de estado (`energia`) e de pelo menos dois métodos de ação (`comer` e `brincar`).
2. **Criação de Métodos:** Implementação em código dos métodos que alteram ativamente o estado (energia) da instância.
3. **Proteção de Estado:** Adição de regras de negócio (validações com `if` e `return` antecipado) para impedir estados inconsistentes, como o gato ter energia negativa ou receber valores inválidos de esforço/comida.
4. **Testes:** A classe `SistemaPrincipal` foi configurada para instanciar os objetos e rodar baterias de testes práticos, cobrindo tanto cenários com valores válidos quanto inválidos (acionando os tratamentos de erro).