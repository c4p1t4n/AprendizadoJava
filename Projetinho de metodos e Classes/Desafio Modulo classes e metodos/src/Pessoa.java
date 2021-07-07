
public class Pessoa {
	String nome;
	double peso;
	// Constructor
	Pessoa(String nome,double peso){
		this.nome = nome;
		this.peso = peso;			
	}
	
	
	// Metodo 
	 void Comer(Comida comida) {			
		System.out.println("Peso de "+ this.nome+ " antes da janta: "+ this.peso + "Kgs");
		double pesoComida =  comida.peso;
		this.peso += pesoComida;
		System.out.println("Peso de "+ this.nome+ " depois da janta: "+ this.peso +"Kgs");
		
	}
	
	
}
