package com.alline.cursojava.aula15;

import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1 = ler.nextInt(), n2 = ler.nextInt(), n3 = ler.nextInt();
		int maior, menor;
		if(n1 > n2) {
			maior = n1;
			menor = n2;
		}else {
			maior = n2;
			menor = n1;
		}
		if(n3 > maior) {
			maior = n3;
		}
		if (n3 < menor){
			menor = n3;
		}
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
		ler.close();
	}

}
