package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
//import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired //serve para compartilhar informações, métodos entre classes etc
	private GameRepository gameRepository; //injetando uma instância do gameRepository no game Service
	//injetando --> pegando informações do gameRpository e trazendo para a camada de serviço correspondente ao GameService
	
	
	//essa lista faz serialização
	public List<GameMinDTO> findAll(){
	 List<Game> result = gameRepository.findAll();  // gera uma consulta no BD e retorna todos os games e transforma no tipo GAME e guarda na lista Result
	 List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
	 return dto;
	}
	
}
