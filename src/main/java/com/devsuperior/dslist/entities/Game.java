package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
//relacionando a classe ao BD
import jakarta.persistence.Entity; //configura essa classe como uma tabela do BDrelacional 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String title;
	
	@Column(name = "game_year") //mudando o nome de year, porque year é palavra reservada do sql
	private Integer year; 
	private String genre;
	private String plataform;
	private String imgUrl;
	private String shortDescription;
	private String longDesciption;
	
	
	public Game() {}


	public Game(long id, String title, Integer year, String genre, String plataform, String imgUrl,
			String shortDescription, String longDesciption) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.plataform = plataform;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDesciption = longDesciption;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Integer getYear() {
		return year;
	}


	public void setYear(Integer year) {
		this.year = year;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getPlataform() {
		return plataform;
	}


	public void setPlataform(String plataform) {
		this.plataform = plataform;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


	public String getShortDescription() {
		return shortDescription;
	}


	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}


	public String getLongDesciption() {
		return longDesciption;
	}


	public void setLongDesciption(String longDesciption) {
		this.longDesciption = longDesciption;
	}


	@Override
	public int hashCode() { //verifica se ytem games iguais na mesma lista 
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return id == other.id;
	}
	
	
	
}


