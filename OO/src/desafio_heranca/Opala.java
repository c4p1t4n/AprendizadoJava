package desafio_heranca;

public class Opala extends Carro {
	
	Opala(){
		this(230);
	}
	Opala(double velocidadeMax){
		super(velocidadeMax);
	}
	
	 void acelerar() {
		velocidadeAtual+= 7;
		super.acelerar();
		
	}
	void freiar() {		
		super.freiar();
		
	}
}
