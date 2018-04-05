package classes;

import java.util.ArrayList;
import java.util.Collections;

public class Baralho {
	
	public Baralho(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	
	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	
	public void embaralhar(){
		Collections.shuffle(this.cartas);
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	
	public void removeCarta(Carta carta){
		this.cartas.remove(carta);
	}

	@Override
	public String toString() {
		return "Baralho [cartas=" + cartas + "]";
	}
}
