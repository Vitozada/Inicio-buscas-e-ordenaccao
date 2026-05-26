package pilha;

public class GerenciadorHistorico implements pilhaTad {

	private String[] elementos;
	private int topo;

	// contrutor: inicializa a pilha com um tamanho definido

	public GerenciadorHistorico(int capacidade) {
		elementos = new String[capacidade];
		topo = -1; // pilha inicia vazia (indice -1)
	}

	// operação PUSH: insere uma nova pagina no topo
	@Override
	public void push(String url) {
		if (topo < elementos.length - 1) {
			topo++; // sobe a posicao do topo
			elementos[topo] = url; // guarda a url na nova posição
			System.out.println("\nVisitando:" + url);
		}else {
			System.out.println("\nErro: Historico cheio!!!");
		}
	}
	
	//Operação POP: remove a pagina do topo
	@Override
	public String pop() {
		if(estaVazia()) {
			return "Historico vazio";
		}
		
		String itemRemovido = elementos[topo]; //guarda o item para retornar
		elementos[topo] = null; //limpa a posicao
		topo--; //desce o indice do topo
		return itemRemovido;
	}
	
	//operação PEEK: apenas mostra qual é a pagina atual
	@Override
	public String peek() {
		if (estaVazia()) {
			return "nenhuma pagina aberta";
		}
		return elementos[topo];
	}
	
	@Override
	public boolean estaVazia() {
		return (topo == -1);
	}
	
	@Override
	public int tamanho() {
		return topo +1;
	}
	
	public static void main(String[] args) {
		//criamos um hitorico com capacidade 5
		GerenciadorHistorico historico = new GerenciadorHistorico(5);

		
		//simulando navegação (push)
		historico.push("google.com");
		historico.push("gitHub.com/jo-soares");
		historico.push("youtube.com");
		
		System.out.println("\n---- STATUS ATUAL ----");
		System.out.println("\nPagina aberta:" + historico.peek());
		System.out.println("\nTotal historico:" + historico.tamanho());
		
		//simulando o botao voltar
		
		System.out.println("\n ---- CLICANDO EM VOLTAR ----");
		String voltouDe = historico.pop();
		System.out.println("\nSaimos de:" + voltouDe);
		System.out.println("\nAgora voce esta em: " + historico.peek() );
		
		// verificação final 
		
		if (!historico.estaVazia()) {
			System.out.println("\nAinda restam " + historico.tamanho() + " Paginas no historico...");
		}
		
	}
	
	
}
