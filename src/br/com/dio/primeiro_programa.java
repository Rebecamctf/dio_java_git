package br.com.dio;

import br.com.dio.model.Gato;

public class primeiro_programa {

	public static void main(String[] args) {
		
		//Gato gato = new Gato();
		Livros livros = new Livros();
		int a = 2;
		int b = 3;
		System.out.println("Hello world! " + (a+b));
		//System.out.println(gato);
	}

}

//criando uma class fora de outra class

class Livros {
	private String nome;
	private Integer npag;
}