
public class CalcMeanYear {
	
	public static int yearMean(int[] arrayInt ) {
		int sumValues = 0;
		for( int x: arrayInt) {
			sumValues = x + sumValues;
		};
		
		return (sumValues/arrayInt.length);
		
	}
	
	public static int outlierYear(int[] listAlumnus, double mean ) {
		int cont=0;
		for( int x :listAlumnus) {
			if (x > mean) {
				cont++;
			}
		}
		
		return cont;
	}
	
	public static void main(String[] args) {
			int[] YearAlumnus = {15,27,27,18,18,40};
			
			System.out.println( outlierYear(YearAlumnus,yearMean(YearAlumnus)));
				
		    }
	
		
	
		
		
	
	}


