package recursividade;

import java.util.Arrays;
import java.util.Scanner;

public class ExemploRecursividade2 {
	
	public static int buscarElemento(int [] array, int alvo, int inicio, int fim) {
		
		if (inicio > fim) {
			return -1;
		}
		
		int meio = (inicio + fim ) / 2;
		
		if (array[meio] == alvo) {
			return meio;
		}
		
		if (alvo < array[meio]) {
			return buscarElemento(array, alvo, inicio, meio-1);
		}
		
		
			return buscarElemento(array, alvo, meio + 1, fim);
		
		
	}	
	//funçao auxiliar
	
			public static void mostrarArray(int [] array) {
				System.out.print("Arr: [");
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i]);
					if (i < array.length - 1) {
						System.out.print(" , ");
					}
				}
				System.out.print(" ]");
			}
	
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Quantos elementos temos no array?");
		int tamanho = ler.nextInt();
		
		int[] numeros = new int [tamanho];
		
		System.out.println("\nDigite os elementos do array (Serao ordenados!) :");
		
		for (int i = 0; i < tamanho; i++) {
			System.out.println("elemento " + (i+1) + " : ");
			numeros[i] = ler.nextInt();
		}
		
		Arrays.sort(numeros);
		System.out.println("\nArray ordenado:");
		mostrarArray(numeros);
		
		System.out.println("\nDigite o elemento que você quer buscar: ");
		int alvo = ler.nextInt();
		
		int posicao = buscarElemento(numeros, alvo, 0, tamanho -1);
		
		if (posicao == -1) {
			System.out.println("Elemento "+ alvo + " Não encontrado");
		}else {
			System.out.println("Elemento " + alvo + " Encontrado na posição: " + posicao);
		}
		
	}
}
