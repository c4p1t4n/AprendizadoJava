package heranca_Pessoas;

public class Pessoa {
	private String nome;
	private int idade;
	
	Pessoa(String nome,int idade){
		this.nome=nome;
		this.idade=idade;
	}
	
	String getNome() {
		return nome;
	}
	 protected void setNome(String nome) {
		this.nome = nome;
	}
	int getIdade() {
		return idade;
	}
	protected void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
}
