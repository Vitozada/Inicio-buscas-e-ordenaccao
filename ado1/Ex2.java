package ado1;

public class Ex2 {
	public static void main(String[] args) {
	
		String[] nomes = {"Carlos silva", "Maria Oliveira", "João Santos", "Ana Pereira", "Pedro Costa", "Lucia Mendes" , "Roberto Lima"} ;
		int [] idades = {45,72,28,65,34,58,81};
		int [] gravidade = {3,2,5,2,1,4,3};
		
		insertionSort(gravidade, idades, nomes);
		
		for (int i = 0; i < gravidade.length; i++) {
			String mensagem = " ";
			
			if (gravidade[i] == 1) {
				mensagem = "IMEDIATO";
			}else if (gravidade[i] == 1 || gravidade[i] == 2 && idades[i] > 60) {
				mensagem = "PRIORITÁRIO";
			}else {
				mensagem = "ESPERA";
			}
			
			int tempo = 0;
			
		tempo = (i) * 20;
		System.out.printf("%d°: %s (Grav:%d - %da) -> %s -- Tempo: %d min %n", i + 1, nomes[i], gravidade[i], idades[i], mensagem, tempo);
		
	}
	}
	
	
	public static void insertionSort(int [] gravidade, int [] idades, String [] nomes) {
		int n = gravidade.length;
		
		for(int i = 1; i < n; i++) { 
			
			int chave = gravidade[i];
			String chaveNome = nomes[i];
			int chaveIdade = idades[i];
			int antecessorAChave = i-1;
			
			
			while(antecessorAChave >= 0 && gravidade[antecessorAChave] > chave ) {
				
				gravidade[antecessorAChave + 1] = gravidade[antecessorAChave];
				nomes[antecessorAChave + 1] = nomes[antecessorAChave];
				idades[antecessorAChave + 1] = idades[antecessorAChave];
				
				antecessorAChave--;
			}
			
			gravidade[antecessorAChave+1] = chave;
			nomes[antecessorAChave+1] = chaveNome;
			idades[antecessorAChave+1] = chaveIdade;
			
		}
		
	}	
}
	
	
	

