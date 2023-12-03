package modelo;

public class Paciente {
	
	private String cpf;
	private String nome;
	private String Edereco;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEdereco() {
		return Edereco;
	}
	public void setEdereco(String edereco) {
		Edereco = edereco;
	}
	
	public String toString() {
		return cpf+ "#" +nome+ "#" +Edereco;
	}
	
	
	
	
	

}
