package heranca_Pessoas;

public class Gerente extends Funcionario {
	private String nomeSetor;

	Gerente(String nome,int idade,String setor,double salario){
		super(salario,nome,idade);
		nomeSetor = setor;
		
	}
	
	
	String getNomeSetor() {
		return nomeSetor;
	}

	
	
	

}
