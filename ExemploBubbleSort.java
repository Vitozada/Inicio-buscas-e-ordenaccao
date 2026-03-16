package listasBubble;

public class ExemploBubbleSort {

	public static void bubbleSort(int[] vetor) {
		int n = vetor.length;

		for (int i = 0; i < n - 1 ; i++) {

			for (int j = 0; j < n - 1 ; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int guardarValor = vetor[j]; // para nao perder o valor durante a troca de posição
					vetor[j] = vetor[j + 1]; // a troca em sí
					vetor[j + 1] = guardarValor; // guarda o valor que perdemos na proxima posição

				}
			}

		}

	}

	public static void main(String[] args) {

		int[] numeros = { 64, 34, 25, 12, 22, 11, 90 };

		System.out.println("\n Array original:");
		imprimirArray(numeros);

		bubbleSort(numeros);

		System.out.println("\n Array ordenado:");
		imprimirArray(numeros);
	}

	public static void imprimirArray(int[] vetor) {
		System.out.print("[ ");

		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);

			if (i < vetor.length - 1) {
				System.out.print(" , ");  // imprimir virgula entre os elementos do Array
			}

		}

		System.out.println(" ]");

	}

}
