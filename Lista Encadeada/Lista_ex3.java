package lg2_4b;

import java.util.LinkedList;

public class Lista_ex3 {
	
		public static void main(String args[]) {

			LinkedList<Integer> numero = new LinkedList<Integer>();
			
			Integer soma = 0;

			numero.add(1);
			numero.add(2);
			numero.add(3);

			System.out.println("Imprimindo a Lista: " +numero);

			for (int cont = 0; cont < numero.size(); cont++) {
				soma = soma + numero.get(cont);
			}
			
			System.out.println("O resultado da soma dos números é: " +soma);
			
		}
		
}