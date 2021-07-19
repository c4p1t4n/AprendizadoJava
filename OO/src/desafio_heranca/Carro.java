package desafio_heranca;

public class Carro {
	double velocidadeMaxima ;
	double velocidadeAtual = 0.0;
	double delta = 5;
	Carro(double velocidadeMaxima){
		this.velocidadeMaxima=velocidadeMaxima;
				}
	void acelerar(){ 	
		if (velocidadeAtual+5 > velocidadeMaxima) {
			velocidadeAtual=velocidadeMaxima;
		}else {
		velocidadeAtual+= 5;
		}
		System.out.println("A Velocidade atual é: " +velocidadeAtual +"Km/H");
		
	}
	void freiar() {
		
		if(velocidadeAtual >= delta) {
		velocidadeAtual-= delta ;
		
		}else {
			velocidadeAtual =0;
		}
		
	
	}
}	


