package Conceito;

// Para não ter duplicidade de código 
public non-sealed class Manager extends Employee {
    // implementação 
    private String login;
    private String password;
    private double comission;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getComission() {
        return comission;
    }

    // Construtor com todos os parâmetros
    public Manager(String code, String name, String address, int age, double salary, String login, String password, double comission) {
        super(code, name, address, age, salary); // chama o construtor da superclasse
        this.login = login;
        this.password = password;
        this.comission = comission;
    }

    // Sobrescrita
    // quando cada colaborador tem um código de identificação no sistema
    // porém, queremos diferenciar Salesman e Manager
    // Colocando um prefixo
    // O QUE FAZER? 
    @Override
    public String getCode() {
        // Caso queira usar uma implementação do código antigo
        return "MN" + super.getCode();
    }

    // Construtor sem argumentos (só um exemplo da aula)
    public Manager() {
        super("", "", "", 0, 0); // Inicializa code, name, address, age e salary com valores padrão
        this.login = "";
        this.password = "";
        this.comission = 0;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    // Implementação do método abstrato da superclasse
    @Override
    public double getfullSalary() {   
        return this.getSalary() + this.getComission();
    }
    
    // Sobrecarga de métodos
    // Vamos imaginar que eu precissasse de um outro getsalary
    //  NÃO CONFUNDIR SOBRESCRITA (OVERRIDE) X SOBRECARGA
    // Sobrescrita -> É quando pegamos um comportamento da classe pai
    // e definindo algo diferente usando o código que ele tem
    // ex: return "MN" + super.getCode();
    // podemos dar um comportamento diferente
    // Já a sobrecarga temos dois métodos diferentes
    // com parâmetros , "assinaturas" diferentes
//    Sobrecarga (Method Overloading)
//    Onde ocorre: Na mesma classe. 
//    Requisitos: Vários métodos com o mesmo nome, mas com diferentes listas de parâmetros (quantidade, tipos ou ordem dos parâmetros). 
//    Propósito: Permitir que uma classe tenha diferentes formas de realizar uma operação, dependendo dos argumentos fornecidos. 
//    Exemplo: Uma classe Calculadora pode ter um método somar(int a, int b) e outro método somar(double a, double b). 
//    Sobrescrita (Method Overriding)
//    Onde ocorre: Entre uma classe pai (superclasse) e uma classe filha (subclasse). 
//    Requisitos: A subclasse reescreve um método herdado da superclasse, tendo a mesma assinatura (mesmo nome e lista de parâmetros) e um tipo de retorno compatível. 
//    Propósito: Fornecer uma implementação específica para um método herdado, alterando o comportamento do método genérico para o contexto da subclasse. 
//   Exemplo: A classe Animal tem um método fazerSom() 
//    e a classe Gato sobrescreve fazerSom()  //  
//    para "miar" (implementação específica do gato)   
//    Pode ter quantas quiser, desde que não teham assinaturas iguais
    public double getfullSalary( double extra) {
    	return this.getfullSalary() + extra;
    }

}

