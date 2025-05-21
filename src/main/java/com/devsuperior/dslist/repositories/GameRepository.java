package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository; //faz operações para comunicação e acesso a dados

import com.devsuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	
}
 