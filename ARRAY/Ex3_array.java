package lg2_4b;

public class Ex3_array {
	
	public static void main(String[] args) {
		
		Integer array3[][] = new Integer [100][100];
		
		for(int cont = 0; cont < array3.length; cont++)
			for(int cont2 = 0; cont2 < array3.length; cont2++) {
			array3[cont][cont2] = cont - cont2;
			System.out.println(array3[cont][cont2]);
		}
		
		System.out.println("\n Array multiplicado por 7:");
		
		for(int cont = 0; cont < array3.length; cont++)
			for(int cont2 = 0; cont2 < array3.length; cont2++) {
			array3[cont][cont2] = array3[cont][cont2] * 7;
			
			System.out.println(array3[cont][cont2]);
		}

	}

}
