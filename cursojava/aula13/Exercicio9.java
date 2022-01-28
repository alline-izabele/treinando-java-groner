package com.alline.cursojava.aula13;

import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe a temperatura em Fahrenheit");
		double fah = ler.nextDouble();
		double c = (5 * (fah - 32)/9);
		System.out.println("A temperatura em Celsius é: " + c);
		ler.close();
	}
}
