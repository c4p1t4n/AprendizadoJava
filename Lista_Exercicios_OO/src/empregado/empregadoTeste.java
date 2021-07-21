package empregado;

public class empregadoTeste {

	public static void main(String[] args) {
		Empregado joao = new Empregado("Joao","Nunes",1000);		
		System.out.println(joao.getNome());
		System.out.println(joao.salarioAnual());
		 joao.aumentoSalarial(10);
		 System.out.println(joao.salarioAnual());
	
	}

}
