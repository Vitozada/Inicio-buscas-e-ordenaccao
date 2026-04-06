package mergeSort;

public class ExemploMergeSort {
	public static void main(String[] args) {
		
		//Criando o array de teste com numeros desordenados
		int [] array = {38,43,3,9,82,10};
		
		System.out.println("\nVetor antes da ordenação");
		imprimir(array);
			
		//chamada inicial: passamos o vetor, o indice inicial(0) e o final (length - 1)
		executarMergeSort(array, 0 , array.length-1);
		
		System.out.println("\nVetor depois da ordenação por Merge sort");
		imprimir(array);
		
	}
	
	//metodo principal do algoritmo(Divisao)
	public static void executarMergeSort(int array[], int inicio, int fim) {
		 
		//se o inicio for menor que o fim, o vetor ainda pode ser dividido
		
		if (inicio < fim ) {
			//encontra o meio do vetor para a partição
			int meio = (inicio + fim) / 2;
			
			//divide a metade esquerda(recursiva)
			executarMergeSort(array, inicio, meio);
			
			//divide a metade da direita(recursiva)
			executarMergeSort(array, meio + 1, fim);
			
			// apos as divisões, faz a intercalação (conquista)
			intercalar(array,inicio,meio,fim);
			
		}
		
	}
	
	// metodo que une as duas metades ordenando os elementos(conquista)
	
	public static void intercalar(int[] array, int inicio, int meio, int fim) {
		// define o tamanho dos subvetores
		int tamanhoEsquerda = meio - inicio + 1;
		int tamanhoDireita = fim - meio;
		
		// cria os array auxiliares na memoria
		int [] arrayEsquerda = new int[tamanhoEsquerda];
		int [] arrayDireita = new int[tamanhoDireita];
		
		// copia os dados da metade da esquerda, do ORIGINAL para o AUXILIAR
		
		for (int i = 0; i < tamanhoEsquerda; i++) {
			arrayEsquerda[i] = array[inicio + i];
		}
		
		for (int j = 0; j < tamanhoDireita; j++) {
			arrayDireita[j] = array[meio+ 1 + j];
		}
		
		//indices de controle: i = esquerda, j = direita, k = original
		
		int i=0, j=0;
		int k = inicio;
		
		//enquanto houver elementos em ambos os subvetores para comparar
		
		while (i < tamanhoEsquerda && j < tamanhoDireita) {
			// se o elemento da esquerda for menor, ele volta primeiro para o original
			
			if (arrayEsquerda[i] <= arrayDireita[j]) {
				array[k] = arrayEsquerda[i];
				i++; // move o ponteiro do subvetor esquerdo 
			}else {
				// caso contrario, o elemento da direita é menor
				array[k] = arrayDireita[j];
				j++; // move o pónteiro do subvetor direito
			}
			k++; // avança a posição do array original
		}
		
		// caso ainda restem elementos no subvetor ESQUERDO (limpeza)
		while (i < tamanhoEsquerda) {
			array[k] = arrayEsquerda[i];
			i++;
			k++;
		}
		
		// caso ainda restem elementos no subvetor DIREITA (limpeza)
				while (j < tamanhoDireita) {
					array[k] = arrayDireita[j];
					j++;
					k++;
				}
		
	}
	// metodos simples para percorrer e exibir o array no console
	public static void imprimir(int [] array) {
		for (int i : array) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}
	
}
