package pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExemploPilha {
	public static void main(String[] args) {
		//criação de uma pilha usando o arrayDeque
		Deque<String> pilha = new ArrayDeque<String>();
		
		//variavel para identificar a posição do elemento na pilha
		int contador = 0;
		
		//adicionar elementos no topo da pilha
		pilha.push("prato verde");
		pilha.push("prato branco");
		pilha.push("prato preto");
		pilha.push("prato azul");
		pilha.push("prato rosa");
		
		//exibir os elementos da pilha do topo para a base
		
		System.out.println("\nElementos da pilha:(topo --> base):");
		contador = pilha.size();
		
		for (String prato : pilha) {
			System.out.printf("[%d] %s%n",contador, prato);
			contador --;
		}
		
		//remove o elemento do topo da pilha
		System.out.println("\nRetirar elemento: "+pilha.pop());
		
		// exibe elementos depois da remoção
		contador = pilha.size();
		System.out.println("\nElementos da pilha:(topo --> base):");
		for (String prato : pilha) {
			System.out.printf("[%d] %s%n",contador, prato);
			contador --;
		}
		
		//mostra o elemento atual no topo da pilha
		System.out.println("\nElemento do topo da pilha: " + pilha.peek());
		
		// verifica se a pilha contem um elemento em especifico
		System.out.println("\nO elemento prato verde existe na pilha? " + pilha.contains("prato verde"));
		
		// limpa todos os elementos da pilha 
		pilha.clear();
		
		//verifica se a pilha esta vazia
		System.out.println("\na pilha esta vazia? " + pilha.isEmpty());
	}
}
