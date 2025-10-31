byte ledPin[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

void setup() {
  for(int i = 0; i < 10; i++) {
    pinMode(ledPin[i], OUTPUT);
    digitalWrite(ledPin[i], HIGH); // Liga todos na inicialização
  }
}

void loop() {
  // Não precisa fazer nada aqui, os LEDs já ficam acesos
}
