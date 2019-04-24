package br.edu.ies.mario;

// Classe que representa o Mario 
public class Mario {
	// qual estado o Mario está? Pequeno, grande, fogo, etc..
	private MarioState estado = new MarioPequeno();
	// referencia para o jogo ao qual o mario pertence, para fins de pontuação 
	private Jogo jogo;

//	Pegar Cogumelo:
//	Se Mario pequeno -> Mario grande
//	Se Mario grande -> 1000 pontos
//	Se Mario fogo -> 1000 pontos
//	Se Mario capa -> 1000 pontos
//
//	Pegar Flor de fogo:
//	Se Mario pequeno -> Mario grande e Mario fogo
//	Se Mario grande -> Mario fogo
//	Se Mario fogo -> 1000 pontos
//	Se Mario capa -> Mario fogo
//
//	Pegar Pena:
//	Se Mario pequeno -> Mario grande e Mario capa
//	Se Mario grande -> Mario capa
//	Se Mario fogo -> Mario fogo
//	Se Mario capa -> 1000 pontos
//
//	Levar Dano:
//	Se Mario pequeno -> Mario morto
//	Se Mario grande -> Mario pequeno
//	Se Mario fogo -> Mario grande
//	Se Mario capa -> Mario grande
//
//  Após morrer, Mario responderá todas as operações lançando exceção IllegalStateException
	
	public Mario(Jogo jogo) {
		this.jogo = jogo;
	}
	
	public void pegarCogumelo() {
		estado = estado.pegarCogumelo();
	}
	public void pegarFlor() {
		estado = estado.pegarFlor();
	}
	public void pegarPena() {
		estado = estado.pegarPena();
	}
	public void levarDano() {
		estado = estado.levarDano();
	}
	
	// interface representando o estado do mario. 
	// Cada estado deve ter uma classe que implementa.
	// Cada operação de MarioState retorna o próximo estado para o qual
	// o Mario transita.
	private interface MarioState {
		// Mario pegou um cogumelo! 
		public abstract MarioState pegarCogumelo();
		// Mario pegou uma flor de fogo
		public abstract MarioState pegarFlor();
		// Mario pegou uma pena
		public abstract MarioState pegarPena();
		// Mario levou um dano
		public abstract MarioState levarDano();
	}
	
	// implementação do que acontece quando o Mario está pequeno
	public class MarioPequeno implements MarioState {
		 
	    @Override
	    public MarioState pegarCogumelo() {
	        System.out.println("Mario grande");
	        return new MarioGrande();
	    }
	 
	    @Override
	    public MarioState pegarFlor() {
	        System.out.println("Mario grande com fogo");
	        return new MarioFogo();
	    }
	 
	    @Override
	    public MarioState pegarPena() {
	        System.out.println("Mario grande com capa");
	        return new MarioCapa();
	    }
	 
	    @Override
	    public MarioState levarDano() {
	        System.out.println("Mario morto");
	        return new MarioMorto();
	    }
	 
	}
	
}
