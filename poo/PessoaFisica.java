package poo;

public class PessoaFisica extends Cliente { //herança
	
	private String cpf, rg;

	public PessoaFisica(String nome, int idade, String profissao, float renda, String email, String cpf, String rg) {
		super(nome, idade, profissao, renda, email);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void visualizar() { // chamando o metodo visualizar e colocando os atributos proprios da pessoa fisica
		super.visualizar(); 
		
		System.out.println("CPF: " + this.cpf);
		System.out.println("RG: " + this.rg);
	}
	
}
