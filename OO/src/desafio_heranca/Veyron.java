package desafio_heranca;

public class Veyron extends Carro{
	
	
	Veyron(){
		this(250);
	}
	Veyron(double velocidadeMax){
		super(velocidadeMax);
	}
	
	
	
	@Override
	 void acelerar() {
		velocidadeAtual+=15;
		super.acelerar();
	}
	@Override
	 void freiar() {		
		velocidadeAtual-=15;
		super.acelerar();
		}
	
}
