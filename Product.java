package entities;

public class Product {

	// Declarando variáveis.

	// IMPORTANTE: Não se esqueça de que o atributo é public!!! Caso contrário, não
	// funcionará...

	public String nome;
	public String marca;
	public int quantidade;
	public double valor;

	// Customizando o construtor.
	public Product(String nome, String marca, double valor, int quantidade) {
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
		this.quantidade = quantidade;

	}
	
	//Construtor opcional.
	public Product(String nome, String marca) {
		this.nome = nome;
		this.marca = marca;
		quantidade = 0;
		valor = 0.00;
	}

	// Criando métodos.
	public double valorTotalEstoque() {
		return quantidade * valor;
	}

	public void addEstoque(int quantidade) {
		// this serve para auto referenciar um parâmetro do método.
		this.quantidade += quantidade;
	}

	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	// Você precisa declarar como você quer que a variável apareça utilizando
	// toString().

	public String toString() {
		return "Produto: " + nome + ", marca: " + marca + " - R$ " + String.format("%.2f", valor) + " - Unidades: "
				+ quantidade + " - Valor total no estoque:R$ " + String.format("%.2f", valorTotalEstoque());
	}
}
