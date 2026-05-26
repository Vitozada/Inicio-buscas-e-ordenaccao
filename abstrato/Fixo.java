package abstrato;

public class Fixo extends Telefone{

	public Fixo() {
		super("Telefone fixo");
	}

	@Override
	public void disca(String numero) {
		
		System.out.println("Discando: " + numero);
	}

	@Override
	public void toca(int numToque) {
		
		for (int i = 0; i < numToque; i++) {
			System.out.println("\nTrimmmmm..... Trimmmmmmm......");
		}
	}
	
}
