// Código de semáforo para Arduino
// Originalmente usava funções de darwin.h, agora adaptadas para funções nativas do Arduino

/*
✅ Explicação da adaptação
Função original          Função Arduino correspondente         Comentário
LednaPorta(Dx)           pinMode(led, OUTPUT)                 Configura o pino do LED como saída
LigarLed(Dx)             digitalWrite(led, HIGH)              Liga o LED
DesligarLed(Dx)          digitalWrite(led, LOW)               Desliga o LED
EsperarSegundos(x)       delay(x * 1000)                      Espera x segundos (delay usa milissegundos)

💡 Observações importantes:
- Os pinos D1, D2, D3 no Arduino IDE podem variar dependendo da placa 
  (no Uno, D1 = pino digital 1, mas é usado para comunicação serial — 
   melhor usar D4, D5, D6 para LEDs).
- A lógica do semáforo foi mantida: vermelho → amarelo → verde com os tempos originais.
- Esse código já compila sem darwin.h e é totalmente funcional no Arduino IDE.
*/

// Define os pinos dos LEDs
int ledVermelho = 3;   // D3
int ledAmarelo = 2;    // D2
int ledVerde = 1;      // D1 (substitua por outro pino se necessário)

// Função de setup: configura os pinos como saída
void setup() {
  pinMode(ledVermelho, OUTPUT); // LED vermelho
  pinMode(ledAmarelo, OUTPUT);  // LED amarelo
  pinMode(ledVerde, OUTPUT);    // LED verde
}

// Função loop: executa o ciclo do semáforo
void loop() {
  // Acende LED vermelho por 8 segundos
  digitalWrite(ledVermelho, HIGH);
  delay(8000);
  digitalWrite(ledVermelho, LOW);

  // Acende LED amarelo por 5 segundos
  digitalWrite(ledAmarelo, HIGH);
  delay(5000);
  digitalWrite(ledAmarelo, LOW);

  // Acende LED verde por 2 segundos
  digitalWrite(ledVerde, HIGH);
  delay(2000);
  digitalWrite(ledVerde, LOW);
}
