package grafos;

public class TesteGrafos {

	public static void main(String[] args) {
		Grafos matriz = new Grafos(5);
		matriz.adicionarPonto(1, 2);
		matriz.adicionarPonto(1, 5);
		matriz.adicionarPonto(2, 1);
		matriz.adicionarPonto(2, 3);
		matriz.adicionarPonto(2, 4);
		matriz.adicionarPonto(2, 5);
		matriz.adicionarPonto(3, 2);
		matriz.adicionarPonto(3, 4);
		matriz.adicionarPonto(4, 2);
		matriz.adicionarPonto(4, 3);
		matriz.adicionarPonto(4, 5);
		matriz.adicionarPonto(5, 1);
		matriz.adicionarPonto(5, 2);
		matriz.adicionarPonto(5, 4);
		matriz.exibirMatriz();

		matriz.verificarVertice(2, 5);
		matriz.listaDeVerticesVizinhos(3);
		
		
		
	}

}
