package heranca_Pessoas;

public class Funcionario extends Pessoa{
	private double salario;

	
	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + ", Nome()=" + getNome() + ", Idade()=" + getIdade() + "]";
	}








	Funcionario(double salario,String nome,int idade ){
		super(nome,idade);
		this.salario = salario;
		
	}
	 
	
	 
	
	
	 
	 
	 
	double getSalario() {
		return salario;
	}
	 void setSalario(double salario) {
		this.salario = salario;
	}








	








	
	
	 
	
	
}
