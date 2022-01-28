package com.alline.cursojava.aula13;

import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe sua altura: ");
		double altura = ler.nextDouble();
		double pesoIdeal = (72.7 * altura) - 58;
		System.out.println("Seu peso ideal é: " + pesoIdeal);
		ler.close();
	}
}
