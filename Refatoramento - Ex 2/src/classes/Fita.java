package classes;

import enums.FitaTipo;

public class Fita {
	private String t�tulo;
	private FitaTipo c�digoDePre�o;

	public Fita(String t�tulo, FitaTipo c�digoDePre�o) {
		this.t�tulo = t�tulo;
		this.c�digoDePre�o = c�digoDePre�o;
	}

	public String getT�tulo() {
		return this.t�tulo;
	}

	public FitaTipo getC�digoDePre�o() {
		return this.c�digoDePre�o;
	}

	public void setC�digoDePre�o(FitaTipo c�digoDePre�o) {
		this.c�digoDePre�o = c�digoDePre�o;
	}

}
