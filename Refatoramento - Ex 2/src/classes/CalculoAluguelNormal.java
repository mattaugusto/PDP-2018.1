package classes;

import interfaces.CalculoDeAluguel;

public class CalculoAluguelNormal implements CalculoDeAluguel{
	
	@Override
	public double calcular(int diasAlugada){
		double valor = 2;
		if (diasAlugada > 2) {
			valor += (diasAlugada - 2) * 1.5;
		}
		return valor;
	}
}
