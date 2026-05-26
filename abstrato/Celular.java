package abstrato;

public class Celular extends Telefone {

	public Celular() {
		super("Telefone celular");
	}
	
	@Override
	public void toca(int codigoToque) {  
		switch(codigoToque) {
		case 1:
			System.out.println("Hello moto... Hello moto...");
			break;
		case 2:
			System.out.println("fiu fifififiu");
			break;
		default :
			System.out.println("Nanananan... Nanananana");
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\nO número: " + numero + " é um celular...");
	}
	
}
