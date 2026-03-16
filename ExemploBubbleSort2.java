package listasBubble;

public class ExemploBubbleSort2 {

	public static void bubbleSortOtimizado(int[] vetor) {

		int n = vetor.length;
		boolean trocou;

		for (int i = 0; i < n - 1; i++) {
			trocou = false;
			for (int j = 0; j < n - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					
					int temporario = vetor[j];
					
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temporario;
					
					trocou = true;
					
				}
			}
			if (!trocou) {
				break; 
			}
		}

	}

	public static void main(String[] args) {

		int[] numeros = { 64, 34, 25, 12, 22, 11, 90 };

		System.out.println("\n Array original:");
		imprimirArray(numeros);

		bubbleSortOtimizado(numeros);

		System.out.println("\n Array ordenado:");
		imprimirArray(numeros);
	}

	public static void imprimirArray(int[] vetor) {
		System.out.print("[ ");

		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);

			if (i < vetor.length - 1) {
				System.out.print(" , "); // imprimir virgula entre os elementos do Array
			}

		}

		System.out.println(" ]");

	}

}
