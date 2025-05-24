package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Embeddable //encapsulando dois atributos em uma classe só para compor um campo no BDrelacional
public class BelongingPK { //classe auxilixar para representar uma PK composta
	
	
	//configurando o relacionamento entre game e gameList
	@ManyToOne //muitos para um (cardinalidade entre o relacionamento do jogo e a lista de jogos
	@JoinColumn(name = "game_id") //une as duas colunas com PK de jogo e a PK de lista de jogos
	private Game game;              //de Lista de Jogos, que compoem a PK composta da relação de pertencimento do jogo a lista de jogos
	
	@ManyToOne 
	@JoinColumn(name = "list_id") 
	private GameList list;
	
	
	public BelongingPK() {}


	public BelongingPK(Game game, GameList list) {
		this.game = game;
		this.list = list;
	}


	public Game getGame() {
		return game;
	}


	public void setGame(Game game) {
		this.game = game;
	}


	public GameList getList() {
		return list;
	}


	public void setList(GameList list) {
		this.list = list;
	}


	@Override
	public int hashCode() {
		return Objects.hash(game, list);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null) // não pode ter PK com valores iguais, então faz a verificação para evitar redundancias no BD
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(game, other.game) && Objects.equals(list, other.list);
	}
	
	
	
	
}
