package com.alline.cursojava.aula15;

import  java.util.Scanner;
public class Exercicio1 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe dois números: ");
		double i1 = ler.nextDouble(), i2 = ler.nextDouble();
		double maior;
		if(i1 > i2) {
			maior = i1;
		}else {
			maior = i2;
		}
		System.out.println("O maior: " + maior);
		ler.close();
	}
}
