
import java.util.Scanner;
public class Calculadora {
	
	public static void main(String[] args) {
		
		
		Scanner read = new Scanner(System.in);
		System.out.print("Qual Operação deseja Fazer ?\n");
		System.out.print("1- Soma 2- Subtração 3-Multiplicação 4-Divisão\n");
		int operation = read.nextInt();
		System.out.print("Digite os dois numeros para fazer a operação \n");
		int numberOne = read.nextInt();
		int numberTwo = read.nextInt();
		
		
		switch (operation) {
		
		case 1:
			System.out.print(numberOne + numberTwo);
			break;
		case 2:
			System.out.print(numberOne - numberTwo);
			break;
		case 3:
			System.out.print(numberOne * numberTwo);
			break;
		case 4:
			System.out.print(numberOne / numberTwo);
			break;
			
		}
		
		}
		
	}


