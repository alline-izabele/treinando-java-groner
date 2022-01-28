package com.alline.cursojava.aula17;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tabuada = ler.nextInt();
		System.out.println("Tabuada do: " + tabuada);
		for(int i = 1, j = 10; i <= 10; i++) {
			System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
		}
	}
}
