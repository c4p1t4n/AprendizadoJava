
public class Jantar {

	public static void main(String[] args) {
		Comida arroz = new Comida("Arroz",0.2);
		Comida feijao = new Comida("Feijão",0.5);
		Pessoa joao = new Pessoa("Joao",89.0);
		Pessoa maria = new Pessoa("Maria",52.3);
		joao.Comer(arroz);
		maria.Comer(feijao);
		
		
	}

}
