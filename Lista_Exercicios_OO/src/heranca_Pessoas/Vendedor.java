package heranca_Pessoas;

public class Vendedor extends  Funcionario{
	
	
	
	Vendedor( String nome, int idade,double valorVendas,double salario) {
		super(salario + (0.05*valorVendas), nome, idade);
		this.valorVendas = valorVendas;
	}
	private double valorVendas;
	
	
	
	
	
	double getValorVendas() {
		return valorVendas;
	}
	void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
		super.setSalario(super.getSalario()+(0.05*valorVendas));
	}
	
	

}
