package com.alline.cursojava.aula17;

import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Coloque uma nota (0-10)");
		int nota;
		nota = ler.nextInt();
		while(nota <= 0 || nota >= 10) {
			System.out.println("valor invalido\ninsira outro");
			nota = ler.nextInt();
		}
		System.out.println("valor inserido");
		ler.close();
	}
}

