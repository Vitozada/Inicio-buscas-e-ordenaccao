package listas;

import java.util.Random;
import java.util.Scanner;

public class ExerciciosBuscas {
	static Random rand = new Random();
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] ids = new int [150];
		preencherArray(ids);
		
		System.out.println("Qual o ID do pedido que vc deseja rastrear?\n");
		int alvo = ler.nextInt();
		int posicaoPedido = rastrearPedido(ids, alvo);
		
		
		System.out.println(posicaoPedido > 0 ? "a posicao do id procurado é: " + posicaoPedido : "o valor não existem ainda no array" );
		
	}
	
	
	public static void preencherArray(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(1,100);
		}
		
	}
	
	public static int rastrearPedido(int array[], int alvo) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == alvo) {
				return i;
			}
		}
		return -1;
	}
	
}
