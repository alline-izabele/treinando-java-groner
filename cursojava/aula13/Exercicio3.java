package com.alline.cursojava.aula13;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe um número: ");
		int i1 = ler.nextInt();
		System.out.println("Informe mais um número: ");
		int i2 = ler.nextInt();
		System.out.println("A soma dos dois valores é: " + (i1 + i2));
	}
}
