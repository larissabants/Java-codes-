package lg2_4b;

public class Ex2_array {
	
		public static void main(String[] args) {
		
			Integer array2[] = new Integer [10];
		
			System.out.println("Ordem inversa do array:");
		
			for(int cont = array2.length-1; cont >= 0; cont--){
			array2[cont] = cont;
			System.out.println(array2[cont]);
	
			}
			
		}
		
}
