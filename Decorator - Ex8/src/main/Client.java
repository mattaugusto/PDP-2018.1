package main;

import components.Numero;
import concrete_components.*;
import concrete_decorators.*;

public class Client {

	public static void main(String[] args) {
		
		Numero n1 = new NumeroUm();
		System.out.print("Número normal: ");
		n1.imprimir();
		System.out.println("");

		Numero n2 = new NumeroParenteses(n1);
		System.out.print("Número com parenteses: ");
		n2.imprimir();
		System.out.println("");
		
		Numero n3 = new NumeroColchetes(n1);
		System.out.print("Número com colchetes: ");
		n3.imprimir();
		System.out.println("");
		
		Numero n4 = new NumeroChaves(n1);
		System.out.print("Número com chaves: ");
		n4.imprimir();
		System.out.println("");
		
		Numero n5 = new NumeroParenteses(n4);
		System.out.print("Número com chaves e parenteses: ");
		n5.imprimir();
		System.out.println("");
		
		Numero n6 = new NumeroColchetes(n5);
		System.out.print("Número com chaves, parenteses e colchetes: ");
		n6.imprimir();
		System.out.println("");
		
	}
	
}
