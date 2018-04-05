package classes;

public class Carta {
	
	public Carta(String naipe, String numero) {
		this.naipe = naipe;
		this.numero = numero;
	}

	private String naipe;
	private String numero;
	
	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Carta [naipe=" + naipe + ", numero=" + numero + "]";
	}
	
}
