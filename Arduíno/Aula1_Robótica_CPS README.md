# 🤖 Introdução à Robótica, Android, Arduino e Eletrônica Básica

---

## 🔹 O que é Robótica?

A **Robótica** é a ciência que estuda as tecnologias associadas à **concepção, construção e programação de robôs**.  
Um robô é um **mecanismo automático** que utiliza **circuitos integrados** para realizar atividades e movimentos humanos, simples ou complexos.

📌 Em resumo:  
> Robótica é a união de **eletrônica, mecânica e programação** para criar sistemas autônomos ou semi-autônomos.

---

## 🔹 Android: O que é?

O **Android** é um **sistema operacional desenvolvido pela Google**, baseado no **kernel Linux**, projetado principalmente para **dispositivos móveis** como **smartphones e tablets**, mas também utilizado em:

- 📱 Smartphones e Tablets  
- 📺 Smart TVs  
- ⌚ Smartwatches  
- 🚗 Sistemas automotivos  

### ✅ Principais Características:
- **Desenvolvido pela Google** → atualizado e mantido pela empresa.  
- **Baseado no Linux** → código aberto, flexível e seguro.  
- **Sistema mais popular do mundo** → +2,5 bilhões de usuários.  
- **Código aberto e personalizável** → fabricantes e usuários podem modificar.  
- **Integração com Google Services** → Play Store, Gmail, Drive, Maps etc.  
- **Versatilidade** → funciona em diversos dispositivos além dos celulares.  

---

## 🔹 Arduino IDE e Arduino Físico

### 🖥️ Arduino IDE
O **Arduino IDE** é o ambiente de desenvolvimento onde escrevemos o código (em C/C++) e enviamos para a placa Arduino.  

### 🔌 Arduino Físico
O **Arduino físico** é a placa de prototipagem eletrônica.  
Ela contém um **microcontrolador** que interpreta o código enviado pelo computador e interage com os componentes (LEDs, sensores, motores, etc.).

📌 Resumindo:
- **IDE** → onde você programa.  
- **Placa Arduino** → onde o código é executado.  

---

## 🔹 O que é um LED?

O **LED** (Light Emitting Diode) é um **diodo emissor de luz**.  
Ele transforma energia elétrica em **luz visível**, sendo muito usado em circuitos eletrônicos.

### Estrutura:
- **Ânodo (+)** → perna maior, lado positivo.  
- **Cátodo (–)** → perna menor, lado negativo.  

---

## 🔹 GND (Terra)

O **GND (Ground)** representa o **ponto de referência elétrica** de um circuito.  
Ele serve como caminho de retorno da corrente, garantindo **estabilidade e segurança**.

📌 Regra prática:  
- **Fio vermelho** → alimentação (+).  
- **Fio preto** → terra (–, GND).

---

## 🔹 Montagem e Programação de um LED no Arduino

### 🔧 Passos práticos:
1. Criar conta no [Tinkercad](https://www.tinkercad.com/) para simular circuitos.  
2. Conectar o **ânodo do LED** em um pino digital do Arduino (ex.: 10).  
3. Conectar o **cátodo do LED** ao GND.  
4. Usar um **resistor (220Ω ou 330Ω)** para proteger o LED.  
5. Programar no Arduino IDE.  

### ⚡ Código Exemplo (Piscar LED):
```cpp
// Função de configuração (executada uma única vez)
void setup() {
  pinMode(10, OUTPUT); // Define pino 10 como saída
}

// Função principal (repete para sempre)
void loop() {
  digitalWrite(10, HIGH); // Liga o LED
  delay(1000);            // Espera 1 segundo
  digitalWrite(10, LOW);  // Desliga o LED
  delay(1000);            // Espera 1 segundo
}
📌 Resultado: O LED pisca a cada segundo.

🔹 Resumo Geral
Robótica → ciência que cria robôs unindo eletrônica, mecânica e programação.

Android → sistema operacional da Google, baseado em Linux, presente em bilhões de dispositivos.

Arduino → placa que executa códigos enviados pelo IDE, controlando componentes eletrônicos.

LED → diodo emissor de luz, com dois terminais: ânodo (+) e cátodo (–).

GND → terra, referência elétrica do circuito.

Programação no Arduino → feita em C/C++, compilada e enviada para o microcontrolador.
