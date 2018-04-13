package main;

import classes.Aluguel;
import classes.Cliente;
import classes.Fita;
import enums.FitaTipo;

public class Locadora {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Juliana");
		c1.adicionaAluguel(new Aluguel(new Fita("O Exorcista                   ", FitaTipo.NORMAL), 3));
		c1.adicionaAluguel(new Aluguel(new Fita("Men in Black                  ", FitaTipo.NORMAL), 2));
		c1.adicionaAluguel(new Aluguel(new Fita("Jurassic Park III             ", FitaTipo.LANÇAMENTO), 3));
		c1.adicionaAluguel(new Aluguel(new Fita("Planeta dos Macacos           ", FitaTipo.LANÇAMENTO), 4));
		c1.adicionaAluguel(new Aluguel(new Fita("Pateta no Planeta dos Macacos ", FitaTipo.INFANTIL), 10));
		c1.adicionaAluguel(new Aluguel(new Fita("O Rei Leao                    ", FitaTipo.INFANTIL), 30));

		System.out.println(c1.extrato());
	}
}
