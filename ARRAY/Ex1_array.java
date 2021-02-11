package lg2_4b;

public class Ex1_array {
	
		public static void main(String[] args) {
		
			Integer array[] = new Integer [9];
		
		        System.out.println("Lista de array:");
		        
				for(int cont = 0; cont < array.length; cont++){
					array[cont] = cont;
					System.out.println(array[cont]);
				}
				
				System.out.println("\nLista multiplicada por 3:");
				
				for(int cont = 0; cont < array.length; cont++){
					array[cont] = array[cont] * 3;
					
					System.out.println(array[cont]);
				}
				
		}

}
