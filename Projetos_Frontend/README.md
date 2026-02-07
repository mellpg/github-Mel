# Calculadora Web Simples

## Descrição
Projeto de uma calculadora web que realiza operações aritméticas básicas diretamente no navegador. Não utiliza bibliotecas externas ou backend.

## Estrutura do código
O projeto está em um único arquivo HTML:
- `<style>` → contém o CSS responsável pelo layout e aparência.
- `<script>` → contém a lógica da calculadora.
- `<body>` → contém a interface com o visor e os botões organizados em tabela.

## Funcionamento da interface
- O campo `input` com id `visor` atua como visor, mostrando números e resultados.
- Botões numéricos e operadores chamam funções JavaScript através de `onclick`.

## Lógica do JavaScript

### Função `digitar(valor)`
- Adiciona o número ou operador clicado ao visor.

### Função `calcular()`
- Lê a expressão digitada no visor.
- Avalia a expressão usando `eval()`.
- Caso ocorra algum erro, exibe `"Erro"` no visor.

### Função `limpar()`
- Limpa o visor, removendo valores anteriores.

## Tecnologias utilizadas
- HTML5
- CSS3
- JavaScript (ES6)

## Como executar
Basta abrir o arquivo HTML em qualquer navegador moderno.

## Observações técnicas
- O uso de `eval()` simplifica a implementação, mas não é seguro para projetos reais.
- Em versões futuras, recomenda-se criar um parser de expressões matemáticas próprio.
