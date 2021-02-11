package lg2_4b;

public class Ex4_array {
	
		public static void main(String[] args) {
		
			Integer array4[][] = new Integer [50][100];
		
				for(int cont2 = array4.length-1; cont2 >= 0; cont2--)
				for(int cont = 0; cont < array4.length; cont++)  {
			    array4[cont][cont2] = cont + cont2;
			    
			    
			    System.out.println(array4[cont][cont2]);   
				}	
		}
		
}
