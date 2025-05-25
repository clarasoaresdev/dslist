package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository; //faz operações para comunicação e acesso a dados

import com.devsuperior.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
	
}
 