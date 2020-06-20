package br.edu.fatecfranca.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="virus")
public class Virus {
	@Id
	private String id;
	private String nome, origem;
	private Float letalidade;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public Float getLetalidade() {
		return letalidade;
	}
	public void setLetalidade(Float letalidade) {
		this.letalidade = letalidade;
	}
	
	
}
