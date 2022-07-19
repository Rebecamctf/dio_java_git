package br.com.dio.model;

public class Cachorro {
	private String nome;
	private String cor;
	public Cachorro() {
		super();
	}

	private Integer idade;
	
	public Cachorro(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}
}
