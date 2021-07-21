package grafos;

import java.util.*;

public class Grafos {
	int[][] matrix ;
	int numeroElementos ;
	Grafos(int numeroElementos){
		this.numeroElementos = numeroElementos;
		matrix= new int[numeroElementos][numeroElementos];
		for(int cont=0; cont<numeroElementos;cont++) {
			for(int cont2=0; cont2<numeroElementos;cont2++) {
				matrix[cont][cont2]=0;
			}
		}
	}
	
	void adicionarPonto(int a , int b) {
		if (a >= 0 && b >=0 ) {
			matrix[a-1][b-1]=1;
		}
		else {
			System.out.print("Valor Invalido");
		}
	}
	boolean verificarVertice(int primeiroVertice,int segundoVertice) {
		
		if (matrix[primeiroVertice-1][segundoVertice-1] == 1) {
			System.out.println("True");
			return true;
		}
		System.out.println("false");
			return false;
		
	}
	
	void listaDeVerticesVizinhos(int vertice ) {
		List <ArrayList>listaVertices = new LinkedList<>();
		
		for(int cont = 0; cont < numeroElementos;cont++) {
			 ArrayList<Integer> vertices = new ArrayList<Integer>();
			if (matrix[vertice-1][cont] == 1) {
				
				vertices.add(vertice);
				vertices.add(cont+1);
				listaVertices.add(vertices);
				
			}
			
		}
		System.out.print("Lista de vertices:");
		System.out.println(listaVertices);
	}
	
	
	void exibirMatriz() {
		System.out.println("Matriz:");
		for (int cont=0;cont< matrix.length;cont++) {
			for (int cont2=0;cont2< matrix.length;cont2++) {
				if ((cont2+1)%matrix.length == 0 && cont2 != 0) {
					System.out.println("|"+matrix[cont][cont2]+"|");
					
				}
				else {
					System.out.print("|"+matrix[cont][cont2]);
				}
				
			}
		}
	}
	
	

}
