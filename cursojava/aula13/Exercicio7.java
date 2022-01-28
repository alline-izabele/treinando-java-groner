package com.alline.cursojava.aula13;

import java.util.Scanner;
public class Exercicio7 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe o lado do quadrado: ");
		double lado = ler.nextDouble();
		double dobro = (lado * lado) * 2;
		System.out.println("O dobro da area é: " + dobro);
		ler.close();
	}
}

