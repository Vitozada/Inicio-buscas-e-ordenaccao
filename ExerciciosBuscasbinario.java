package listas;

import java.util.Random;
import java.util.Scanner;

public class ExerciciosBuscasbinario {
	static Random rand = new Random();
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		long [] cpfs = new long [1000000];
		
		System.out.println("Qual o ID do pedido que vc deseja rastrear?\n");
		int alvo = ler.nextInt();
		int posicaoPedido = buscaBinaria(cpfs, alvo);
		
		
		
	}
	
public static void preencherArray(long array[]) {
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextLong(0,9);
		}
		
	}
	
	
	public static int buscaBinaria(long array[], long alvo ) {
		
		int inicio = 0; int fim = array.length - 1;
		
		while (inicio <= fim) {
			int meio = inicio + (fim - inicio) /2;
			
			if (array[meio] == alvo) {
				return meio;
			}
			
			if (array[meio] < alvo) {
				inicio = meio+1;
			}
			else {
				fim = meio -1;
			}
			
		}
		
		return -1;
	}
	
}
