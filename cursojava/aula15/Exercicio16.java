package com.alline.cursojava.aula15;

import java.util.Scanner;
public class Exercicio16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite os valores de a, b e c respectivamente");
		int a = ler.nextInt();
		int b, c;
		double delta, raiz1, raiz2;
		if(a == 0) {
			System.out.println("Não é eq. do segundo grau");
			System.exit(0);
		}else{
			b = ler.nextInt();
			c = ler.nextInt();
			delta = (Math.pow(b, 2)) - 4*a*c;
			
			if(delta < 0) {
				System.out.println("Não possui raizes reais");
				System.exit(0);
			}else if (delta == 0){
				raiz1 = (-b - Math.sqrt(delta))/2*a;
				raiz2 = (-b + Math.sqrt(delta))/2*a;
				System.out.println("A raiz é: " + raiz1);
			}else {
				raiz1 = (-b + delta)/2*a;
				raiz2 = (-b - delta)/2*a;
				System.out.println("As raizes são "+ raiz1 + " e " + raiz2);
			}
		}
		
		ler.close();
	}
}
