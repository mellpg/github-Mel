// 📌 CONCEITOS FUNDAMENTAIS DE ORIENTAÇÃO A OBJETO

// 🔹 CLASSE: é o molde, a "receita" de como um objeto deve ser
public class Pessoa {
    
    // 🔹 ATRIBUTOS: características da instância (do objeto)
    String nome;
    int idade;

    // 🔹 MÉTODO: ação que o objeto pode executar
    // 🔹 ARGUMENTOS: informações que você passa para o método usar
    void apresentar(String saudacao, int anos) {
        System.out.println(saudacao + ", meu nome é " + nome + " e tenho " + idade + " anos.");
        System.out.println("Argumentos recebidos: " + saudacao + " e " + anos);
    }

    public static void main(String[] args) {
        // 🔹 INSTÂNCIA: objeto criado a partir da classe
        // Analogia: a classe é a receita do bolo, a instância é o bolo assado
        Pessoa pessoa1 = new Pessoa();

        // Definindo atributos da instância
        pessoa1.nome = "Mel";   // o bolo agora tem sabor: "Mel"
        pessoa1.idade = 18;     // o bolo agora tem tamanho: 18 anos

        // Chamando o MÉTODO da instância e passando ARGUMENTOS
        // Analogia: pedir para o bolo "falar" algo específico
        pessoa1.apresentar("Olá", 18); 
        // "Olá" e 18 são os ingrediente
