package com.alline.cursojava.aula13;

import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double metros;
		double centimetros;
		System.out.println("Informe o valor em metros: ");
		metros = ler.nextDouble();
		centimetros = metros*100;
		System.out.println("O valor em centimetros é: " + centimetros);
	}
}
