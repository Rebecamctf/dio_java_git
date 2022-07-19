package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in); //entrada e saída de dados
		
		int a, b;
		
		System.out.println("Digite um valor:");
		a = scan.nextInt();
		System.out.println("Digite um valor:");
		b = scan.nextInt();
		
		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		int multiplicacao = multiplicacao(a, b);
		int divisao = divisao(a, b);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
	}

	public static int soma(int a, int b) {
		return a + b;
	}
	
	//DICA: ctrl+alt+seta para cima ou para baixo copia o bloco de codigo
	
	public static int subtracao(int a, int b) {
		return a - b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	public static int divisao(int a, int b) {
		return a / b;
	}
	
	
	
}

