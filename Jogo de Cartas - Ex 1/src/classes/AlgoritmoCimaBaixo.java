package classes;

import java.util.ArrayList;
import java.util.Arrays;

import interfaces.AlgoritmoDasCartas;

public class AlgoritmoCimaBaixo implements AlgoritmoDasCartas {

	@Override
	public ArrayList<Carta> distribuiCartas(Baralho baralho) {
		ArrayList<Carta> cartas = baralho.getCartas();
		Carta primeiraCarta = cartas.get(0);
		Carta segundaCarta = cartas.get(cartas.size() - 1);
		ArrayList<Carta> cartasDaJogada = new ArrayList<Carta>(
				Arrays.asList(primeiraCarta, segundaCarta));
		return cartasDaJogada;
	}


}
