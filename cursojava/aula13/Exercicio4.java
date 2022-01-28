package com.alline.cursojava.aula13;

import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe as quatro notas do bimestre: ");
		double i1, i2, i3, i4;
		i1 = ler.nextDouble();
		i2 = ler.nextDouble();
		i3 = ler.nextDouble();
		i4 = ler.nextDouble();
		double media = (i1 + i2 + i3 + i4)/4;
		System.out.println("A média final é: " + media);
		ler.close();
	}
}
