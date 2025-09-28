# Arduino Blink - Explicação do Código

Este projeto faz um LED (ou outro dispositivo) conectado ao pino digital 10 do Arduino piscar com intervalos de 1 segundo.

---

## Código

```cpp
// Função de configuração (executada uma única vez quando o Arduino é ligado ou resetado)
void setup()
{
  // Define o pino 10 do Arduino como uma saída digital
  // pinMode(pino, modo) → modo pode ser INPUT, OUTPUT ou INPUT_PULLUP
  pinMode(10, OUTPUT);
}

// Função principal (loop) → roda repetidamente após o setup terminar
void loop()
{
  // Envia nível lógico "alto" (5V) para o pino 10 → liga o LED ou outro dispositivo conectado
  digitalWrite(10, HIGH);

  // delay(ms) → pausa a execução por uma quantidade de milissegundos
  // Aqui: espera 1000 ms (1 segundo)
  delay(1000);

  // Envia nível lógico "baixo" (0V) para o pino 10 → desliga o LED
  digitalWrite(10, LOW);

  // Espera mais 1000 ms (1 segundo) antes de repetir o loop
  delay(1000);
}
Conceitos das Sintaxes
setup(): função especial no Arduino que roda apenas uma vez no início. Serve para configurar pinos, inicializar comunicação etc.

loop(): função principal do Arduino, executa repetidamente em loop infinito.

pinMode(pino, modo): define se um pino vai ser usado como entrada (INPUT) ou saída (OUTPUT).

digitalWrite(pino, valor): envia um sinal digital (apenas dois estados possíveis: HIGH = ligado / 5V, LOW = desligado / 0V).

delay(ms): pausa a execução por uma quantidade de milissegundos (1000 ms = 1 segundo).

Resumo
Esse código faz o LED (ou qualquer componente conectado no pino digital 10) piscar, ligando por 1 segundo, desligando por 1 segundo, e repetindo isso infinitamente.
