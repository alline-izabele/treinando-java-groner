package com.alline.cursojava.aula13;

import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe dois números inteiros e um real: ");
		int a = ler.nextInt(), b = ler.nextInt();
		double c = ler.nextDouble();
		System.out.println((a * 2) * (b/2));
		System.out.println((a * 3) + c);
		System.out.println(Math.pow(c, 3));
		ler.close();
	}
}
