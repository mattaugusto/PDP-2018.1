package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import classes.*;
import interfaces.*;

public class Partida {
	
	// INSTACIANDO OBJETOS PARA PODER INICIAR O JOGO
	
	private static Scanner algoritmo;

	public static ArrayList<Jogador> criarJogadores()
	{
		Jogador petronio = new Jogador("Petrônio");
		Jogador nadja = new Jogador("Nadja");
		
		ArrayList<Jogador> jogadores = new ArrayList<Jogador>(
				Arrays.asList(petronio, nadja));
		return jogadores;
	}
	
	public static ArrayList<String> criarNaipes(){
		ArrayList<String> naipes = new ArrayList<String>(
				Arrays.asList("paus", "ouros", "copas", "espadas"));
		return naipes;
	}
	
	public static ArrayList<String> criarNumeros(){
		ArrayList<String> numeros = new ArrayList<String>(
				Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "valete", "dama", "rei"));
		return numeros;
	}
	
	public static ArrayList<Carta> criarCartas(ArrayList<String> naipes, ArrayList<String> numeros)
	{
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		
		for(String naipe: naipes)
			for(String numero: numeros)
				cartas.add(new Carta(naipe, numero));
		
		return cartas;
	}
	
	// MÉTODOS DE FUNCIONAMENTO DO JOGO
	
	public static ArrayList<Carta> realizarJogada(Baralho baralho, AlgoritmoDasCartas algoritmoDeJogo)
	{
		ArrayList<Carta> cartasDaJogada = algoritmoDeJogo.distribuiCartas(baralho);
		return cartasDaJogada;
	}
	
	public static void removerCartas(Baralho baralho, ArrayList<Carta> cartasDaJogada)
	{
		for(Carta carta: cartasDaJogada)
			baralho.removeCarta(carta);
	}
	
	public static String calcularResultadoJogada(ArrayList<Carta> cartasPadrao, ArrayList<Carta> cartasDaJogada, ArrayList<Jogador> jogadores)
	{
		Carta primeiraCarta = cartasDaJogada.get(0);
		Carta segundaCarta = cartasDaJogada.get(1);
		Jogador primeiroJogador = jogadores.get(0);
		Jogador segundoJogador = jogadores.get(1);
		
		String result = primeiroJogador + " recebeu: " + primeiraCarta + "\n" 
				+ segundoJogador + " recebeu: " + segundaCarta + "\n";
		
		if(cartasPadrao.indexOf(primeiraCarta) > cartasPadrao.indexOf(segundaCarta))
		{
			primeiroJogador.addPontos();
			result += primeiroJogador + " venceu está jogada! ";
		}	
		else
		{			
			segundoJogador.addPontos();
			result += segundoJogador + " venceu está jogada! ";
		}
			
		return result;
	}
	
	public static void jogar(int numJogadas, Baralho baralho, ArrayList<Jogador> jogadores, ArrayList<Carta> cartasPadrao)
	{
		ArrayList<Carta> cartasDaJogada = new ArrayList<Carta>();
		for(int i = 0; i < numJogadas; i++){
			System.out.println("Informe a algoritmo de sorteio a ser utilizado: 1 - Cima, 2 - Cima/Baixo, 3 - Aleatório");
			algoritmo = new Scanner(System.in);
			switch(algoritmo.nextInt())
			{
				case 1:	cartasDaJogada = realizarJogada(baralho, new AlgoritmoCima());
					break;
				case 2: cartasDaJogada = realizarJogada(baralho, new AlgoritmoCimaBaixo());
					break;
				case 3: cartasDaJogada = realizarJogada(baralho, new AlgoritmoAleatorio());
			
			}
			removerCartas(baralho, cartasDaJogada);
			System.out.println(calcularResultadoJogada(cartasPadrao, cartasDaJogada, jogadores) + "\n");
		}
	}
	
	public static ArrayList<Jogador> calcularVencedor(ArrayList<Jogador> jogadores)
	{
		ArrayList<Jogador> vencedores = new ArrayList<Jogador>();
		Jogador primeiroJogador = jogadores.get(0);
		Jogador segundoJogador = jogadores.get(1);
		
		if(primeiroJogador.getPontos() > segundoJogador.getPontos())
			vencedores.add(primeiroJogador);
		else if(primeiroJogador.getPontos() < segundoJogador.getPontos())
			vencedores.add(segundoJogador);
		else
		{
			vencedores.add(primeiroJogador);
			vencedores.add(segundoJogador);
		}
		
		return vencedores;		
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		
		ArrayList<Jogador> jogadores = criarJogadores();
		ArrayList<String> naipes = criarNaipes();
		ArrayList<String> numeros = criarNumeros();
		ArrayList<Carta> cartas = criarCartas(naipes, numeros);
		Baralho baralho = new Baralho(cartas);
		ArrayList<Carta> cartasPadrao = (ArrayList<Carta>) baralho.getCartas().clone();
	
		baralho.embaralhar();
		
		jogar(10, baralho, jogadores, cartasPadrao);
		
		ArrayList<Jogador> vencedores = calcularVencedor(jogadores);
		
		if(vencedores.size() > 1)
		{
			System.out.println(vencedores.get(0) + " e " + vencedores.get(1) + " empataram!\nRodada de desempate:");
			jogar(1, baralho, vencedores, cartasPadrao);
		}
		System.out.println(vencedores.get(0) + " venceu o jogo!");
	}
}
	