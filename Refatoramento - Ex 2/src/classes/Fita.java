package classes;

import enums.FitaTipo;

public class Fita {
	private String título;
	private FitaTipo códigoDePreço;

	public Fita(String título, FitaTipo códigoDePreço) {
		this.título = título;
		this.códigoDePreço = códigoDePreço;
	}

	public String getTítulo() {
		return this.título;
	}

	public FitaTipo getCódigoDePreço() {
		return this.códigoDePreço;
	}

	public void setCódigoDePreço(FitaTipo códigoDePreço) {
		this.códigoDePreço = códigoDePreço;
	}

}
