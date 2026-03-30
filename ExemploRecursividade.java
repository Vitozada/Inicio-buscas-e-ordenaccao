package recursividade;

import java.util.Scanner;

public class ExemploRecursividade {
	
	//função recursiva -- linha por linha
	
	public static int calcularFatorial (int n) {
		
		if (n == 1) {
			return 1;
		}
	
		int resultadoParcial = calcularFatorial(n-1);
		return n * resultadoParcial;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro positivo:  ");
		int numero = ler.nextInt();
		
		if (numero < 0) {
			System.err.println("erro, o numero dever ser positivo");
			return; // encerra o programa
		}
		
		int resultado = calcularFatorial(numero);
		System.out.println("O fatorial de " + numero + " é : " + resultado);
		
	}
}
