package com.alline.cursojava.aula17;

import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x, soma = 0 , media = 0;
		int i = 1, j = 5;
		for(; i <= j; i++) {
			System.out.println("insira o numero ");
			x = ler.nextInt();
			soma += x; 
			media = soma/i;
		}
		System.out.println("A soma: " + soma);
		System.out.println("A media: " + media);
	}
}
