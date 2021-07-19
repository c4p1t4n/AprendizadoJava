package desafio_heranca;

public class Veyron extends Carro{
	
	
	public Veyron(){
		this(250);
	}
	public Veyron(double velocidadeMax){
		super(velocidadeMax);
	}
	
	
	
	@Override
	public
	 void acelerar() {
		velocidadeAtual+=15;
		super.acelerar();
	}
	@Override
	public
	 void freiar() {		
		velocidadeAtual-=15;
		super.acelerar();
		}
	
}
