package classes;

import java.util.ArrayList;

public class Cliente {
	private String nome;
	private ArrayList<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void adicionaAluguel(Aluguel aluguel) {
		fitasAlugadas.add(aluguel);
	}

	public String extrato() {
		double valorTotal = 0.0;
		int pontosDeAlugadorFrequente = 0;
		String resultado = "Registro de Alugueis de " + getNome() + "\n";
		for (Aluguel aluguel : this.fitasAlugadas) {
			double valorCorrente = aluguel.getPreco();

			pontosDeAlugadorFrequente += aluguel.calcularPontosDeAlugadorFrequente();

			resultado += "\t" + aluguel.getFita().getTítulo() + "\t" + valorCorrente + "\n";
			valorTotal += valorCorrente;
		}
		resultado += "Valor total devido: " + valorTotal + "\n";
		resultado += "Voce acumulou " + pontosDeAlugadorFrequente + " pontos de alugador frequente";
		return resultado;
	}

}
