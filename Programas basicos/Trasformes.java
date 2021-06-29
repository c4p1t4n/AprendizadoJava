import java.util.Scanner;
public class Trasformes {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		
		 int transformation = 0;
		 
		 System.out.println("Deseja transformar qual escala de temperatura 1-Fahrenheit 2-Celsius"); 
		 transformation = read.nextInt();
		 switch(transformation) {
		 	case 1:
		 		 System.out.println("Insira o valor em Fahrenheit ");
		 		 double valueFahrenheit = read.nextDouble();
		 		 double convert = ((valueFahrenheit-32) * 5) /9 ;
		 		System.out.printf("O valor de graus %.2f em Fahrenheit é igual a %.2f Celsius",valueFahrenheit,convert );
		 		
		 		 break;
		 	case 2:
		 		System.out.println("Insira o valor em Celsius ");
		 		 double valueCelsius = read.nextDouble();
		 		 convert = (1.8 *valueCelsius)+32;
		 		 System.out.printf("O valor de  %.2f Celsius é igual a %.2f Fahrenheit",valueCelsius,convert);
		 		 break;


		 }

	}
}
