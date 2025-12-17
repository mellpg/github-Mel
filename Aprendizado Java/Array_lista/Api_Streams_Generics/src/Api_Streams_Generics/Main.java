package Api_Streams_Generics;

// O que são API GENERICS?

// observação: API são uma interface de uso
// não são uma implementação INTERNA
// Exemplo: Programador(faz o pedido) -> API(Cardápio) - > Implementação(Cozinha)

// Conceito
// Generics permitem criar classes, métodos e coleções que funcionam
// com qualquer tipo , mantendo segurança de tipo em tempo de compilação

// Com os generics, erros aparecem na hora de compilar
// em vez da hora do runtime

// Exemplo:
/*
 * List lista = new ArrayList();
lista.add("Texto");
lista.add(10); // mistura tipos

String s = (String) lista.get(1); // ERRO em runtime

ERRO: ClassCastException

Com generics:

List<String> lista = new ArrayList<>();
lista.add("Texto");
// lista.add(10); ❌ erro de compilação

Uso na vida real:
List<Pedido>

Optional<String>

Map<String, BigDecimal>

Repositórios (Repository<T>)

APIs, frameworks (Spring, Hibernate)


O que são STREAMS API?

Conceito:
Permite processar coleções de dados de forma declarada
Como se fosse uma linha de montagem

Forma antiga (Imperativa)

for (Pedido p : pedidos) {
    if (p.getValor().compareTo(new BigDecimal("100")) > 0) {
        System.out.println(p);
    }
}


Com Stream 

pedidos.stream()
       .filter(p -> p.getValor().compareTo(new BigDecimal("100")) > 0)
       .forEach(System.out::println);

Aplicação na vida real:

Filtrar pedidos

Somar valores

Buscar dados

Relatórios

APIs REST

Backends reais


RESUMINDO:

Generics -> Permitem criar classes e métodos que funcionam com qualquer tipo, mantendo segurança.

List<String>
Optional<BigDecimal>
Repositorio<Pedido>

Stream -> Permite processar listas de dados (filtrar, transformar, somar, buscar) de forma moderna e legível.

Fluxo:
dados → stream → processamento → resultado



 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
