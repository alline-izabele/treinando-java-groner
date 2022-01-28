package com.alline.cursojava.aula15;

import java.util.Scanner;
public class Exercicio15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o comprimento dos 3 lados: ");
		double l1 = ler.nextDouble(), l2 = ler.nextDouble(), l3 = ler.nextDouble();
		if((l1 + l2) >= l3 || (l1 + l3) >= l2 || (l2 + l3) >= l1) {
			System.out.println("É um triangulo");
			if(l1 == l2 && l1 == l3) {
				System.out.println("Equilátero");
			}else if(l1 == l2 || l2 == l3 || l1 == l3) {
				System.out.println("Isosceles");
			}else {
				System.out.println("Escaleno");
			}
		}else {
			System.out.println("não forma triangulo");
		}
		ler.close();
	}
}
