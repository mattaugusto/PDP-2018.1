package classes;

public class Jogador {

	public Jogador(String nome){ 
		this.nome = nome;
	}
	
	private String nome;
	private int pontos = 0;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	public void addPontos(){
		this.pontos++;
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", pontos=" + pontos + "]";
	}
	
}
