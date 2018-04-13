package classes;

import enums.FitaTipo;
import interfaces.CalculoDeAluguel;

public class Aluguel {
	private Fita fita;
	private int diasAlugada;

	public Aluguel(Fita fita, int diasAlugada) {
		this.fita = fita;
		this.diasAlugada = diasAlugada;
	}

	public Fita getFita() {
		return this.fita;
	}

	public int getDiasAlugada() {
		return this.diasAlugada;
	}

	public double getPreco() {
		switch (this.fita.getC�digoDePre�o()) {
		case NORMAL:
			return calcularPreco(this.diasAlugada, new CalculoAluguelNormal());
		case LAN�AMENTO:
			return calcularPreco(this.diasAlugada, new CalculoAluguelLancamento());
		case INFANTIL:
			return calcularPreco(this.diasAlugada, new CalculoAluguelInfantil());
		default:
			return 0;
		}
	}
	
	public double calcularPreco(int diasAlugada, CalculoDeAluguel calculo){
		return calculo.calcular(diasAlugada);	
	}
	
	public int calcularPontosDeAlugadorFrequente(){
		if (this.fita.getC�digoDePre�o() == FitaTipo.LAN�AMENTO && diasAlugada > 1) 
			return 2;
		return 1;
	}
}
