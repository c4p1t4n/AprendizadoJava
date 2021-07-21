package empregado;

public class Empregado {
	private String primeiroNome;
	private String sobrenome;
	private double salarioMensal;
	Empregado (String primeiroNome,String sobrenome,double salarioMensal){
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		
			if (salarioMensal >=0) {
				this.salarioMensal = salarioMensal;		
			}else {
				this.salarioMensal= 0;
			}
		}
	
	String getPrimeiroNome() {
		return primeiroNome;
	}
	void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	String getSobrenome() {
		return sobrenome;
	}
	void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	double getSalarioMensal() {
		return salarioMensal;
	}
	void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	String getNome() {
		return primeiroNome +" " +sobrenome;
	}
	double salarioAnual() {
		return this.salarioMensal * 12;
	}
	
	double aumentoSalarial(double porcentagem ) {
		porcentagem = porcentagem /100;
		salarioMensal += salarioMensal * porcentagem;
		return salarioMensal;
	}
	
	

	

}
