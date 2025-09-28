# Como o Arduino Entende a Linguagem de Programação

O Arduino é programado usando a linguagem baseada em **C/C++**, mas como ele consegue interpretar e executar o que você escreve?

---

## 1. Código Fonte

Você escreve seu programa no **Arduino IDE** (ou outro editor compatível) usando funções como:

```cpp
setup()
loop()
pinMode()
digitalWrite()
delay()
Essas funções fazem parte da API do Arduino, que abstrai detalhes de baixo nível do hardware.

2. Compilação
Quando você clica em Upload:

O código fonte (.ino) é compilado em código de máquina que o microcontrolador do Arduino consegue entender.

O compilador converte seu código C/C++ em instruções binárias específicas para o chip do Arduino (por exemplo, ATmega328P no Arduino Uno).

3. Upload
O Arduino IDE envia o código compilado para o microcontrolador via USB.

Um bootloader presente no Arduino recebe o código e grava na memória do microcontrolador.

4. Execução
O microcontrolador executa as instruções diretamente da memória.

Ele lê e altera os pinos digitais e analógicos conforme os comandos do seu programa (digitalWrite, analogRead, etc.).

Funções como setup() e loop() são chamadas automaticamente, controlando a lógica do programa.

5. Resumo Visual
bash
Copiar código
Seu código (.ino) → Compilador → Código de máquina → Upload via USB → Microcontrolador executa → Interação com sensores/LEDs/motores
Conclusão
O Arduino não entende C/C++ diretamente. Ele depende do compilador e do bootloader para transformar seu código em instruções que o microcontrolador consegue executar.
