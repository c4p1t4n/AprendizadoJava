package heranca_Pessoas;

public class TestePessoa {

	public static void main(String[] args) {
	Gerente joao = new Gerente("João",35,"Vendas",4500);
	System.out.println(joao.toString());
	Vendedor diego = new Vendedor("Diego",24,2000,1600);
	System.out.println(diego.getSalario());
	Pessoa luiza = new Cliente("Luiza",23,3500);
	System.out.println(luiza.toString());
	
	}

}
