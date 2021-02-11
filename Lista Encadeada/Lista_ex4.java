package lg2_4b;

import java.util.LinkedList;

public class Lista_ex4 {
	
public static void main(String[] args) {
		
		LinkedList<Integer> nodo = new LinkedList<Integer>();
		
		nodo.add(10);
		nodo.add(40);
		nodo.add(1);
		nodo.add(50);
				
		System.out.println("Imprimindo a Lista:" +nodo);
				
		Integer maior = 0;
		
		for (int cont = 0; cont < nodo.size(); cont++) 
		
		if( maior < nodo.get(cont)) 
			maior = nodo.get(cont);
			
			System.out.println("O maior nodo é: " +maior);
		}

}
