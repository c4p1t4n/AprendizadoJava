package desafio_heranca;

public class Opala extends Carro {
	
	public Opala(){
		this(230);
	}
	public Opala(double velocidadeMax){
		super(velocidadeMax);
	}
	
	public void acelerar() {
		velocidadeAtual+= 7;
		super.acelerar();
		
	}
	public void freiar() {		
		super.freiar();
		
	}
}
