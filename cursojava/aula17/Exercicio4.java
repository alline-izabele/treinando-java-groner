package com.alline.cursojava.aula17;

import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anos = 0;
		double popA = 80000, popB = 200000;
		while(popA < popB) {
			popA += (popA/100) * 3;
			popB += (popB/100) * 1.5;
			anos++;
		}
		System.out.println(popA);
		System.out.println(popB);
		System.out.println(anos);
		ler.close();
	}
}