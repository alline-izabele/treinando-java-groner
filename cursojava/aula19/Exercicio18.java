package com.alline.cursojava.aula19;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] idades = new int[10];
		int maior = 1, menor = 1, posicaoh = 0, posicaol = 0;
		for(int i = 0; i < idades.length; i++) {
			idades[i] = ler.nextInt();
		}
		for(int i = 0; i < idades.length; i++) {
			if(idades[i] > maior) {
				maior = idades[i];
				posicaoh = i;
			}
			if(idades[i] < menor) {
				menor = idades[i];
				posicaol = i;
			}
		}
		System.out.println("a maior idade é: " + maior);
		System.out.println("a posicao da maior idade é: " + posicaoh);
		System.out.println("a menor idade é: " + menor);
		System.out.println("a posicao da maior idade é: " + posicaol);
		ler.close();
	}

}
