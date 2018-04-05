package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import interfaces.AlgoritmoDasCartas;

public class AlgoritmoAleatorio implements AlgoritmoDasCartas{

	@Override
	public ArrayList<Carta> distribuiCartas(Baralho baralho) {
		ArrayList<Carta> cartas = baralho.getCartas();
		Random random = new Random();
		
		int numeroRandomico = random.nextInt(cartas.size());
		Carta primeiraCarta = cartas.get(numeroRandomico);
		baralho.removeCarta(primeiraCarta);
		
		numeroRandomico = random.nextInt(cartas.size());
		Carta segundaCarta = cartas.get(numeroRandomico);
		baralho.removeCarta(segundaCarta);
		
		ArrayList<Carta> cartasDaJogada = new ArrayList<Carta>(
				Arrays.asList(primeiraCarta, segundaCarta));
		return cartasDaJogada;
		
//		for(int i = 0; i < (this.cartas.size() - 1); i++)
//		{
//			int numeroRandomico = random.nextInt(this.cartas.size());
//			Carta tempCarta = this.cartas.get(i);
//			this.cartas.set(i, this.cartas.get(numeroRandomico));
//			this.cartas.set(numeroRandomico, tempCarta);
//		}
	}


}
