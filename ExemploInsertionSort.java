package listasInsertionSort;

import java.util.Arrays;

public class ExemploInsertionSort {
	
	public static void insertionSort(int [] vetor){
		int n = vetor.length;
		
		for(int i = 1; i < n; i++) { 
			
			int chave = vetor[i];
			int antecessorAChave = i-1;
			
			while(antecessorAChave >= 0 && vetor[antecessorAChave] > chave ) {
				vetor[antecessorAChave + 1] = vetor[antecessorAChave];
				antecessorAChave--;
			}
			vetor[antecessorAChave+1] = chave;
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int [] numeros = {62,25,12,22,11};
		
		System.out.println("===Insertion Sort===");
		System.out.println("Array original: " + arrayParaString(numeros));
		
		insertionSort(numeros);
		
		System.out.println("Array ordenado: " + arrayParaString(numeros));
		// saida esperada: [11,12,22,25,64]
		
		
		// teste com array quase ordenado (vantagem do insertion Sort)
		
		int[] quaseOrdenado = {1,2,3,5,4,6,7,8,9,10};
		System.out.println("\n===Insertion Sort===");
		System.out.println("Array original: " + arrayParaString(quaseOrdenado));
		
		insertionSort(quaseOrdenado);
		
		System.out.println("Array ordenado: " + arrayParaString(quaseOrdenado));
		
	}
	
	
	public static String arrayParaString(int [] vetor) {
	
		StringBuilder sb = new StringBuilder();  //recurso em java para concatenação de varios elementos, vira tudo uma string 
		
		sb.append("[");
		
		for (int i = 0; i < vetor.length; i++) {
			sb.append(vetor[i]);
			if(i < vetor.length-1) {
				
				sb.append(" , ");
			}
			
		}
		sb.append("]");
		return sb.toString();
	}
	
}
