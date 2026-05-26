package abstrato2;

public class Quadrado extends BaseFigura implements Figuras {
		
	Quadrado(double lado, String nome){
		super(lado,lado,nome);
		nomeClasse = "quadrado"; // esta la no pacote base figura, tipo protected
	}
	
	@Override
	public double getDiagonal() {
		return Math.sqrt(2) * lado1;
	}

}
