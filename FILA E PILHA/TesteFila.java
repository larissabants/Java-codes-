package lg2_4b;

import java.util.Queue;
import java.util.LinkedList;

public class TesteFila {

	public static void main(String[] args) {
				
				Fila fila = new Fila();
				
				fila.adiciona("Maur�cio");
				fila.adiciona("Guilherme");
				
				System.out.println(fila);
				
				String x1 = fila.remove();
				
				System.out.println(x1);
				System.out.println(fila);
			
	            Queue<String> filaDoJava = new LinkedList<String>();
	            
	            filaDoJava.add("Maur�cio");
	            String x2 = filaDoJava.poll();
	           
	            System.out.println(x2);
	}

}