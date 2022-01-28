package com.alline.cursojava.aula15;

import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double p1 = ler.nextDouble(), p2 = ler.nextDouble(), p3 = ler.nextDouble();
		double maisBarato;
		if(p1 < p2) {
			maisBarato = p1;
		}else {
			maisBarato = p2;
		}
		if(maisBarato > p3) {
			maisBarato = p3;
		}
		System.out.println("O produto que deve ser comprado custa: " + maisBarato);
		ler.close();
	}
}
