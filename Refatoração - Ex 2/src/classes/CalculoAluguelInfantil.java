package classes;

import interfaces.CalculoDeAluguel;

public class CalculoAluguelInfantil implements CalculoDeAluguel {

	@Override
	public double calcular(int diasAlugada) {
		double valor = 1.5;
		if (diasAlugada > 3) {
			valor += (diasAlugada - 3) * 1.5;
		}
		return valor;
	}

}
