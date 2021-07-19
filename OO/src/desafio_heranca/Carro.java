package desafio_heranca;

public class Carro {
	double velocidadeMaxima ;
	protected double velocidadeAtual = 0.0;
	protected double delta = 5;
	protected Carro(double velocidadeMaxima){
		this.velocidadeMaxima=velocidadeMaxima;
				}
	protected void acelerar(){ 	
		if (velocidadeAtual+5 > velocidadeMaxima) {
			velocidadeAtual=velocidadeMaxima;
		}else {
		velocidadeAtual+= 5;
		}
		System.out.println("A Velocidade atual é: " +velocidadeAtual +"Km/H");
		
	}
	protected void freiar() {
		
		if(velocidadeAtual >= delta) {
		velocidadeAtual-= delta ;
		
		}else {
			velocidadeAtual =0;
		}
		
	
	}
}	


