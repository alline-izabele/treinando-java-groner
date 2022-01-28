package com.alline.cursojava.aula15;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um valor");
		double x = ler.nextDouble();
		if(x >= 0) {
			System.out.println("Positivo");
		}else {
			System.out.println("Negativo");
		}
		ler.close();
	}
}
