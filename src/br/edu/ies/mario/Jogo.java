package br.edu.ies.mario;

public class Jogo {

	private int pontuacao = 0;
	private Mario mario;
	
	public Jogo() {
		mario = new Mario(this);
	}
	
	public Mario getMario() {
		return mario;
	}
	
	public int getPontuacao() {
		return pontuacao;
	}
	
	void pontuar(int pontos) {
		pontuacao += pontos;
	}
	
}
