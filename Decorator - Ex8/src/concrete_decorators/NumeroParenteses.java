package concrete_decorators;

import components.Numero;
import decorators.NumeroDecorator;

public class NumeroParenteses extends NumeroDecorator {
	
	public NumeroParenteses(Numero numero) {
		super(numero);
	}
	
	@Override
	public void imprimir() {
		System.out.print("(");
		this.getNumero().imprimir();
		System.out.print(")");
	}
}
	