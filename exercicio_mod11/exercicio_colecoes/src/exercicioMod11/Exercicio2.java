package exercicioMod11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio2 {

	public static void main(String[] args) {
		
		exercicioParteUm();
		exericioParteDois();
	}
	
	private static void exercicioParteUm() {

		// Parte 1 do exercicio
		Scanner sc = new Scanner(System.in);
		Set<String> pessoas = new TreeSet<>(); // Criação da coleção para ordenação dos nomes
		
		System.out.println("Digite o nome das pessoas que gostaria de adicionar a lista separado por vírgula: ");
		String nomePessoas = sc.nextLine(); // Realiza a captura dos nomes separados por vírgula
		
		String[] nomesSeparados = nomePessoas.split(",");  // Utilização do método split para separar os nomes pela vírgula
		for(String nome : nomesSeparados) {
			pessoas.add(nome.trim()); // Utilização do método trim para remover os espaços antes e depois dos nomes
		}
		
		System.out.println("Nomes inseridos e ordenados: ");
		for( String nome : pessoas) {
			System.out.println(nome);
		}
		
		sc.close();
	}
	
	private static void exericioParteDois() {
		
		Scanner sc = new Scanner(System.in);
		List<String> masculino = new ArrayList<>(); // Array para armazenar os valores masculino
		List<String> feminino = new ArrayList<>(); // Array para armazenar os valores feminino
		
		
		while(true) { // Loop para adicionar pessoas e separar por genero até que a condição de saída seja obedecida.
			System.out.println("Digite o nome das pessoas e o seu sexo separado por um traço (-): ");
			String pessoas = sc.nextLine();
			
			if(pessoas.isEmpty()) { // If que verifica se algum valor foi digitado
				System.out.println("Saíndo");
				break;  // Sai do loop caso o valor digitado pelo usuário seja vázio
			}
			
			String[] nomesEGenero = pessoas.split("-"); // Método split para quebrar o nome do genero pelo traço

			if(nomesEGenero.length == 2) { // Verifica se a lista possui um tamanho mínimo de 2, caso tenha executda o código
				String nome = nomesEGenero[0]; // Acessa o índice 0 que contém o nome digitado pelo usuário
				String sexo = nomesEGenero[1]; // Acessa o índice 1 que contém o sexo digitado pelo usuário
				
				if(sexo.equalsIgnoreCase("M")) {
					masculino.add(nome);
				} else if(sexo.equalsIgnoreCase("F")) {
					feminino.add(nome);
				} else {
					System.out.println("Entrada inválida " + pessoas);
				}
			}
			
			System.out.println("\nNomes Masculinos: ");
			for(String nome : masculino) {
				System.out.println(nome);
			}
			
			System.out.println("\nNomes Femininos");
			for (String nome : feminino) {
				System.out.println(nome);
			}
			
			
		}
		
	}
	
}

