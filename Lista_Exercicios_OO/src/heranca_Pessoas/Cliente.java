package heranca_Pessoas;

public class Cliente extends Pessoa{
	private double valorDivida;
	Cliente(String nome ,int idade,double valor){
		super(nome,idade);
		valorDivida = valor;
		
		
	}
	@Override
	public String toString() {
		return "Cliente [valorDivida=" + valorDivida + ", Nome=" + getNome() + ", Idade=" + getIdade() + "]";
	}
}
