package com.alline.cursojava.aula17;

import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt(), m = ler.nextInt(), total = n;
		for(int i = 1; i < m; i++) {
			total = total * n;
		}
		System.out.println(total);
	}
}
