package com.alline.cursojava.aula13;

import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe a temperatura em Celsius: ");
		int c = ler.nextInt();
		double fah = (c * 1.8) + 32;
		System.out.println("A temperatura em Fahrenheit é: " + fah);
		ler.close();
	}
}
