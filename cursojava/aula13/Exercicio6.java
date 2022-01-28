package com.alline.cursojava.aula13;

import java.util.Scanner;
public class Exercicio6 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe o raio: ");
		double raio = ler.nextDouble();
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println("A area é: " + area);
	}
}
