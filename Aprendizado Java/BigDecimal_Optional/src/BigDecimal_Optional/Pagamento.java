package BigDecimal_Optional;
// Regras de negócio

// valores opcionais
import java.math.BigDecimal;
import java.util.Optional;

// BigDecimal + Enum + Optional

public class Pagamento {
	// Precisão total
	private BigDecimal valor;

	// Enum para garantir que o status seja válido
	private StatusPagamento status;

	// Optional -> Para decidir se irá ter comprovante ou não
	private Optional<String> comprovante;

	// Construtor
	public Pagamento(BigDecimal valor) {
		this.valor = valor;
		this.status = StatusPagamento.PENDENTE;
		this.comprovante = Optional.empty(); // começa vazio
	}

	// Getter do valor

	public BigDecimal getValor() {
		return valor;
	}

	// Aplicação do desconto no pagamento

	public void aplicarDesconto(BigDecimal desconto) {
		// BigDecimal NÃO usa operadores (+ - * /)
		this.valor = this.valor.subtract(desconto);
	}

	// Aumento do valor (multa)
	public void aumentarValor(BigDecimal acrescimo) {
		this.valor = this.valor.add(acrescimo);

	}

	// Comparação de valores
	public boolean outroValor(BigDecimal outro) {
		// compareTo retorna:
		// -1 (menor), 0 (igual), 1 (maior)
		return this.valor.compareTo(outro) > 0;
	}

	// Realizar Pagamento
	public void pagar(String comprovante) {
		this.status = StatusPagamento.PAGO;
		this.comprovante = Optional.of(comprovante);
	}

	// Getter do status
	public StatusPagamento getStatus() {
		return status;
	}

	// Getter do comprovante
	public Optional<String> getComprovante() {
		return comprovante;
	}

}

// Métodos BigDecimal 
/*
 * BigDecimal a = new BigDecimal("10.00"); BigDecimal b = new
 * BigDecimal("2.00");
 * 
 * 
 * a.add(b); // soma a.subtract(b); // subtração a.multiply(b); // multiplicação
 * a.divide(b); // divisão (cuidado com arredondamento)
 * 
 * 
 * a.compareTo(b); // comparação
 * 
 * OBS: bancos, lojas online, impostos, folha de pagamento
 * 
 * Métodos Optional
 * 
 * Optional<String> opt = Optional.of("Texto");
 * 
 * 
 * opt.isPresent(); // existe valor? opt.ifPresent(v -> ...); // executa se
 * existir opt.orElse("Padrão"); // valor padrão opt.orElseThrow(); // lança
 * erro se vazio
 * 
 * OBS: Usado para evitar null e erros em tempo de execução
 * 
 * 
 */
