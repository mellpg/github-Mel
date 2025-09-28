# Projeto Arduino Básico: LED Piscando

## Descrição
Este projeto demonstra o funcionamento básico do **Arduino**, controlando um LED.  
Também explica conceitos de **pinos**, **código** e a importância do **aterramento (GND)**.

---

## Componentes
- 1 Arduino Uno (ou outra placa Arduino)
- 1 LED
- 1 resistor (220Ω ou 330Ω)
- Fios de conexão
- Protoboard

---

## Diagrama do Circuito

5V -----|>--- Resistor --- LED --- GND

scss
Copiar código

- **5V**: fornece energia ao LED  
- **Resistor**: limita a corrente, protegendo o LED  
- **GND**: aterramento do circuito, fechando o caminho da corrente  

> Todos os dispositivos do circuito devem compartilhar o mesmo GND da placa para funcionarem corretamente.

---

## Conceitos Importantes

### Arduino
- Plataforma de prototipagem eletrônica **open-source** (hardware + software)  
- Programado usando a **IDE Arduino**  
- Código enviado à placa é executado continuamente  

### Estrutura Básica do Código
```cpp
void setup() {
  // Configuração inicial: define pino 10 como saída
  pinMode(10, OUTPUT);
}

void loop() {
  // Acende o LED por 1 segundo
  digitalWrite(10, HIGH);
  delay(1000);
  
  // Apaga o LED por 1 segundo
  digitalWrite(10, LOW);
  delay(1000);
}
setup(): executa apenas uma vez

loop(): executa repetidamente enquanto a placa estiver ligada

Aterramento (GND)
O que é: ponto de referência 0V do circuito

Função:

Fecha o circuito, permitindo que a corrente flua

Reduz interferências e ruídos elétricos

Permite que múltiplos módulos funcionem corretamente juntos

Exemplo de uso: o LED só acende se o GND estiver conectado, pois a corrente precisa de um caminho de volta à placa.

Funcionamento
O LED conectado ao pino 10 pisca: 1 segundo aceso, 1 segundo apagado

A corrente flui do pino 10 → LED → resistor → GND, fechando o circuito

