import java.util.Scanner;
public class Bhaskara {
	

	

		public static void main(String[] args) {

			Scanner read = new Scanner(System.in);
			
			System.out.println("Equação: ax² + bx + c = 0");
			
			System.out.println("\nDigite o valor de A: ");
			int a = read.nextInt();

			System.out.println("\nDigite o valor de B: ");
			int b = read.nextInt();

			System.out.println("\nDigite o valor de C: ");
			int c = read.nextInt();

			double delta = (b * b) - (4 * a * c);
			
			System.out.printf("delta = %.2f ",delta );

			double x1 = (-b + Math.sqrt(delta)) / (2 * a);

			System.out.printf("\n  x1 = %.2f", x1);

			double x2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.printf("\n x2 = %.2f" ,x2);
			
			read.close();
		}

	}


