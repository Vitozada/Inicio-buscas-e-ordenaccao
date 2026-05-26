package abstrato2;

public interface Figuras {
	public String nomeInterface = "Figuras";
	
	abstract public String getNome();
	abstract public void setNome(String Nome);
	
	public double getArea();
	public double getDiagonal();
	double getPerimetro(); //ele sabe que public
}
