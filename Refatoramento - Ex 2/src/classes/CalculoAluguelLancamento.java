package classes;

import interfaces.CalculoDeAluguel;

public class CalculoAluguelLancamento implements CalculoDeAluguel {

	@Override
	public double calcular(int diasAlugada) {
		return diasAlugada * 3;
	}

}
