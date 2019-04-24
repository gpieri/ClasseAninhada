package br.edu.ies;

import br.edu.ies.mario.Jogo;
import br.edu.ies.mario.Mario;

public class JogoMarioMain {

	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		Mario mario = jogo.getMario();
		mario.pegarCogumelo();
		mario.pegarPena();
		mario.levarDano();
		mario.pegarFlor();
		mario.pegarFlor();
		mario.levarDano();
		mario.levarDano();
		mario.pegarPena();
		mario.levarDano();
		mario.levarDano();
		mario.levarDano();

		System.out.println(jogo.getPontuacao());
	}
	
}
