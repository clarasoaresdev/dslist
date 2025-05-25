package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
//import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired //serve para compartilhar informações, métodos entre classes etc
	private GameRepository gameRepository; //injetando uma instância do gameRepository no game Service
	//injetando --> pegando informações do gameRpository e trazendo para a camada de serviço correspondente ao GameService
	
	
	@Transactional(readOnly = true) //não bloqueia dados para escrita 
	public GameDTO findById(Long id) { //id do game
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	
	//pratica que usa dentro do service, garantindo que a operação com o BD vai acontecer obedecendo os principios das transaões (ACID)
	@Transactional(readOnly = true) 			
	public List<GameMinDTO> findAll(){
	 List<Game> result = gameRepository.findAll();  // faz uma consulta no BD e retorna todos os games(obj) e transforma no tipo GAME e guarda na lista Result
	 List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
	 return dto;
	}
	
	
	
}
