import java.util.Scanner;
public class Arrays {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas");
		int numeroNotas = read.nextInt();
		double[] array = new double[numeroNotas];
		
		for (int cont=0;cont < array.length;cont++) {
			
			
			System.out.printf("Digite a "+ (cont + 1) +" nota: ");
			
			array[cont]= read.nextDouble();
			
			
		}
		double sum=0;
		for(double notas:array) {
			sum += notas;
		}
		System.out.printf("a media do aluno é %.2f", sum/array.length);
		
	}
	}


