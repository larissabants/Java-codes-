package lg2_4b;

import java.util.Stack;

public class TestePilha {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		pilha.push("Maur�cio");
		System.out.println(pilha);
		
		pilha.push("Guilherme");
		System.out.println(pilha);
		
		String r1 = pilha.pop();
		System.out.println(r1);
		
		String r2 = pilha.pop();
		System.out.println(r2);
		
		System.out.println(pilha.vazia()); 
		pilha.push("Marcelo");
		System.out.println(pilha.vazia()); 
		
		Stack <String> stack = new Stack<String>();
		
		stack.push("Maur�cio");
		stack.push("Guilherme");
		
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		String nome = stack.peek();
		System.out.println(nome);		
	}
}