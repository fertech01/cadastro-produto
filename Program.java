package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {

		// Chamando libraries...
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Inputs (entrada de dados)...
		System.out.println("");
		System.out.println("               Cadastro de produtos.           ");
		System.out.println("-----------------------------------------------");
		System.out.println("");
		System.out.print("Nome do produto: ");
		String nome = sc.nextLine();
		System.out.println("Marca: ");
		String marca = sc.nextLine();
		System.out.print("Preço do produto: R$");
		

		// Criando construtor customizado.
		// Constr.customizados servem para garantir que a classe não fique com atributos
		// vazios.
		Product produto = new Product(nome, marca);

		// Saída de dados...
		System.out.println();
		System.out.println(produto);
		System.out.println();

		// Se forem add novos produtos...
		System.out.println("-----------------------------------------------");
		System.out.println("Produtos a serem adicionados no estoque:         ");
		int quantidade = sc.nextInt();
		if (quantidade > 0) {

			produto.addEstoque(quantidade);
			System.out.println("Atualização: ");
			System.out.println(produto);
		}

		// Se forem remover produtos...
		System.out.println("-----------------------------------------------");
		System.out.print("Produtos a serem removidos do estoque: ");
		quantidade = sc.nextInt();
		if (quantidade > 0) {

			produto.removeProduto(quantidade);
			System.out.println("Atualização: ");
			System.out.println(produto);
		}
		sc.close();
	}
}
